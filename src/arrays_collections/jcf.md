# 📝 **Java Collections Framework (JCF) Cheat Sheet**

### 📚 **Overview**
- **Java Collections Framework (JCF)** is a unified architecture for representing and manipulating **collections of objects**.
- It includes **interfaces**, their **implementations (classes)**, and **algorithms (static methods in `Collections`)** to operate on collections.

---

## ✅ **1. Iterable Interface**
- **Iterable** is the **root interface** of the Java Collections Framework.
- It defines **one abstract method:**
   ```java
   Iterator<T> iterator();
   ```
- Returns an **Iterator** object for traversing the collection.

### 🛠️ **Iterator Interface:**
- Used for **sequential traversal** of a collection without exposing its structure.
- **Key methods:**
   ```java
   boolean hasNext(); // Checks if there’s another element.
   T next();          // Returns the next element.
   void remove();     // Removes the last iterated element (optional).
   ```

---

## ✅ **2. Collection Interface**
- **Collection** extends **Iterable** and serves as the **base interface** for `List`, `Set`, and `Queue`.
- **Key methods:**
   ```java
   int size();                      // Returns the number of elements.
   boolean isEmpty();               // Checks if the collection is empty.
   boolean add(E e);                // Adds an element.
   boolean remove(Object o);        // Removes a specific element.
   boolean contains(Object o);      // Checks if an element exists.
   boolean addAll(Collection<? extends E> c); // Adds all elements from another collection.
   boolean removeAll(Collection<?> c); // Removes all matching elements.
   boolean retainAll(Collection<?> c); // Retains only matching elements.
   void clear();                    // Removes all elements.
   boolean containsAll(Collection<?> c); // Checks for all elements.
   ```

---

## ✅ **3. Collections Class**
- **Collections** is a **utility class** for common collection-related operations.
- **Key static methods:**
   ```java
   Collections.sort(List<T> list);       // Sorts the list.
   Collections.binarySearch(List<T> list, T key); // Searches in a sorted list.
   Collections.copy(List<T> dest, List<T> src); // Copies elements.
   Collections.addAll(Collection<? super T> c, T... elements); // Adds multiple elements.
   Collections.reverse(List<?> list);   // Reverses the list order.
   ```

### 🤔 **When to Use `binarySearch`?**
- **Efficient for:** Arrays and `ArrayList` (supports random access).
- **Less efficient for:** `LinkedList` (no random access).

---

This section introduces the **Iterable**, **Collection**, and **Collections** utility class.
