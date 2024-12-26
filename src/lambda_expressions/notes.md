# 🚀 **Lambda Expressions in Java 8**

Lambda expressions are one of the most powerful features introduced in **Java 8**, enabling concise and expressive code, especially when working with **Functional Interfaces**.

---

## ✅ **1. What is a Lambda Expression?**
- A **lambda expression** is an **anonymous function** used to implement a **Functional Interface**.
- It provides a **shorter syntax** for writing **inline implementations** of interfaces with a **Single Abstract Method (SAM)**.
- **Lambda Syntax:**
   ```java
   (parameters) -> expression
   (parameters) -> { statements; }
   ```

---

## ✅ **2. Key Characteristics of Lambda Expressions**
1. **Concise Syntax:** Write less boilerplate code.
2. **Eliminate Anonymous Inner Classes:** Replace verbose inner classes with inline behavior.
3. **Type Inference:** The compiler can infer parameter types.
4. **Functional Interface Dependency:** A lambda expression always targets a **functional interface**.

---

## ✅ **3. Syntax of Lambda Expressions**
There are **three common syntaxes** for lambdas:

1. **No Parameters:**
   ```java
   () -> System.out.println("Hello, Lambda!");
   ```

2. **One Parameter (Type Inferred):**
   ```java
   x -> x * x;
   ```

3. **Multiple Parameters:**
   ```java
   (a, b) -> a + b;
   ```

4. **With Code Block (Multiple Statements):**
   ```java
   (a, b) -> {
       System.out.println("Adding numbers");
       return a + b;
   };
   ```

---

## ✅ **4. Using Lambda with Functional Interfaces**
### 🛠️ **Example: Runnable Interface (No Parameters)**
```java
Runnable r = () -> System.out.println("Thread is running!");
new Thread(r).start();
```

### 🛠️ **Example: Comparator Interface (Multiple Parameters)**
```java
Comparator<Integer> compare = (a, b) -> a - b;
System.out.println(compare.compare(5, 3)); // Output: 2
```

### 🛠️ **Example: Predicate Interface (Single Parameter)**
```java
Predicate<Integer> isEven = number -> number % 2 == 0;
System.out.println(isEven.test(4)); // Output: true
```

---

## ✅ **5. Method Body in Lambda**
- **Single Expression:** No need for curly braces.
- **Multiple Statements:** Enclose them in curly braces `{}`.

**Example:**
```java
Consumer<String> print = message -> {
    System.out.println("Message: " + message);
    System.out.println("Printed Successfully");
};
print.accept("Hello!");
```

---

## ✅ **6. Scope in Lambda Expressions**
- Lambdas can **access local variables**, but only if they are **final** or **effectively final**.
- Lambdas have **no own scope**; they share the scope of their enclosing block.

**Example:**
```java
int value = 10;
Runnable r = () -> System.out.println(value); // Valid because `value` is effectively final
r.run();
```

---

## ✅ **7. Functional Interface + Lambda Example**
### **Custom Functional Interface:**
```java
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class method_reference.Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println(add.operate(5, 3)); // Output: 8
        System.out.println(multiply.operate(5, 3)); // Output: 15
    }
}
```

---

## ✅ **8. Why Use Lambdas?**
- 📦 **Reduced Boilerplate Code:** Eliminates anonymous inner class overhead.
- 🚀 **Improved Readability:** Clear, focused expressions.
- ⚡ **Functional Programming:** Enables declarative coding style.
- 🔄 **Interoperability with Collections API:** Streamlined processing of data using **Stream API**.

---

## ✅ **9. Common Mistakes to Avoid**
❌ **Using more than one abstract method in the target interface:** Ensure you're using a **Functional Interface**.
❌ **Variable Mutability:** Avoid modifying local variables in lambda scope unless they're **final/effectively final**.
❌ **Overusing Lambdas:** For highly complex operations, prefer named methods or classes for clarity.

---

## ✅ **10. Summary**
- **Lambda expressions** make your code **cleaner, more concise, and easier to read**.
- They are used exclusively with **Functional Interfaces**.
- Improve **productivity** and **code maintainability**.

Let me know if you'd like to dive deeper or see more examples! 🚀😊
