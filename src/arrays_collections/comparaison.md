# 📝 **Java Collections Framework Comparison Cheat Sheet**

## 📊 **1. Comparison Based on Ordering**

| **Collection Type** | **Ordering Guarantee** |
|----------------------|------------------------|
| **ArrayList**       | Maintains insertion order |
| **LinkedList**      | Maintains insertion order |
| **HashSet**         | No ordering guarantee |
| **LinkedHashSet**   | Maintains insertion order |
| **TreeSet**         | Sorted order (natural or comparator) |
| **PriorityQueue**   | Head element follows priority order |
| **HashMap**         | No ordering guarantee |
| **LinkedHashMap**   | Maintains insertion order |
| **TreeMap**         | Sorted order (natural or comparator) |

---

## 📊 **2. Comparison Based on Complexity of Main Operations**

| **Collection Type** | **Add** | **Remove** | **Search** |
|----------------------|---------|------------|-----------|
| **ArrayList**       | O(1) (amortized) | O(n) | O(n) |
| **LinkedList**      | O(1) | O(1) (head/tail) | O(n) |
| **HashSet**         | O(1) | O(1) | O(1) |
| **LinkedHashSet**   | O(1) | O(1) | O(1) |
| **TreeSet**         | O(log n) | O(log n) | O(log n) |
| **PriorityQueue**   | O(log n) | O(log n) | O(1) (peek) |
| **HashMap**         | O(1) | O(1) | O(1) |
| **LinkedHashMap**   | O(1) | O(1) | O(1) |
| **TreeMap**         | O(log n) | O(log n) | O(log n) |

---

## 📊 **3. Comparison Based on Null Value Support**

| **Collection Type** | **Allows Null Values** |
|----------------------|------------------------|
| **ArrayList**       | Yes |
| **LinkedList**      | Yes |
| **HashSet**         | One null element |
| **LinkedHashSet**   | One null element |
| **TreeSet**         | No |
| **PriorityQueue**   | No |
| **HashMap**         | One null key, multiple null values |
| **LinkedHashMap**   | One null key, multiple null values |
| **TreeMap**         | No null keys, allows null values |

---

## 📊 **4. Best Use Case for Each Structure**

| **Collection Type** | **Best Use Case** |
|----------------------|-------------------|
| **ArrayList**       | Frequent access via index |
| **LinkedList**      | Frequent insertion/deletion operations |
| **HashSet**         | Unique elements, unordered collection |
| **LinkedHashSet**   | Unique elements with insertion order preserved |
| **TreeSet**         | Sorted set of unique elements |
| **PriorityQueue**   | Elements processed by priority |
| **HashMap**         | Key-value pairs, fast retrieval |
| **LinkedHashMap**   | Key-value pairs with insertion order preserved |
| **TreeMap**         | Sorted key-value pairs |

---

This cheat sheet summarizes the key comparison criteria for Java Collections Framework. 🚀😊

