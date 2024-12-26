# Method References in Java 8

In Java 8, **method references** are a shorthand for calling methods using an existing method, instead of using a lambda expression. They provide a more concise and readable alternative when the lambda expression simply calls a method.

## Types of Method References

Java 8 supports **four types** of method references:

### 1. **Static Method Reference**

Refers to a static method of a class.

#### Syntax:
```java
ClassName::staticMethodName
```

#### Example:
```java
class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class method_reference.Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> addMethodRef = MathOperations::add;
        System.out.println(addMethodRef.apply(5, 3)); // Output: 8
    }
}
```

### 2. **Instance Method Reference (on an object)**

Refers to an instance method of a specific object.

#### Syntax:
```java
instance::instanceMethodName
```

#### Example:
```java
class Printer {
    public void printMessage(String message) {
        System.out.println(message);
    }
}

public class method_reference.Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Consumer<String> printMethodRef = printer::printMessage;
        printMethodRef.accept("Hello from Method Reference!"); // Output: Hello from Method Reference!
    }
}
```

### 3. **Instance Method Reference (on a class type)**

Refers to an instance method of an object, but Java will use an instance of the class automatically.

#### Syntax:
```java
ClassName::instanceMethodName
```

#### Example:
```java
class Printer {
    public void printMessage(String message) {
        System.out.println(message);
    }
}

public class method_reference.Main {
    public static void main(String[] args) {
        List<String> messages = Arrays.asList("Hello", "World");
        messages.forEach(new Printer()::printMessage); // Output: Hello World
    }
}
```

### 4. **Constructor Method Reference**

Refers to a constructor and is used to create new objects in a concise manner.

#### Syntax:
```java
ClassName::new
```

#### Example:
```java
class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class method_reference.Main {
    public static void main(String[] args) {
        Function<String, Person> personMethodRef = Person::new;
        Person person = personMethodRef.apply("Alice");
        System.out.println(person.getName()); // Output: Alice
    }
}
```

## Summary of Syntax:

| Type                               | Syntax                                | Example                                                   |
|------------------------------------|---------------------------------------|-----------------------------------------------------------|
| **Static Method Reference**        | `ClassName::staticMethod`             | `MathOperations::add`                                      |
| **Instance Method Reference (Object)** | `instance::instanceMethod`            | `printer::printMessage`                                    |
| **Instance Method Reference (Class)** | `ClassName::instanceMethod`           | `String::toUpperCase`                                      |
| **Constructor Method Reference**   | `ClassName::new`                      | `Person::new`                                             |

## Key Points:

- **Method references** are a shorthand for lambda expressions.
- They are used to improve code readability and conciseness.
- Method references can refer to:
    - Static methods
    - Instance methods (on a specific object or class)
    - Constructors
- They work with **functional interfaces** like `Predicate`, `Function`, and `Consumer` and are used in functional programming scenarios.
