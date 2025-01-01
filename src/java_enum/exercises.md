# 🚀 Java Enum Exercises

## Exercise 1: **Advanced Traffic Light System**
- Create an `enum` called `TrafficLight` with constants `RED`, `YELLOW`, and `GREEN`.
- Each constant should have:
    - A `duration` in seconds.
    - A `next()` method to return the next traffic light state.
- Write a program to simulate the traffic light cycle.

---

## Exercise 2: **Payment System**
- Create an `enum` called `PaymentStatus` with constants: `PENDING`, `COMPLETED`, `FAILED`, `REFUNDED`.
- Each status should have:
    - A description.
    - A boolean flag indicating if it's a final state (`isFinalState`).
- Add a static method to get a status by its description.

---

## Exercise 3: **Enum with Abstract Methods**
- Create an `enum` called `Operation` representing basic math operations: `ADD`, `SUBTRACT`, `MULTIPLY`, `DIVIDE`.
- Each constant should override an abstract method `apply(int x, int y)` to perform the respective operation.
- Write a main program to test each operation.

---

## Exercise 4: **Role-Based Access Control**
- Create an `enum` called `UserRole` with constants: `ADMIN`, `USER`, `GUEST`.
- Each role should have:
    - A method `getPermissions()` returning a list of permissions (`READ`, `WRITE`, `DELETE`).
- Ensure `GUEST` has only `READ`, `USER` has `READ` and `WRITE`, and `ADMIN` has all permissions.

---

## Exercise 5: **Configurable Settings**
- Create an `enum` called `Configuration` representing different system settings: `MAX_CONNECTIONS`, `TIMEOUT`, `DEBUG_MODE`.
- Each constant should have a value (e.g., `int`, `boolean`).
- Add a method to retrieve the value.
- Test the configuration by printing all values using the `values()` method.

---

## Exercise 6: **EnumSet and EnumMap**
- Use `EnumSet` to represent a set of weekdays.
- Use `EnumMap` to map weekdays to activities (`MONDAY` → `Gym`, `FRIDAY` → `Movie Night`).
- Write a program to:
    - Print all weekdays in the set.
    - Print each day with its associated activity from the map.

---

These exercises will cover constructors, methods, abstract behavior, and interaction with collections like `EnumSet` and `EnumMap`. Let me know when you're ready to discuss the solutions! 🚦💻
