# 📝 **Java Collections Framework (List, ArrayList, LinkedList) Cheat Sheet**

## 📚 **1. List Interface**
- **Ordered Collection:** Preserves **insertion order**.
- **Indexed Access:** Elements can be accessed directly using their **index**.
- **Allows Duplicates:** Multiple identical elements can be stored.

### 🛠️ **Key Methods:**
```java
E get(int index);                        // Retrieves an element at the specified index.
int indexOf(Object o);                   // First index of the given element.
int lastIndexOf(Object o);               // Last index of the given element.
List<E> subList(int from, int to);       // View of a portion of the list.
ListIterator<E> listIterator();          // Bi-directional iterator.
ListIterator<E> listIterator(int index); // Iterator starting at a specific index.
void add(int index, E element);          // Inserts an element at a specific index.
boolean addAll(int index, Collection<? extends E> c); // Adds a collection at a specific index.
E remove(int index);                     // Removes an element by index.
E set(int index, E element);             // Replaces an element.
```

---

## 🔄 **2. ListIterator**
- **Extends:** `Iterator`
- **Bi-directional traversal**

### 🛠️ **Key Methods:**
```java
void add(E e);            // Adds an element before the cursor.
boolean hasPrevious();    // Checks for an element before cursor.
E previous();             // Moves cursor backward and returns element.
int nextIndex();          // Index of the next element.
int previousIndex();      // Index of the previous element.
void set(E e);            // Replaces the last accessed element.
```

---

## ✅ **3. ArrayList**
- **Implements:** `List`
- **Underlying Data Structure:** **Dynamic Array**

### 🛠️ **Key Characteristics:**
- **Fast random access:** `O(1)` for `get`
- **Slow insertion/removal:** `O(n)` (shifting elements required)
- **Best for:** Read-heavy operations, random access.

**Example:**
```java
List<String> arrayList = new ArrayList<>();
arrayList.add("Apple");
arrayList.add(1, "Banana");
```

---

## ✅ **4. LinkedList**
- **Implements:** `List`, `Deque`
- **Underlying Data Structure:** **Doubly Linked List**

### 🛠️ **Key Characteristics:**
- **Fast insertion/removal:** `O(1)` at beginning or end.
- **Slow random access:** `O(n)`.
- **Best for:** Insertions and deletions.

### 🛠️ **Deque-Specific Methods:**
```java
void addFirst(E e);
void addLast(E e);
E getFirst();
E getLast();
E removeFirst();
E removeLast();
```

**Example:**
```java
List<String> linkedList = new LinkedList<>();
linkedList.add("Apple");
linkedList.addFirst("Banana");
```

---


