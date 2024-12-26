# 📚 **Java Collectors Cheat Sheet**

## 🛠️ **1. Basic Collectors**

- **Collectors.toList()** → Collects elements into a `List`.
- **Collectors.toSet()** → Collects elements into a `Set` (removes duplicates).
- **Collectors.toMap(keyMapper, valueMapper)** → Collects elements into a `Map`.
- **Collectors.toUnmodifiableMap(keyMapper, valueMapper)** → Collects elements into an **immutable Map**.
- **Collectors.joining(delimiter)** → Concatenates elements into a `String` with a specified delimiter.

**Example:**
```java
List<String> names = people.stream()
    .map(Person::getName)
    .collect(Collectors.toList());
```

---

## 🧠 **2. Grouping and Partitioning**

- **Collectors.groupingBy(classifier)** → Groups elements by a key.
- **Collectors.groupingBy(classifier, downstream)** → Groups elements with further downstream operations.
- **Collectors.partitioningBy(predicate)** → Splits elements into two groups (true/false).

**Example:**
```java
Map<String, List<Product>> groupedByCategory = products.stream()
    .collect(Collectors.groupingBy(Product::getCategory));
```

---

## 🔢 **3. Counting and Reducing**

- **Collectors.counting()** → Counts the number of elements.
- **Collectors.reducing(identity, accumulator)** → Performs a custom reduction operation.

**Example:**
```java
long count = products.stream()
    .collect(Collectors.counting());
```

---

## 📊 **4. Summing Collectors**

- **Collectors.summingInt(ToIntFunction)** → Sums `int` values.
- **Collectors.summingDouble(ToDoubleFunction)** → Sums `double` values.
- **Collectors.summingLong(ToLongFunction)** → Sums `long` values.

**Example:**
```java
double totalPrice = products.stream()
    .collect(Collectors.summingDouble(Product::getPrice));
```

---

## 📈 **5. Averaging Collectors**

- **Collectors.averagingInt(ToIntFunction)** → Averages `int` values.
- **Collectors.averagingDouble(ToDoubleFunction)** → Averages `double` values.
- **Collectors.averagingLong(ToLongFunction)** → Averages `long` values.

**Example:**
```java
double avgPrice = products.stream()
    .collect(Collectors.averagingDouble(Product::getPrice));
```

---

## 📊 **6. Combination Collectors (Summarizing)**

- **Collectors.summarizingInt(ToIntFunction)** → Sum, Avg, Count, Min, Max for `int`.
- **Collectors.summarizingDouble(ToDoubleFunction)** → Sum, Avg, Count, Min, Max for `double`.
- **Collectors.summarizingLong(ToLongFunction)** → Sum, Avg, Count, Min, Max for `long`.

**Example:**
```java
DoubleSummaryStatistics stats = products.stream()
    .collect(Collectors.summarizingDouble(Product::getPrice));
```

---

## 🏆 **7. Finding Max/Min**

- **Collectors.maxBy(Comparator)** → Finds the maximum element based on a comparator.
- **Collectors.minBy(Comparator)** → Finds the minimum element based on a comparator.

**Example:**
```java
Optional<Product> mostExpensive = products.stream()
    .collect(Collectors.maxBy(Comparator.comparing(Product::getPrice)));
```

---

## 🔄 **8. Mapping Collector**

- **Collectors.mapping(mapper, downstream)** → Applies a mapping function and collects downstream.

**Example:**
```java
Set<String> categories = products.stream()
    .collect(Collectors.mapping(Product::getCategory, Collectors.toSet()));
```

---

## 🧩 **9. Custom Collector**

- **Collectors.reducing(identity, accumulator, combiner)** → Performs custom reduction with combiner logic.

**Example:**
```java
double total = products.stream()
    .collect(Collectors.reducing(0.0, Product::getPrice, Double::sum));
```

---

## 🗂️ **10. Partitioning by Predicate**

- **Collectors.partitioningBy(predicate)** → Splits data into two groups based on a predicate.

**Example:**
```java
Map<Boolean, List<Product>> expensiveProducts = products.stream()
    .collect(Collectors.partitioningBy(p -> p.getPrice() > 100));
```

---

## 🚀 **11. Immutable Map**

- **Collectors.toUnmodifiableMap(keyMapper, valueMapper)** → Creates an **unmodifiable Map**.

**Example:**
```java
Map<String, Double> productPrices = products.stream()
    .collect(Collectors.toUnmodifiableMap(Product::getName, Product::getPrice));
```

---

## 🧩 **12. Multi-Level Grouping**

- **Collectors.groupingBy(keyMapper, groupingBy(keyMapper, downstream))**  
  → Groups elements hierarchically.

**Example:**
```java
Map<String, Map<String, List<Product>>> nestedGrouping = products.stream()
    .collect(Collectors.groupingBy(Product::getCategory, 
        Collectors.groupingBy(p -> p.getPrice() > 100 ? "Expensive" : "Cheap")));
```

---

Use this cheat sheet as a quick reference for Java's **Collectors API**! 🚀
