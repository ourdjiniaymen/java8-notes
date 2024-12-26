# 🚀 **Java Streams `flatMap` Exercises**

Here are **three exercises** to help you practice and master `flatMap` in Java Streams. They range from basic to challenging.

---

## 🧠 **Exercise 1: Flatten List of Lists**

### **Problem Statement:**
You have a `List<List<String>>` containing multiple lists of words.

### **Tasks:**
1. Use `flatMap` to **flatten** the nested lists into a **single list of words**.
2. Remove duplicate words.
3. Convert all words to **uppercase**.

**Example Input:**
```java
List<List<String>> words = Arrays.asList(
    Arrays.asList("apple", "banana"),
    Arrays.asList("apple", "orange", "banana"),
    Arrays.asList("grape", "kiwi")
);
```
**Expected Output:**
```java
[APPLE, BANANA, ORANGE, GRAPE, KIWI]
```
------------------------
# Exercise 2: Extract Unique Words from Sentences

## Problem Statement:
You have a `List<String>` of sentences.

### Tasks:
- Use `flatMap` to split each sentence into words.
- Remove punctuation and make all words lowercase.
- Collect unique words into a `Set<String>`.

### Example Input:

```java
List<String> sentences = Arrays.asList(
    "Java is fun!",
    "Streams are powerful, and Java is cool.",
    "Functional programming in Java."
);
```
**Expected Output:**
```java
[java, is, fun, streams, are, powerful, and, cool, functional, programming, in]
```

------------------
# Exercise 3: Flatten and Analyze Transactions

## Problem Statement:
You have a `List<Customer>` where each customer has a `List<Transaction>`.

### `Transaction` Class:

```java
class Transaction {
    String id;
    double amount;
    boolean success;

    // Constructor, Getters, Setters
}
class Customer {
    String name;
    List<Transaction> transactions;

    // Constructor, Getters, Setters
}
```

### Tasks:
- Use flatMap to get all transactions across all customers into a single stream.
- Find the total amount of all successful transactions.
- Find the average transaction amount.
### Example Input:

```java
List<Customer> customers = Arrays.asList(
        new Customer("Alice", Arrays.asList(new Transaction("T1", 100, true), new Transaction("T2", 200, false))),
        new Customer("Bob", Arrays.asList(new Transaction("T3", 150, true), new Transaction("T4", 300, true)))
        );

```
**Expected Output:**
```cmd
Total Successful Amount: 550.0
Average Transaction Amount: 187.5
```