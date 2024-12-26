### 🚀 **Functional Interfaces in Java 8**

In Java 8, **Functional Interfaces** are a cornerstone for building clean, concise, and expressive code with **Lambda Expressions** and **Method References**.

---

## 📚 **1. What is a Functional Interface?**

A **Functional Interface** is an interface that contains **exactly one abstract method**.

- It can have **default methods** and **static methods** (Java 8+).
- It is used as a **target type** for Lambda Expressions and Method References.
- Marked with the **`@FunctionalInterface`** annotation *(optional but recommended for clarity and compiler checks)*.

---

## ✅ **2. Key Characteristics of Functional Interfaces**

1️⃣ **Single Abstract Method (SAM)**
- Must have **only one abstract method**.
- Known as the **SAM Interface (Single Abstract Method Interface)**.

2️⃣ **@FunctionalInterface Annotation**
- Ensures the interface adheres to the **one abstract method** rule.
- Compilation error if more than one abstract method is declared.

3️⃣ **Can have Default and Static Methods**
- These do not count towards the single abstract method rule.

4️⃣ **Used with Lambdas & Method References**
- Lambdas and Method References are implementations of Functional Interfaces.

---

## ✅ **3. Examples of Built-in Functional Interfaces**

Java 8 provides several built-in functional interfaces in the **`java.util.function`** package:

| Interface   | Abstract Method       | Description                       |
|-------------|------------------------|-----------------------------------|
| `Predicate<T>` | `boolean test(T t)`    | Evaluates a condition and returns true/false |
| `Function<T, R>` | `R apply(T t)`       | Applies a function and returns a result |
| `Consumer<T>`  | `void accept(T t)`   | Performs an action on an argument |
| `Supplier<T>`  | `T get()`            | Supplies a value with no input |
| `Runnable`     | `void run()`         | Executes a block of code (no input/output) |

---

## ✅ **4. Custom Functional Interface Example**

### 🛠️ **Example: Creating a Functional Interface**
```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b); // Single Abstract Method
}
```

### 🛠️ **Using Lambda Expression**
```java
public class method_reference.Main {
    public static void main(String[] args) {
        // Using a Lambda Expression
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;

        System.out.println("Addition: " + add.calculate(5, 3)); // Output: 8
        System.out.println("Subtraction: " + subtract.calculate(5, 3)); // Output: 2
    }
}
```

### 🛠️ **Using Method Reference**
```java
class MathOperations {
    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class method_reference.Main {
    public static void main(String[] args) {
        Calculator multiply = MathOperations::multiply; // Method Reference
        System.out.println("Multiplication: " + multiply.calculate(5, 3)); // Output: 15
    }
}
```

---

## ✅ **5. Why Use Functional Interfaces?**

- 📦 **Simpler Code:** Reduces boilerplate code (no need for anonymous inner classes).
- 🚀 **Readability:** More expressive and cleaner syntax.
- ⚡ **Interoperability:** Used extensively in **Streams API** and **Parallel Programming**.
- 🔄 **Reusable Logic:** Easily pass behavior (functions) as parameters.

---

## ✅ **6. @FunctionalInterface Annotation in Detail**

The **`@FunctionalInterface`** annotation helps ensure that:
- The interface contains **exactly one abstract method**.
- If you accidentally add a second abstract method, the compiler will show an **error**.

### 🛠️ **Invalid Example**
```java
@FunctionalInterface
interface InvalidInterface {
    void method1();
    void method2(); // Compilation Error: Invalid functional interface
}
```

---

## ✅ **7. Comparison: Anonymous Class vs Lambda**

| Feature              | Anonymous Class          | Lambda Expression    |
|-----------------------|--------------------------|-----------------------|
| **Boilerplate**      | Verbose syntax           | Concise syntax       |
| **Readability**      | Harder to read           | Cleaner and readable |
| **Object Creation**  | Creates an object        | No object overhead   |
| **Target Type**      | Explicit Interface/Class | Inferred from context|

---

