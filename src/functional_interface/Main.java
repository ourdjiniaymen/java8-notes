package functional_interface;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        taskOne("random String");
        taskTwo("Hello");
    }

    static void taskOne(String value) {
        /*
        Custom Functional Interface
        */

        // Convert the string to uppercase using anonymous class
        StringOperator stringToUppercase = new StringOperator() {
            public String apply(String input) {
                return input.toUpperCase();
            }
        };

        // Convert the string to lowercase using method reference
        StringOperator stringToLowerCase = String::toLowerCase;

        // Convert the string to lowercase using lambda
        StringOperator reverseString = input -> new StringBuilder(input).reverse().toString();

        System.out.println("--- Task one ---");
        System.out.println("Uppercase for " + value + " : " + stringToUppercase.apply(value));
        System.out.println("Lowercase for " + value + " : " + stringToLowerCase.apply(value));
        System.out.println("Reverse of " + value + " : " + reverseString.apply(value));
    }

    static void taskTwo(String value) {
        /*
         Use Predicate and Consumer
         */
        // Predicate: Write a Predicate to check if a string contains more than 5 characters.
        Predicate<String> checkLength = input -> input.length() > 5;

        // Consumer: Write a Consumer that takes a string and prints it in a formatted way, like "String: [your_string]".
        Consumer<String> formatString = input -> System.out.println("String: [" + input + "]");

        System.out.println("--- Task two ---");
        System.out.println(checkLength.test(value) ? value + " contains more than five characters" : value + " is five characters or less");
        formatString.accept(value);
    }
}

@FunctionalInterface
interface StringOperator {
    String apply(String input);
}

@FunctionalInterface
interface MyPredicate<T>{
    boolean test(T t);
}

@FunctionalInterface
interface MyFunction<T, R>{
    R apply(T t);
}
@FunctionalInterface
interface MyConsumer<T>{
    void accept(T t);
}

@FunctionalInterface
interface MyRunnable{
    void run();
}

@FunctionalInterface
interface MySupplier<R>{
    R get();
}