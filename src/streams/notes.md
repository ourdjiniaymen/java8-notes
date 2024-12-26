# 🚀 **Understanding Java Streams**

## ✅ **What are Streams?**
- **Streams are not data structures** (like collections or arrays).
- They are **abstractions (wrappers)** over a data source (e.g., collections, arrays, I/O channels).
- They allow us to **process data declaratively** using functional-style operations, without manually iterating over elements.
- They enable **pipeline processing**, chaining multiple operations in a clear and concise way.

---

## 🛠️ **Key Characteristics Recap:**
1. **Intermediate Operations:**
   - Always return another **Stream**.
   - Examples: `filter`, `map`, `sorted`, `distinct`.
2. **Terminal Operations:**
   - Do **not return a Stream**.
   - Trigger the **execution of the pipeline**.
   - Examples: `collect`, `forEach`, `reduce`, `count`.
3. **Lazy Evaluation:**
   - Intermediate operations are **not executed immediately**.
   - Execution happens only when a **terminal operation** is invoked.

---

## 📊 **Quick Comparison Table**

| **Type of Operation** | **Return Type** | **Purpose** |
|------------------------|---------------|------------|
| **Intermediate**      | Stream        | Transform/Filter data |
| **Terminal**          | Non-Stream    | Produce results |

---

## 📚 **Types of Streams**
1. **Stream<T>**: For objects. (e.g., `Stream<String>`)
2. **IntStream, LongStream, DoubleStream**: For primitive types (int, long, double).
3. **Parallel Stream**: Splits the data into multiple parts and processes them concurrently.

---

## 🌟 **Creating Streams**
Streams can be created in multiple ways:

1. **From Collections:**
```java
List<String> list = Arrays.asList("a", "b", "c");
Stream<String> stream = list.stream();
```

2. **From Arrays:**
```java
String[] array = {"a", "b", "c"};
Stream<String> stream = Arrays.stream(array);
```

3. **Using `Stream.of()`:**
```java
Stream<String> stream = Stream.of("a", "b", "c");
```

4. **From Infinite Streams (Using `Stream.iterate` or `Stream.generate`):**
```java
Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);
Stream<Double> randomStream = Stream.generate(Math::random);
```

5. **From Files:**
```java
Stream<String> lines = Files.lines(Paths.get("file.txt"));
```

6. **From Builder:**
```java
Stream<String> stream = Stream.<String>builder().add("a").add("b").build();
```

---

## 🔄 **Important Stream Operations**

### 🛠️ **Intermediate Operations:**
1. **`filter(Predicate<T>)`**
   - Filters elements based on a condition.
    ```java
    list.stream().filter(x -> x > 10);
    ```
2. **`map(Function<T, R>)`**
   - Transforms each element into another form.
    ```java
    list.stream().map(String::toUpperCase);
    ```
3. **`flatMap(Function<T, Stream<R>>)`**
   - Flattens nested structures into a single stream.
    ```java
    list.stream().flatMap(Collection::stream);
    ```
4. **`distinct()`**
   - Removes duplicates.
    ```java
    list.stream().distinct();
    ```
5. **`sorted()` / `sorted(Comparator)`**
   - Sorts elements naturally or using a comparator.
    ```java
    list.stream().sorted();
    ```
6. **`limit(long n)`**
   - Limits the number of elements in the stream.
    ```java
    list.stream().limit(5);
    ```
7. **`skip(long n)`**
   - Skips the first `n` elements.
    ```java
    list.stream().skip(3);
    ```

---

### 🏁 **Terminal Operations:**
1. **`forEach(Consumer<T>)`**
   - Performs an action for each element.
    ```java
    list.stream().forEach(System.out::println);
    ```
2. **`collect(Collectors)`**
   - Collects elements into a collection or other structure.
    ```java
    list.stream().collect(Collectors.toList());
    ```
3. **`reduce(BinaryOperator)`**
   - Reduces elements to a single value.
    ```java
    list.stream().reduce(0, Integer::sum);
    ```
4. **`count()`**
   - Counts the number of elements.
    ```java
    list.stream().count();
    ```
5. **`anyMatch(Predicate)`** / `allMatch(Predicate)` / `noneMatch(Predicate)`**
   - Match conditions on elements.
    ```java
    list.stream().anyMatch(x -> x > 10);
    ```
6. **`findFirst()`**
   - Returns the first element in the stream.
    ```java
    list.stream().findFirst();
    ```
7. **`findAny()`**
   - Returns any element, optimized for parallel streams.
    ```java
    list.stream().findAny();
    ```

---

## ⚙️ **Parallel Streams**
- Used for **parallel processing** to speed up computation.
- Created using `.parallelStream()` or `.stream().parallel()`.
- Use parallel streams for **large datasets** with **independent operations**.

**Example:**
```java
list.parallelStream().filter(x -> x > 10).collect(Collectors.toList());
```

**Best Practices for Parallel Streams:**
1. Ensure tasks are **independent** (no shared mutable state).
2. Avoid using parallel streams on **small datasets** (overhead may negate benefits).
3. Be cautious with **thread safety** in shared resources.

---

## 🎯 **Best Practices for Using Streams**
1. Prefer **Streams over manual loops** for better readability.
2. Keep pipelines **short and clean**.
3. Avoid excessive use of `.parallelStream()` on small datasets.
4. Use **method references** (`::`) when possible.
5. Handle `null` collections before streaming (`Optional`).
6. Don't mix **Stream API** with other forms of iteration in the same code.

---

🚀 **Mastering streams will make your Java code more expressive, efficient, and maintainable!**
