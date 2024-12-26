package optional;

import utils.Address;
import utils.Person;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Exercise one
        System.out.println("----Exercise one----");
        System.out.println(exerciseOne(new Person(new Address("oklahoma"))).orElseGet(() -> "No city"));

        // Exercise two
        System.out.println("----Exercise two----");
        System.out.println(exerciseTwo(Optional.ofNullable("Aymen"), Optional.ofNullable("ou")));
    }

    public static Optional<String> exerciseOne(Person person) {
        /*
        Chaining Operations with map and flatMap
         */
        // Write a method that, given a Person, returns the name of the city where the person lives (if available),
        // wrapped in an Optional<String>. If the city is not available, return Optional.empty().
        return person.getAddress().map(Address::getCity).map(String::toUpperCase);
    }

    public static Optional<String> exerciseTwo(Optional<String> first, Optional<String> last) {
        /*
        Combining Multiple Optionals
         */
        return first.filter(f -> last.isPresent()).map(f -> f + " " + last.get());

    }


}
