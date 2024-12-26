package streams;

import utils.*;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 800.0, "Electronics"),
                new Product("Smartphone", 600.0, "Electronics"),
                new Product("Apple", 1.0, "Food"),
                new Product("Banana", 0.5, "Food"),
                new Product("Chair", 50.0, "Furniture"),
                new Product("Table", 150.0, "Furniture"));
        // FlatMap exercises
        System.out.println("Flat map - exercise one");
        fmExerciseOne();
        System.out.println("-------------------------");
        System.out.println("Flat map - exercise two");
        fmExerciseTwo();
        System.out.println("-------------------------");
        System.out.println("Flat map - exercise three");
        fmExerciseThree();
        System.out.println("-------------------------");

        // Collectors exercises
        System.out.println("Collectors - exercise one");
        collectorsExerciseOne(products);
        System.out.println("-------------------------");
        System.out.println("Collectors - exercise two");
        collectorsExerciseTwo(products);
        System.out.println("-------------------------");
        System.out.println("Collectors - exercise three");
        collectorsExerciseThree(products);
        System.out.println("-------------------------");
        System.out.println("Collectors - exercise four");
        collectorsExerciseFour(products);
        System.out.println("-------------------------");
        System.out.println("Collectors - exercise five");
        collectorsExerciseFive(products);
        System.out.println("-------------------------");
        System.out.println("Collectors - exercise six");
        collectorsExerciseSix(products);
        System.out.println("-------------------------");
        System.out.println("Collectors - exercise seven");
        collectorsExerciseSeven(products);
        System.out.println("-------------------------");
        System.out.println("Collectors - exercise eight");
        collectorsExerciseEight(products);
        System.out.println("-------------------------");
        System.out.println("Collectors - exercise nine");
        collectorsExerciseNine(products);
        System.out.println("-------------------------");
        System.out.println("Collectors - exercise ten");
        collectorsExerciseTen(products);
        System.out.println("-------------------------");
        System.out.println("Collectors - exercise eleven");
        collectorsExerciseEleven();
        System.out.println("-------------------------");
        System.out.println("Collectors - exercise twelve");
        collectorsExerciseTwelve(products);
        System.out.println("-------------------------");
        System.out.println("Collectors - exercise thirteen");
        collectorsExerciseThirteen();

        // Advanced exercises about streams
        System.out.println("-------------------------");
        System.out.println("Streams - exercise one");
        streamsExerciseOne();
        System.out.println("-------------------------");
        System.out.println("Streams - exercise two");
        streamsExerciseTwo();
        System.out.println("-------------------------");
        System.out.println("Streams - exercise three");
        streamsExerciseThree();
    }

    // FlatMap exercises
    public static void fmExerciseOne() {
        /*
        Flatten List of Lists
         */
        List<List<String>> words = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("apple", "orange", "banana"),
                Arrays.asList("grape", "kiwi")
        );
        System.out.println(
                words.
                        stream().
                        flatMap(List::stream).
                        distinct().
                        map(String::toUpperCase).
                        collect(Collectors.toList()));
    }

    public static void fmExerciseTwo() {
        /*
        Extract Unique Words from Sentences
         */
        List<String> sentences = Arrays.asList(
                "Java is fun!",
                "Streams are powerful, and Java is cool.",
                "Functional programming in Java."
        );
        System.out.println(sentences.stream().
                flatMap(sentence -> Arrays.stream(sentence.split(" "))).
                map(word -> word.replaceAll("[!,.]", "").toLowerCase()).
                collect(Collectors.toSet()));
    }

    public static void fmExerciseThree() {
        /*
        Flatten and Analyze Transactions
         */
        List<Customer> customers = Arrays.asList(
                new Customer("Alice", Arrays.asList(new Transaction("T1", 100, true), new Transaction("T2", 200, false))),
                new Customer("Bob", Arrays.asList(new Transaction("T3", 150, true), new Transaction("T4", 300, true)))
        );

        // sum of successful transactions
        Double sumOfSuccess = customers.stream().flatMap(
                        customer -> customer.getTransactions().stream()
                ).filter(Transaction::isSuccess).map(Transaction::getAmount).
                reduce(0.0, Double::sum);
        // count of transactions
        long count = customers.stream().mapToLong(
                customer -> customer.getTransactions().size()
        ).sum();
        double average = customers.stream().flatMap(
                customer -> customer.getTransactions().stream()
        ).mapToDouble(Transaction::getAmount).sum() / count;
        System.out.println("Total Successful Amount: " + sumOfSuccess);
        System.out.println("Average Transaction Amount: " + average);
    }

    // Collectors exercises
    public static void collectorsExerciseOne(List<Product> products) {
        /*
        Sum and Average of Prices
         */
        double sum = products.stream().mapToDouble(Product::getPrice).sum();
        double average = products.stream().collect(Collectors.averagingDouble(Product::getPrice));
        System.out.println("Total Price: " + sum);
        System.out.println("Average Price: " + average);
    }

    public static void collectorsExerciseTwo(List<Product> products) {
        /*
        Group Products by Category
         */
        Map<String, List<Product>> groupedProducts = products.stream().collect(
                Collectors.groupingBy(Product::getCategory)
        );
        System.out.println(groupedProducts);
    }

    public static void collectorsExerciseThree(List<Product> products) {
        /*
        Count Products by Category
         */
        Map<String, Long> productPerCategory = products
                .stream().
                collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
        System.out.println(productPerCategory);
    }

    public static void collectorsExerciseFour(List<Product> products) {
        /*
        Concatenate Product Names
         */
        String joinedNames = products.
                stream().
                map(Product::getName).
                collect(Collectors.joining(", "));
        System.out.println(joinedNames);
    }

    public static void collectorsExerciseFive(List<Product> products) {
        /*
        Find the Product with the Maximum Price
         */
        Product maxPriceProduct = products.
                stream().
                collect(Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))).get();
        System.out.println("Product with higher price " + maxPriceProduct);
    }

    public static void collectorsExerciseSix(List<Product> products) {
        /*
        Group Products by Price Range
         */
        System.out.println(products.stream().collect(
                Collectors.groupingBy(product ->
                        product.getPrice() < 50 ? "Cheap" : product.getPrice() < 100 ? "Affordable" : "Expensive"))
        );

    }

    public static void collectorsExerciseSeven(List<Product> products) {
        /*
        Partition Products into Expensive and Cheap
         */
        System.out.println(products.
                stream().
                collect(Collectors.partitioningBy(product -> product.getPrice() > 100)));
    }

    public static void collectorsExerciseEight(List<Product> products) {
        /*
        Summarize Products' Prices
         */
        System.out.println(products.
                stream().
                collect(Collectors.summarizingDouble(Product::getPrice)));
    }

    public static void collectorsExerciseNine(List<Product> products) {
        /*
        Reduce Products' Prices Using reducing()
        */
        double priceSum = products.
                stream().
                map(Product::getPrice).
                collect(Collectors.reducing(0.0, Double::sum));
        System.out.println("Sum of Prices: " + priceSum);
    }

    public static void collectorsExerciseTen(List<Product> products) {
        /*
         Create a Map of Product Names and Prices
         */
        System.out.println(products.
                stream().
                collect(
                        Collectors.toMap(Product::getName, Product::getPrice)
                ));
    }

    public static void collectorsExerciseEleven() {
        /*
         Flatten List of Lists and Extract Unique Words
         */
        List<List<String>> listOfWords = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("apple", "orange", "banana"),
                Arrays.asList("grape", "kiwi")
        );
        System.out.println(listOfWords.
                stream().
                flatMap(List::stream).
                collect(
                        Collectors.toSet()
                ));
    }

    public static void collectorsExerciseTwelve(List<Product> products) {
        /*
        Count Distinct Product Categories
         */
        System.out.println("Distinct Categories: " + products.
                stream().
                collect(Collectors.mapping(Product::getCategory, Collectors.toSet())).size());
    }

    public static void collectorsExerciseThirteen() {
        /*
        Partition Customers by Age Group
         */
        List<Customer> customers = Arrays.asList(
                new Customer("Alice", 29),
                new Customer("Bob", 34),
                new Customer("John", 40),
                new Customer("Charlie", 22)
        );
        System.out.println(customers.
                stream().
                collect(Collectors.partitioningBy(c -> c.getAge() > 30)));
    }

    // Advanced exercises about streams
    public static void streamsExerciseOne() {
        /*
        Employee Data Analysis
         */
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "IT", 60000, 2023),
                new Employee(2, "Bob", "HR", 55000, 2018),
                new Employee(3, "Charlie", "Finance", 75000, 2012),
                new Employee(4, "David", "IT", 68000, 2017),
                new Employee(5, "Eva", "Sales", 50000, 2021)
        );
        // Task one : Find the highest-paid employee in each department.
        Map<String, Optional<Employee>> highestPaidEmployees = employees.
                stream().
                collect(Collectors.
                        groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println("Highest-paid employee in each department\n" + highestPaidEmployees);
        System.out.println("-----------");
        //Task two : List the names of employees who joined after 2020, sorted by their salary (descending).
        List<String> namesAfter2020 = employees.
                stream().
                filter(e -> e.getYearOfJoining() > 2020).
                sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).
                map(Employee::getName).
                collect(Collectors.toList());
        System.out.println("List the names of employees who joined after 2020, sorted by their salary (descending)\n" + namesAfter2020);
        System.out.println("-----------");
        //Task three : Group employees by department and count how many employees are in each department.
        Map<String, Long> numberOfEmployeesByDep = employees.
                stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("Number of employees in each department\n" + numberOfEmployeesByDep);
        System.out.println("-----------");
        //Task four : Calculate the average salary of employees in each department.
        Map<String, Double> averageSalaryByDep = employees.
                stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average salary of employees in each department\n" + averageSalaryByDep);
        System.out.println("-----------");
        //Task five : Find the total salary paid across all departments.
        Map<String, Double> totalSalaryByDep = employees.
                stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        System.out.println("Total salary paid across all departments\n" + totalSalaryByDep);
    }

    public static void streamsExerciseTwo() {
        /*
        Word Frequency Counter
         */
        List<String> sentences = Arrays.asList(
                "Streams are powerful in Java",
                "Java Streams allow functional programming",
                "Functional programming in Java is fun"
        );
        //Task one : Count the frequency of each word across all sentences (case insensitive).
        Map<String, Long> wordsFrequency = sentences.
                stream().
                flatMap(sentence -> Arrays.stream(sentence.split(" "))).
                collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
        System.out.println("Frequency of each word across all sentences\n" + wordsFrequency);
        System.out.println("-----------");
        //Task two : Find the top 3 most frequent words.
        List<String> topThreeFrequent = sentences.
                stream().
                flatMap(sentence -> Arrays.stream(sentence.split(" "))).
                collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting())).
                entrySet().stream().sorted((e1, e2) -> Math.toIntExact(e2.getValue() - e1.getValue())).
                map(Map.Entry::getKey).limit(3).collect(Collectors.toList());

        System.out.println("Top 3 most frequent words\n" + topThreeFrequent);
        System.out.println("-----------");
        //Task three : Filter out words shorter than 4 characters before counting.
        Map<String, Long> filteredCount = sentences.
                stream().
                flatMap(sentence -> Arrays.stream(sentence.split(" "))).
                filter(s -> s.length() >= 4).
                collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        System.out.println("Frequency of words longer than 3 characters\n" + filteredCount);
    }

    public static void streamsExerciseThree() {
        /*
        Transaction Analysis
         */

        List<Transaction> transactions = Arrays.asList(
                new Transaction(150.75, true, TransactionType.DEPOSIT, LocalDateTime.now().minusDays(1)),
                new Transaction(250.50, false, TransactionType.WITHDRAWAL, LocalDateTime.now().minusHours(5)),
                new Transaction(500.00, true, TransactionType.DEPOSIT, LocalDateTime.now().minusMinutes(30)),
                new Transaction(75.25, false, TransactionType.WITHDRAWAL, LocalDateTime.now().minusWeeks(1)),
                new Transaction(1000.00, true, TransactionType.DEPOSIT, LocalDateTime.now().minusDays(3)),
                new Transaction(200.00, true, TransactionType.DEPOSIT, LocalDateTime.now().minusMonths(1)),
                new Transaction(300.50, false, TransactionType.WITHDRAWAL, LocalDateTime.now().minusDays(10)),
                new Transaction(50.25, true, TransactionType.WITHDRAWAL, LocalDateTime.now().minusHours(12)),
                new Transaction(99.99, false, TransactionType.WITHDRAWAL, LocalDateTime.now().minusWeeks(2)),
                new Transaction(450.75, false, TransactionType.DEPOSIT, LocalDateTime.now().minusMonths(2))
        );

        //Task one : Find the total amount of all successful deposits.
        double totalSuccessDeposit = transactions.
                stream().
                filter(t -> t.isSuccess() && t.getType().equals(TransactionType.DEPOSIT)).
                mapToDouble(Transaction::getAmount).sum();
        System.out.println("Total amount of all successful deposits\n" + totalSuccessDeposit);
        System.out.println("-----------");

        //Task two : Get the 5 most recent failed transactions.
        List<Transaction> recentFailed = transactions.
                stream().
                filter(t -> !t.isSuccess()).
                sorted(Comparator.comparing(Transaction::getTimestamp).reversed()).
                limit(5).collect(Collectors.toList());
        System.out.println("The 5 most recent failed transactions\n" + recentFailed);
        System.out.println("-----------");

        //Task three : Find the average transaction amount for withdrawals.
        double averageWithdrawals = transactions.
                stream().
                filter(t -> t.getType().equals(TransactionType.WITHDRAWAL)).
                mapToDouble(Transaction::getAmount).
                average().orElse(0);

        System.out.println("Average transaction amount for withdrawals\n" + averageWithdrawals);
        System.out.println("-----------");

        //Task four : Group transactions by type (DEPOSIT, WITHDRAWAL) and count them.
        Map<TransactionType, Long> groupedTransactionsByType = transactions.
                stream().
                collect(Collectors.groupingBy(Transaction::getType, Collectors.counting()));

        System.out.println("Count of transactions by type\n" + groupedTransactionsByType);
        System.out.println("-----------");

        //Task five : Get the transaction with the highest amount.
        Transaction highestAmountTransaction = transactions.
                stream().
                max(Comparator.comparingDouble(Transaction::getAmount)).get();

        System.out.println("Transaction with the highest amount\n" + highestAmountTransaction);

    }
}

