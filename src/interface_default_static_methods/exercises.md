# 🚀 **Java 8 Interfaces Exercises**

### **Exercise 1: Default Methods in Interfaces**
1. Create an interface `Animal` with a default method `speak()` that prints `"The animal speaks!"`.
2. Implement this interface in a class `Dog`.
3. In `Dog`, override the `speak()` method to print `"The dog barks!"`.
4. Create another class `Cat` that uses the default `speak()` method without overriding it.
5. Create a `Main` class to test the `Dog` and `Cat` classes.

### **Exercise 2: Static Methods in Interfaces**
1. Create an interface `MathOperations` with a static method `add(int a, int b)` that returns the sum of two numbers.
2. In the `Main` class, call the `add()` method from the `MathOperations` interface without creating an instance of a class.

### **Exercise 3: Diamond Problem**
1. Create two interfaces, `InterfaceA` and `InterfaceB`, each with a default method `printMessage()` that prints `"Message from A"` and `"Message from B"` respectively.
2. Create a class `ClassC` that implements both `InterfaceA` and `InterfaceB`.
3. Override the `printMessage()` method in `ClassC` to resolve the Diamond Problem and call both interface methods using `super`.

### **Exercise 4: Combine Default and Static Methods**
1. Create an interface `Car` with:
    - A default method `startEngine()` that prints `"Engine started"`.
    - A static method `getFuelType()` that returns `"Petrol"`.
2. Implement the `Car` interface in a class `Tesla`.
3. In `Tesla`, override the `startEngine()` method to print `"Tesla engine started"`.
4. In the `Main` class, demonstrate calling both the static and default methods.

