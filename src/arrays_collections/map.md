# 📝 **Java Collections Framework (Map, HashMap, SortedMap, TreeMap, Entry) Cheat Sheet**

## 📚 **1. Map Interface**
- **Definition:** A **Map** represents a **key-value pair** structure where **keys are unique**, but values can be duplicated.
- **No order is guaranteed** unless implemented by a specific class.
- **Null keys/values:** Depends on the implementation (e.g., `HashMap` allows one null key).

### 🛠️ **Key Methods:**
```java
V put(K key, V value);       // Inserts a key-value pair; replaces if key exists.
V get(Object key);           // Returns the value associated with the key.
V remove(Object key);        // Removes the mapping for a key.
boolean containsKey(Object key); // Checks if a key exists.
boolean containsValue(Object value); // Checks if a value exists.
Set<K> keySet();            // Returns a set of keys.
Collection<V> values();     // Returns a collection of values.
Set<Map.Entry<K, V>> entrySet(); // Returns a set of key-value pairs.
```

---

## 📚 **2. HashMap**
- **Definition:** Implements the **Map** interface using a **hash table**.
- **Key Characteristics:**
    - Allows **one null key** and **multiple null values**.
    - **Unordered.**
    - `O(1)` average-case time complexity for `get`, `put`, and `remove`.

**Example:**
```java
Map<String, Integer> map = new HashMap<>();
map.put("A", 1);
map.put("B", 2);
System.out.println(map.get("A")); // Output: 1
```

---

## 📚 **3. SortedMap**
- **Definition:** A **Map** that maintains keys in **sorted order** (natural ordering or custom `Comparator`).
- **Key Characteristics:**
    - **Sorted by keys.**
    - Methods: `firstKey()`, `lastKey()`, `headMap(K toKey)`, `tailMap(K fromKey)`, `subMap(K fromKey, K toKey)`.

**Example:**
```java
SortedMap<Integer, String> sortedMap = new TreeMap<>();
sortedMap.put(2, "B");
sortedMap.put(1, "A");
System.out.println(sortedMap.firstKey()); // Output: 1
```

---

## 📚 **4. TreeMap**
- **Definition:** Implements **NavigableMap**, which extends **SortedMap**.
- **Key Characteristics:**
    - **Sorted by keys** (natural order or custom comparator).
    - `O(log(n))` time complexity for most operations.
    - **No null keys allowed**, but **null values are allowed.**

**Example:**
```java
Map<String, Integer> treeMap = new TreeMap<>();
treeMap.put("B", 2);
treeMap.put("A", 1);
System.out.println(treeMap.firstKey()); // Output: A
```

---

## 📚 **5. Map.Entry Interface**
- **Definition:** `Map.Entry` is a **nested interface** within the **Map interface**.
- **Purpose:** Represents a **key-value pair** (an entry) in a Map.
- **Key Characteristics:**
    - Allows us to work with individual key-value pairs in a map.
    - Commonly used with `entrySet()` to iterate through the map.

### 🛠️ **Key Methods of Map.Entry:**
```java
K getKey();     // Returns the key corresponding to this entry.
V getValue();   // Returns the value corresponding to this entry.
V setValue(V value); // Replaces the value corresponding to this entry.
```

### ✅ **Using Map.Entry with entrySet()**
The `entrySet()` method returns a `Set` of `Map.Entry` objects, which can be used for iteration.

**Example:**
```java
Map<String, Integer> map = new HashMap<>();
map.put("A", 1);
map.put("B", 2);

for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
```
**Output:**
```
Key: A, Value: 1
Key: B, Value: 2
```

**Example (Using setValue):**
```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    entry.setValue(entry.getValue() + 10);
}
System.out.println(map);
```
**Output:**
```
{A=11, B=12}
```

---


That's it for **Map, HashMap, SortedMap, TreeMap, and Map.Entry**! 🚀😊
