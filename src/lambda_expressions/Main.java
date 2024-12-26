package lambda_expressions;


import utils.Person;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Bob", 26));
        persons.add(new Person("John", 18));
        persons.add(new Person("Alice", 16));

        taskOne(persons);
        System.out.println();
        taskThree("Hello ", "world!");
    }

    static void taskOne(ArrayList<Person> persons) {
        /*
        Sorting and Filtering
         */
        persons.removeIf(person -> person.getAge() < 18);
        persons.sort((p1, p2) -> p2.getAge() - p1.getAge());
        persons.forEach(person -> System.out.print(person.getName() + " "));
    }

    static ArrayList<String> taskTwo(ArrayList<Integer> listOfIntegers) {
        /*
        Apply a Function
         */
        Function<Integer, String> toString = intValue ->String.valueOf(intValue);
        ArrayList<String> result = new ArrayList<>();
        for (Integer listOfInteger : listOfIntegers) {
            result.add(toString.apply(listOfInteger));
        }
        return result;
    }

    static  void taskThree(String sOne, String sTwo){
        BiFunction<String, String, String> concatenate = (u, v) -> u+v;
        System.out.println(concatenate.apply(sOne, sTwo));
    }
}


