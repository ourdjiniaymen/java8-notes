package method_reference;

import utils.Person;
import utils.Product;

import java.util.*;
import java.util.function.BiFunction;

class Main {
    public static void main(String[] args) {
        taskOne();
        System.out.println("---------");
        taskTwo();
        System.out.println("---------");
        taskThree();
    }

    public static void taskOne() {
        /*
        Method Reference for Sorting
         */
        List<Person> persons = Arrays.asList(new Person("Bob", 43), new Person("John", 60), new Person("Ugo", 33));
        persons.sort(Comparator.comparingInt(Person::getAge));
        persons.forEach(System.out::println);
    }

    public static void taskTwo() {
         /*
        Method Reference for Conversion
         */
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hello", "world"));
        words.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public static void taskThree() {
         /*
        Constructor Method Reference
         */
        List<String> names = Arrays.asList("Apple", "Banana");
        List<Double> prices = Arrays.asList(1.5, 0.8);

        ArrayList<Product> products = new ArrayList<>();
        BiFunction<String, Double, Product> productCreator = Product::new;
        for (int i = 0; i < names.size(); i++) {
            products.add(productCreator.apply(names.get(i), prices.get(i)));
        }

        products.forEach(System.out::println);
    }
}




