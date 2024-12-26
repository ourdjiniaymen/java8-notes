package utils;

import java.util.Optional;

public class Person {
    private String name;
    private int age;

    private Address address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Address address) {
        this.address = address;
    }

    public Person() {
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

