package lambdas_Finterface_Mreference;

import utils.Book;
import utils.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise one - task one");
        exoOneTaskOne();
        System.out.println("Exercise one - task two");
        exoOneTaskTwo();
        System.out.println("Exercise two - task one");
        exoTwoTaskOne();
        System.out.println("Exercise two - task two");
        exoTwoTaskTwo();
        System.out.println("Exercise two - task three");
        exoTwoTaskThree();
    }

    public static void exoOneTaskOne() {
        /*
        Stream Pipeline
         */
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 87, 5, 9, 15));
        numbers.stream().filter(n -> n >= 10).map(n -> n * 2).forEach(System.out::println);
    }

    public static void exoOneTaskTwo() {
        /*
        Data Transformation
         */
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(
                new Book("b1", 476),
                new Book("b2", 201),
                new Book("b3", 200)));
        books.stream().filter(book -> book.getPages() > 200).
                map(Book::getTitle).
                sorted().
                forEach(System.out::println);
    }

    public static void exoTwoTaskOne() {
        /*
        List Transformation
         */
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Bob", "Alice", "John", "Tom"));
        names.stream().filter(
                        name -> name.length() >= 4
                ).
                map(name -> new StringBuilder(name).reverse().toString()).
                sorted().forEach(System.out::println);
    }

    public static void exoTwoTaskTwo() {
        /*
        Combine Multiple Interfaces
         */
        BinaryOperator<Integer> add = Integer::sum;
        BinaryOperator<Integer> subtract = (a, b) -> a - b;
        UnaryOperator<Integer> negate = a -> -a;
        int a = 10;
        a = negate.apply(a);
        System.out.println(a);
        a = add.apply(a, 10);
        System.out.println(a);
        a = subtract.apply(a, 2);
        System.out.println(a);
    }

    public static void exoTwoTaskThree() {
        /*
        grouping and Summing
         */
        List<Order> orders = Arrays.asList(
                new Order(
                        "Alice",
                        29.65
                ),
                new Order(
                        "Bob",
                        23.09
                ),
                new Order(
                        "Alice",
                        9.09
                )
        );

        orders.
                stream().
                collect(Collectors.groupingBy(Order::getCustomerName, Collectors.summingDouble(Order::getOrderTotal))).
                forEach((customerName, totalOrder) -> System.out.println(customerName + "->" + totalOrder));

    }
}
