# 📝 **Java Collections Framework (Set, HashSet, SortedSet, TreeSet) Cheat Sheet**

### 📚 **1. Set Interface**
- **Set** is a **Collection** that does **not allow duplicate elements**.
- Relies on the **`equals(Object o)`** method for equality checks.
- **Key Characteristics:**
    - **No duplicates:** Ensures unique elements.
    - **Unordered:** No guaranteed order of elements.
    - **No indexed access:** Cannot access elements by index.

---

## ✅ **2. HashSet**
- **Implements:** `Set`
- **Underlying Data Structure:** **Hash Table**
- **Comparison Mechanism:** Uses **`hashCode()`** and **`equals(Object o)`**.
- **Performance:** Constant-time for `add`, `remove`, and `contains` (average case).

### 🛠️ **Key Points:**
- **Allows null value:** But only one.
- **Unordered:** No guarantee of iteration order.

**Example:**
```java
Set<String> hashSet = new HashSet<>();
hashSet.add("Apple");
hashSet.add("Banana");
```

---

## ✅ **3. SortedSet Interface**
- **Extends:** `Set`
- Maintains **elements in sorted order** (natural ordering or a custom comparator).
- **Comparison Mechanism:** `compareTo` (if `Comparable`) or a `Comparator`.

### 🛠️ **Key Methods:**
```java
E first();                            // Returns the first (lowest) element.
E last();                             // Returns the last (highest) element.
Comparator<? super E> comparator();   // Returns the comparator (or null).
SortedSet<E> subset(E from, E to);    // Returns a subset between two elements.
SortedSet<E> headset(E to);           // Returns elements less than 'to'.
SortedSet<E> tailset(E from);         // Returns elements from 'from'.
```

**Example:**
```java
SortedSet<Integer> sortedSet = new TreeSet<>();
sortedSet.add(3);
sortedSet.add(1);
sortedSet.add(2);
```

---

## ✅ **4. TreeSet**
- **Implements:** `NavigableSet` → `SortedSet` → `Set`
- **Underlying Data Structure:** **Red-Black Tree** (self-balancing binary search tree).
- **Order:** Maintains elements in **sorted order**.
- **Performance:** O(log n) for `add`, `remove`, `contains`.

### 🛠️ **Key Points:**
- **No null values:** Throws `NullPointerException` if null is added.
- Supports additional methods from `NavigableSet`:
    - `lower(E e)` → Greatest element less than `e`
    - `higher(E e)` → Smallest element greater than `e`
    - `ceiling(E e)` → Smallest element ≥ `e`
    - `floor(E e)` → Greatest element ≤ `e`
    - `pollFirst()` → Removes and returns the first element
    - `pollLast()` → Removes and returns the last element

**Example:**
```java
Set<String> treeSet = new TreeSet<>();
treeSet.add("Apple");
treeSet.add("Banana");
```

---

This section introduces **Set**, **HashSet**, **SortedSet**, and **TreeSet**.