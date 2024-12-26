package utils;

import java.util.List;

public class Customer {
    private String name;
    private int age;
    private List<Transaction> transactions;

    public Customer(String name, List<Transaction> transactions, int age) {
        this.name = name;
        this.age = age;
        this.transactions = transactions;
    }

    public Customer(String name, List<Transaction> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
