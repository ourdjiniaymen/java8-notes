package optional;

import utils.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Exercise one
        System.out.println("----Exercise one----");
        System.out.println(exerciseOne(new Person(new Address("oklahoma"))).orElseGet(() -> "No city"));

        // Exercise two
        System.out.println("----Exercise two----");
        System.out.println(exerciseTwo(Optional.ofNullable("Aymen"), Optional.ofNullable("ou")));

        // Exercise three
        System.out.println("----Exercise three----");
        System.out.println(exerciseThree(Optional.ofNullable(null)));

        // Exercise four
        System.out.println("----Exercise four part one----");
        System.out.println(exerciseFourPartOne(1));
        System.out.println("----Exercise four part two----");
        System.out.println(exerciseFourPartTwo(4));

        // Exercise five
        System.out.println("----Exercise five----");
        System.out.println(exerciseFive(Optional.of("5")));

        // Exercise six
        System.out.println("----Exercise six----");
        System.out.println(exerciseSix(Arrays.asList(Optional.of(5), Optional.empty(), Optional.of(10), Optional.of(15))));

        // Exercise seven
        System.out.println("----Exercise seven----");
        Address address = new Address();
        address.setStreet("street");
        System.out.println(exerciseSeven(new Person(address)));

        // Exercise eight
        System.out.println("----Exercise eight----");
        System.out.println(exerciseEight("S1"));

        // Exercise eight
        System.out.println("----Exercise nine----");
        System.out.println(exerciseNine(new User(new Profile(new ProfileDetails("email")))));
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

    public static String exerciseThree(Optional<String> email) {
        /*
        Handling Default Values with orElse and orElseGet
         */
        // return email.orElse("default@example.com")
        return email.orElseGet(() -> "default@example.com");
    }

    public static Optional<User> exerciseFourPartOne(int id) {
        /*
        Optional and Exception Handling
         */
        //Write a method that, given a Person, returns the name of the city where the person lives (if available), wrapped in an Optional<String>.
        // If the city is not available, return Optional.empty().
        Map<Integer, User> users = new HashMap<Integer, User>() {{
            put(1, new User("John doe"));
            put(2, new User("Jane Smith"));
        }};
        return Optional.ofNullable(users.get(id));

    }

    public static String exerciseFourPartTwo(int id) {
        /*
        Optional and Exception Handling
         */
        // Write another method that, given the user ID, either:
        // Returns the user's name if they exist.
        //Returns a default message ("User not found") if the user does not exist.
        Map<Integer, User> users = new HashMap<Integer, User>() {{
            put(1, new User("John doe"));
            put(2, new User("Jane Smith"));
        }};
        return Optional.ofNullable(users.get(id)).map(User::getName).orElseGet(() -> "User not found");
    }

    public static Optional<String> exerciseFive(Optional<String> phoneNumber) {
        /*
        Optional with filter and map
         */
        return phoneNumber.map(p -> p.replaceAll("\\D+", "")).filter(p -> !p.isEmpty());

    }

    public static Optional<Integer> exerciseSix(List<Optional<Integer>> numbers) {
        /*
        Combining Multiple Optionals with reduce
         */
        return numbers.
                stream().
                reduce(Optional.of(0), (n1, n2) -> Optional.of(n1.orElse(0) + n2.orElse(0)));

    }

    public static Optional<String> exerciseSeven(Person person) {
        /*
        Optional with Complex Object Transformation
         */
        return person.getAddress().flatMap(Address::getStreet).filter(s -> !s.isEmpty()).map(String::toUpperCase);
    }

    public static String exerciseEight(String setting) {
        /*
        Optional and ifPresentOrElse
         */
        Map<String, String> settings = new HashMap<String, String>() {{
            put("S1", "V1");
        }};
        return Optional.ofNullable(settings.get(setting)).orElse("Setting not available");
    }

    public static Optional<String> exerciseNine(User user) {
    return user.getProfile().flatMap(Profile::getProfileDetails).flatMap(ProfileDetails::getEmail);

    }
}
