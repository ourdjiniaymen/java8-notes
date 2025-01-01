# 📝 **Java Array Cheat Sheet**

### ✅ **Declaration and Initialization**
```java
int[] a = {1, 2, 3};          // Inline initialization  
int[] b = new int[5];         // Array with size  
int[] c = new int[]{4, 5, 6}; // Anonymous array  
```

### ✅ **Access and Modify**
```java
int val = a[0];               // Access first element  
a[1] = 10;                    // Modify second element  
```

### ✅ **Length**
```java
int length = a.length;        // Get array size  
```

### ✅ **Iteration**
```java
for (int i = 0; i < a.length; i++) {
    System.out.println(a[i]);
}
for (int num : a) {           // Enhanced for-loop  
    System.out.println(num);
}
```

### ✅ **Copying Arrays**
```java
int[] copy = Arrays.copyOf(a, a.length); // Full copy  
System.arraycopy(a, 0, b, 0, 2);         // Partial copy  
```

### ✅ **Sorting**
```java
Arrays.sort(a);
```

### ✅ **Searching**
```java
int index = Arrays.binarySearch(a, 3);
```

### ✅ **Multi-dimensional Arrays**
```java
int[][] matrix = {{1, 2}, {3, 4}}; // Initialization  
int rows = matrix.length;          // Number of rows  
int cols = matrix[0].length;       // Number of columns  
```

### ✅ **Jagged Array (Irregular Array)**
```java
int[][] jagged = new int[2][];
jagged[0] = new int[2]; // First row with 2 columns  
jagged[1] = new int[3]; // Second row with 3 columns  
```

### ✅ **Static Methods (Arrays)**
```java
Arrays.fill(a, 0);                 // Fill array with 0  
System.out.println(Arrays.toString(a)); // Print array  
boolean isEqual = Arrays.equals(a, b);
```

---

### 📚 **Key Points to Remember**
- **Arrays are fixed in size:** Once declared, you cannot resize them.
- **Arrays are type-safe:** You cannot store an incompatible type.
- **null vs Empty Array:** An empty array (`new int[0]`) is not `null`.
- **Memory Efficiency:** Arrays are memory-efficient due to contiguous storage.
- **Static Utility Methods:** Use `Arrays` class for common operations (e.g., `sort`, `binarySearch`, `copyOf`).

---

This cheat sheet covers essential concepts and operations for working with arrays in Java. 🚀😊
