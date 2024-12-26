# 📝 **Inner Classes in Java**

## **Why Use Inner Classes?**

- **Logical Grouping:** If a class is only useful within another class, it’s logical to define it inside the parent class.
- **Encapsulation:** An inner class can access the private members of its enclosing (outer) class.
- **Improved Readability & Maintainability:** Grouping related classes together makes code cleaner and easier to maintain.

---

## **Types of Inner Classes**

### 1️⃣ **Non-Static Inner Class (Instance Inner Class)**

```java
class A {
    private int a;
    
    void printB() {
        B bObject = new B();
        System.out.println(bObject.b);
    }
    
    class B {
        private int b;
        
        void printA() {
            System.out.println(a);
        }
    }
}
```

#### ✅ **Key Points:**
- Every object of a **non-static inner class** must be associated with an object of its **enclosing class**.
- Inner class has access to **private members** of the outer class.
- Outer class has access to **private members** of the inner class.
- **Static members** cannot be defined inside a non-static inner class.
- **Static methods** in the outer class cannot directly create an object of the inner class.
- **Instantiation Syntax (Outside the Outer Class):**
  ```java
  A a = new A();
  A.B b = a.new B();
  ```
#### 🛡️ **Shadowing:**
If an inner class and an outer class have a variable with the same name, use:
```java
A.this.variableName;
```

---

### 2️⃣ **Static Inner Class**

```java
class A {
    private int a;
    
    static void printB() {
        B bObject = new B();
        System.out.println(bObject.b);
    }
    
    static class B {
        static private int b;
        
        void printA() {
            // System.out.println(a); // ❌ Cannot access non-static members of outer class.
        }
    }
}
```

#### ✅ **Key Points:**
- A **static inner class** does **not** require an object of the outer class to be instantiated.
  ```java
  A.B b = new A.B();
  ```
- Static inner classes can **only access static members** of the outer class.
- Static members **can be declared** inside the static inner class.
- A **static method** of the outer class can **create objects** of the static inner class.

---

### 3️⃣ **Local Inner Class**

- Defined **inside a method** of the outer class.
- **Scope:** Accessible **only within the method** where it's defined.
- Can **only access final or effectively final variables** from the enclosing method.

#### ✅ **Example:**
```java
class Outer {
    void display() {
        final int num = 10;
        
        class LocalInner {
            void print() {
                System.out.println("Number: " + num);
            }
        }
        
        LocalInner inner = new LocalInner();
        inner.print();
    }
}
```

#### ✅ **Key Points:**
- Local inner classes can only be instantiated **within the method** they are defined in.
- Can access **final or effectively final variables** from the enclosing method.

---

### 4️⃣ **Anonymous Inner Class**

- A **class without a name**, defined and instantiated **at the same time**.
- Commonly used to **implement interfaces** or **override methods** of an existing class.

#### ✅ **Example:**
```java
interface I {
    void test();
}

public class method_reference.Main {
    public static void main(String[] args) {
        I i = new I() {
            public void test() {
                helper();
                System.out.println("test");
            }
            
            void helper() {
                System.out.println("helper");
            }
        };
        
        i.test();
    }
}
```

#### ✅ **Key Points:**
- Cannot define a **constructor** in an anonymous class.
- Can **override methods** or provide an implementation for an **interface**.
- Used primarily for **event handling** or **thread creation**.

---

## 🛡️ **Access Modifiers for Inner Classes**

- **Public Inner Class:** Accessible everywhere the outer class is accessible.
- **Private Inner Class:** Accessible **only within the outer class**.
- **Default (Package-Private) Inner Class:** Accessible **within the same package**.

---

### 📚 **Comparison Table**

| Feature              | Non-Static Inner Class | Static Inner Class | Local Inner Class | Anonymous Inner Class |
|-----------------------|------------------------|---------------------|-------------------|-----------------------|
| **Access Outer Class Members** | All Members         | Only Static Members | Final Method Variables | Outer Class Members |
| **Instantiation**    | Requires Outer Object | No Outer Object Needed | Inside Method Only | Instantiated Inline |
| **Static Members**   | ❌ Not Allowed        | ✅ Allowed        | ❌ Not Allowed   | ❌ Not Allowed       |
| **Scope**            | Entire Class          | Entire Class       | Local to Method   | Inline Definition    |
| **Use Case**         | Logical Grouping      | Utility Class      | Method-Level Logic | Single-Use Class     |

