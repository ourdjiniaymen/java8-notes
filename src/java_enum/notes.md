## ✅ **Java Enum Notes**

### **1. Definition:**
- `enum` is a **special Java class** that implicitly **extends `java.lang.Enum`**.
- Since it already extends `Enum`, it **cannot extend another class** (Java doesn’t allow multiple inheritance).

---

### **2. Objects:**
- Enum constants are **implicitly static, final, and singleton**.
- These constants are **defined at the time of declaration** and **cannot be instantiated again**.

---

### **3. Constructors, Attributes, Methods:**
- Enums **can have constructors, fields, and methods**.
- Enum constructors are **always private** (or package-private by default). You **cannot create new instances** outside the enum itself.

---

### **4. Methods:**
#### **Instance Methods:**
- `name()` → Returns the name of the enum constant.
- `ordinal()` → Returns the position (index) of the enum constant in its declaration (zero-based).
- `equals(Object)` → Checks equality of enum constants.

#### **Static Methods:**
- `values()` → Returns an array of all enum constants.
- `valueOf(String)` → Returns the enum constant with the specified name (case-sensitive).
- `Enum.valueOf(Class<T>, String)` → A static utility method for fetching enum constants.

---

### **5. Inheritance:**
- Enums **cannot extend other classes** because they implicitly extend `Enum`.
- Enums **cannot be extended** because they are implicitly `final`.

---

### **6. EnumSet Overview**
- **What is EnumSet?** A specialized Set implementation for enum types.
- **Key Points:**
    - **Type-Safe:** Cannot store `null` values.
    - **Performance Optimized:** Internally uses **bit vectors** for efficiency.
    - **Restricted Enum Type:** Each `EnumSet` is restricted to one specific enum type.

---

### **7.EnumMap Overview**
- **What is EnumMap?** A specialized Map implementation for enum keys.
- **Key Points:**
    - **Key Type:** Keys must be of a **single enum type**.
    - **Performance:** Faster than general-purpose maps.
    - **Null Handling:** Keys cannot be `null`, but values can be.

### **6. Additional Notes:**
- Enums can **implement interfaces**.
- They can **override methods** but cannot define abstract methods unless all enum constants provide their own implementation.

---

## 📝 **Best Practices**
- Avoid using `ordinal()` for logic; use meaningful properties instead.
- Use `EnumSet` and `EnumMap` for enum collections—they are efficient and type-safe.
- Keep enum constants **UPPER_CASED** for clarity.

✅ **End of Notes**
