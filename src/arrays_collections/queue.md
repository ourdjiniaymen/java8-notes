# 📝 **Java Collections Framework (Queue, Deque, PriorityQueue, ArrayDeque, LinkedList) Cheat Sheet**

## 📚 **1. Queue Interface**
- **Definition:** A **Queue** represents a collection designed for holding elements prior to processing.
- **Order:** Follows **FIFO (First-In-First-Out)** principle.
- **Null Values:** Null insertion is **not allowed** in most implementations.
- **Head:** The first element.
- **Key Operations:**
    - `add(E e)` → Inserts an element; throws exception if it fails.
    - `offer(E e)` → Inserts an element; returns `false` if it fails.
    - `remove()` → Removes the head; throws exception if empty.
    - `poll()` → Removes the head; returns `null` if empty.
    - `element()` → Retrieves the head; throws exception if empty.
    - `peek()` → Retrieves the head; returns `null` if empty.

---

## 📚 **2. Deque Interface**
- **Definition:** A **Deque (Double-Ended Queue)** allows adding/removing elements from **both ends (head and tail)**.
- **Key Methods:**
    - `addFirst(E e)`, `addLast(E e)` → Add elements at head/tail.
    - `offerFirst(E e)`, `offerLast(E e)` → Add elements at head/tail without exception.
    - `removeFirst()`, `removeLast()` → Remove elements at head/tail.
    - `pollFirst()`, `pollLast()` → Remove elements at head/tail without exception.
    - `getFirst()`, `getLast()` → Retrieve head/tail.
    - `peekFirst()`, `peekLast()` → Retrieve head/tail without exception.

---

## 📚 **3. PriorityQueue**
- **Definition:** Implements `Queue` interface using a **binary heap**.
- **Ordering:** Elements are **not strictly ordered**, but the **head always contains the smallest (or highest-priority) element**.
- **Null Values:** **Not allowed.**
- **Key Operations:**
    - `add(E e)` → Adds an element based on priority.
    - `peek()` → Retrieves the highest-priority element.
    - `poll()` → Removes and retrieves the highest-priority element.

**Example:**
```java
Queue<Integer> pq = new PriorityQueue<>();
pq.add(3);
pq.add(1);
pq.add(2);
System.out.println(pq.poll()); // Output: 1 (Smallest element)
```

---

## 📚 **4. ArrayDeque**
- **Definition:** Implements `Deque` using a **resizable array**.
- **Ordering:** Maintains elements in **insertion order**, but allows **efficient access at both ends**.
- **Null Values:** **Not allowed.**
- **Best Use Case:** Suitable for stack (LIFO) and queue (FIFO) operations.
- **Key Methods:**
    - `addFirst(E e)`, `addLast(E e)` → Add elements at head/tail.
    - `offerFirst(E e)`, `offerLast(E e)` → Add elements at head/tail without exception.
    - `removeFirst()`, `removeLast()` → Remove elements at head/tail.
    - `pollFirst()`, `pollLast()` → Remove elements at head/tail without exception.
    - `getFirst()`, `getLast()` → Retrieve head/tail.
    - `peekFirst()`, `peekLast()` → Retrieve head/tail without exception.

**Example:**
```java
Deque<Integer> deque = new ArrayDeque<>();
deque.addFirst(1);
deque.addLast(2);
System.out.println(deque.getFirst()); // Output: 1
System.out.println(deque.getLast());  // Output: 2
```

### ⚖️ **ArrayDeque vs LinkedList (Deque Operations)**
| Feature           | ArrayDeque         | LinkedList        |
|--------------------|--------------------|-------------------|
| **Implementation** | Resizable array    | Doubly-linked list|
| **Null Allowed**   | No                | Yes              |
| **Performance**    | Faster for access | Slower for access |
| **Memory Overhead**| Lower             | Higher            |
| **Best For**       | Frequent head/tail operations | Iterative traversal |

---

## 📚 **5. LinkedList (as Queue and Deque)**
- **Definition:** Implements both **Queue** and **Deque** interfaces.
- **Structure:** **Doubly-linked list**.
- **Null Values:** **Allowed.**
- **Best Use Case:** When frequent **insertions and deletions** are required.
- **Key Methods:**
    - `addFirst(E e)`, `addLast(E e)` → Add at head/tail.
    - `removeFirst()`, `removeLast()` → Remove at head/tail.
    - `getFirst()`, `getLast()` → Retrieve head/tail.

**Example:**
```java
Deque<Integer> deque = new LinkedList<>();
deque.addFirst(1);
deque.addLast(2);
System.out.println(deque.getFirst()); // Output: 1
```

---

That's it for **Queue, Deque, PriorityQueue, ArrayDeque, and LinkedList**! 🚀😊
