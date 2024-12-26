## 📚 **Java Optional Cheat Sheet**

---

### ✅ **What is `Optional`?**
- A container object used to represent **optional (nullable) values**.
- Encourages **null-safe programming** by forcing explicit handling of empty values.

---

### ✅ **Key Methods:**

#### **1. Creation:**
- `Optional.of(value)` → Throws `NullPointerException` if `value` is null.
- `Optional.ofNullable(value)` → Allows `null` and creates an empty `Optional`.
- `Optional.empty()` → Creates an empty `Optional`.

#### **2. Presence Check:**
- `isPresent()` → Returns `true` if a value is present.
- `isEmpty()` → Returns `true` if no value is present (opposite of `isPresent`).

#### **3. Access Values:**
- `get()` → Returns the value if present, otherwise throws `NoSuchElementException`.
- `orElse(defaultValue)` → Returns value if present, otherwise returns `defaultValue`.
- `orElseGet(Supplier)` → Returns value if present, otherwise calls the `Supplier`.
- `orElseThrow(Supplier)` → Returns value if present, otherwise throws an exception from the `Supplier`.

#### **4. Transformation:**
- `map(Function)` → Transforms the value if present and wraps it in an `Optional`.
- `flatMap(Function)` → Transforms the value and flattens nested `Optional`.

#### **5. Filtering:**
- `filter(Predicate)` → Returns the same `Optional` if the predicate is true, otherwise returns `Optional.empty()`.

---

### ✅ **Difference Between `orElse` and `orElseGet`:**
- `orElse`: Always evaluates the default value, even if it's not needed.
- `orElseGet`: Default value is evaluated **only if needed** (lazy evaluation).

### ✅ **Run action**
- `ifPresent`: like foreach in streams.

**Example:**
```java
String result = optionalValue.orElse(getDefaultValue()); // Eager evaluation
String result = optionalValue.orElseGet(() -> getDefaultValue()); // Lazy evaluation
```

---

### ✅ **Difference Between `map` and `flatMap`:**
- `map`: Wraps the transformed result in an `Optional`.
- `flatMap`: Prevents nested `Optional<Optional>` by flattening the result.

**Example:**
```java
Optional<Optional<String>> nested = Optional.of(Optional.of("Nested"));
Optional<String> result1 = nested.map(inner -> inner.get());
Optional<String> result2 = nested.flatMap(inner -> inner);
```

---

### ✅ **When to Use `Optional`:**
- Use for **method return types** where a value might be null.
- Avoid using `Optional` for fields or method parameters.

---

### ✅ **Best Practices:**
- Prefer `orElseGet` over `orElse` when default value computation is expensive.
- Avoid calling `get()` directly. Use safe methods like `orElse` or `orElseGet`.
- Use `flatMap` when working with nested `Optional` values.

---

### ✅ **Example Use Case:**
```java
public Optional<String> findUserById(String id) {
    return Optional.ofNullable(database.findUser(id));
}

Optional<String> user = findUserById("123");
String username = user.orElse("Guest");
System.out.println(username);
```

---

This cheat sheet provides a quick reference to effectively use `Optional` in Java. 🚀
