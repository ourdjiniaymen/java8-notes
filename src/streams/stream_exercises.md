# 🚀 **Challenging Java 8 Streams Exercises**

Below are three advanced exercises designed to test your understanding of **Streams**, **Collectors**, and functional programming principles in Java 8.

---

## 🧠 **Exercise 1: Employee Data Analysis**

### **Problem Statement:**
You have a list of **Employee** objects. Each **Employee** has:
- `id` (**int**)
- `name` (**String**)
- `department` (**String**)
- `salary` (**double**)
- `yearOfJoining` (**int**)

### **Tasks:**
1. Find the **highest-paid employee** in each department.
2. List the **names of employees** who joined **after 2020**, sorted by their **salary (descending)**.
3. **Group employees** by department and **count** how many employees are in each department.
4. Calculate the **average salary** of employees in each department.
5. Find the **total salary** paid across all departments.

---

## 🧠 **Exercise 2: Word Frequency Counter**

### **Problem Statement:**
You are given a `List<String>` of sentences. Write a program to:
1. **Count the frequency** of each word across all sentences (**case insensitive**).
2. Find the **top 3 most frequent words**.
3. **Filter out words shorter than 4 characters** before counting.

### **Example Input:**
```java
List<String> sentences = Arrays.asList(
    "Streams are powerful in Java",
    "Java Streams allow functional programming",
    "Functional programming in Java is fun"
);
```

### **Expected Output (Example Frequency Count):**
```text
java -> 3
streams -> 2
functional -> 2
programming -> 2
```

---

## 🧠 **Exercise 3: Transaction Analysis**

### **Problem Statement:**
You have a list of **Transaction** objects. Each **Transaction** has:
- `id` (**int**)
- `amount` (**double**)
- `type` (**DEPOSIT** or **WITHDRAWAL**)
- `status` (**SUCCESS** or **FAILED**)
- `timestamp` (**LocalDateTime**)

### **Tasks:**
1. Find the **total amount** of all **successful deposits**.
2. Get the **5 most recent failed transactions**.
3. Find the **average transaction amount** for **withdrawals**.
4. **Group transactions** by type (**DEPOSIT**, **WITHDRAWAL**) and **count** them.
5. Get the **transaction with the highest amount**.

---

## 📂 **Sample Classes for Exercises 1 & 3**

```java
class Employee {
    int id;
    String name;
    String department;
    double salary;
    int yearOfJoining;

    // Constructor, Getters, and toString()
}

class Transaction {
    int id;
    double amount;
    String type; // DEPOSIT, WITHDRAWAL
    String status; // SUCCESS, FAILED
    LocalDateTime timestamp;

    // Constructor, Getters, and toString()
}
```

---

## 🎯 **Instructions:**
- Use **Streams** and **Collectors** to perform the tasks.
- Avoid using **loops** or **mutable state** where possible.
- Ensure your code is **clean** and **readable**.
- Test with **edge cases**, e.g., empty lists or unusual data inputs.

Happy coding! 🚀✨
