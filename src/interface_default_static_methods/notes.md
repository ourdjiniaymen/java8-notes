
# 🚀 **Java 8 Interfaces Cheatsheet**

## 📚 **1. Default Methods in Interfaces**
- Introduced in **Java 8**.
- Allows methods with **default implementations** in interfaces.
- Use `default` keyword.

### ✅ **Syntax**
```java
interface MyInterface {
    default void greet() {
        System.out.println("Hello from Interface!");
    }
}
```

### ✅ **Usage in a Class**
A class can use the default method directly without overriding.

```java
class MyClass implements MyInterface {
    // No need to override greet()
}
```

### ✅ **Override Default Method**
The class can override the default method if needed.

```java
@Override
public void greet() {
    System.out.println("Custom Greeting!");
}
```

## 🛠️ **2. Static Methods in Interfaces**
- Declared with the `static` keyword.
- Can only be called using the interface name.
- Not inherited by implementing classes.

### ✅ **Syntax**
```java
interface MyInterface {
    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}
```

### ✅ **Usage**
```java
MyInterface.staticMethod(); // Correct
```

## ⚠️ **3. Diamond Problem**
- Occurs when a class implements multiple interfaces with a default method of the same name and signature.
- Compiler Error if the method isn't explicitly resolved.

### ✅ **Example**
```java
interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {
    @Override
    public void show() {
        A.super.show(); // Explicit resolution
    }
}
```

### ✅ **Resolution**
Use `InterfaceName.super.methodName()` to explicitly specify which interface method to call.

## 🧠 **4. Key Differences Between Default and Static Methods**

| Aspect        | Default Method        | Static Method        |
| ------------- | --------------------- | -------------------- |
| **Keyword**   | `default`             | `static`             |
| **Inheritance**| Inherited by subclasses | Not inherited       |
| **Call Syntax**| `object.method()`      | `InterfaceName.method()` |
| **Purpose**   | Add functionality to interfaces | Utility methods   |

## 🔑 **5. Key Takeaways**
- **Default Methods**: Allow backward compatibility for interface updates.
- **Static Methods**: Utility methods within interfaces.
- **Diamond Problem**: Solved using `InterfaceName.super.methodName()`.
- Stay consistent with your syntax and resolve conflicts explicitly to avoid ambiguity! 💻✨

# Java Interface Attributes (Fields)

In Java, interfaces can have attributes (also called fields), but there are certain rules regarding them:

### Static and Final
Any attribute in an interface is implicitly **public**, **static**, and **final**. This means that:

- **public**: The field is accessible from anywhere.
- **static**: The field belongs to the interface itself, not instances of the interface.
- **final**: The field is constant and cannot be modified once assigned a value.

### No Instance Variables
You cannot have instance variables in an interface, meaning you cannot have fields that belong to an instance of a class that implements the interface.

---

## Example of an Interface with Attributes:

```java
interface MyInterface {
    // Constant attributes (implicitly public, static, final)
    int MAX_SIZE = 100;
    String GREETING = "Hello, world!";
    
    // Abstract method (No default or static methods here)
    void printMessage();
}

class MyClass implements MyInterface {
    @Override
    public void printMessage() {
        System.out.println(GREETING); // Using the interface's constant field
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Max size: " + MyInterface.MAX_SIZE); // Accessing the interface's field directly
        MyClass obj = new MyClass();
        obj.printMessage(); // Output: Hello, world!
    }
}
```
## Key Points:
- Any attributes in an interface are implicitly **public**, **static**, and **final**, making them constants.
- The interface does not allow instance variables or non-constant fields.

---

## Can We Modify Attributes in Interfaces?
No, because attributes in interfaces are **final**, meaning they cannot be modified after being assigned a value. If you need fields that can change, they should be defined in a class, not an interface.