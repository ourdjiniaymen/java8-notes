# 📚 **Functions as First-Class Citizens in Java**

## 🚀 **Key Idea: Functions in Java**
- In Java, **functions are not first-class citizens** (unlike Kotlin or JavaScript).
- Java uses **Functional Interfaces** to **simulate functions as objects**.

---

## 🔑 **Functional Interface: The "Function Object"**
- A **functional interface** is an interface with **exactly one abstract method (SAM - Single Abstract Method)**.
- It acts as a **"function object"** in Java.
- Examples: `Predicate<T>`, `Function<T, R>`, `Consumer<T>`, `Supplier<R>`.

---

## 🛠️ **Initialization of Functional Interfaces**
Functional interfaces can be implemented in three ways:

1. **Lambda Expression:**
   ```java
      Function<String, Integer> length = str -> str.length();
   ```
2. **Method Reference:**
   ```java
        Function<String, Integer> length = String::length;
   ```
3. **Anonymous Class:**
   ```java
    Function<String, Integer> length = new Function<String, Integer>() {
        @Override
        public Integer apply(String str) {
            return str.length();
    }
   };
   ```
All three achieve the **same result**.

## 🔄 **Passing and Returning Functions**
- You can pass **interfaces as arguments** to methods. 
- You can return **functional interfaces from methods**.
```java
Function<String, String> getFormatter() {
    return str -> str.toUpperCase();
}

void processString(Function<String, String> formatter) {
    System.out.println(formatter.apply("hello"));
}
```

## 🧠 **Key Takeaway:**
- Java uses Functional Interfaces to simulate functions as objects.
- These interfaces can be initialized with lambdas, method references, or anonymous classes.
- They can be passed to and returned from methods, enabling functional programming patterns.