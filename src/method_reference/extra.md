# 📚 **Method Reference Cheat Sheet**

## 🔑 **1. Instance Method Reference (ClassName::methodName)**
- Used when the **input object is the instance** invoking the method.
- Example: `String::toLowerCase`
- Equivalent Lambda: `(input) -> input.toLowerCase()`

## 🔑 **2. Instance Method Reference (object::methodName)**
- Used when a **specific object** must invoke the method.
- Example: `printer::printMessage`
- Equivalent Lambda: `(message) -> printer.printMessage(message)`

## 🔑 **3. Static Method Reference (ClassName::staticMethod)**
- Used for static methods tied to the **class itself**.
- Example: `Printer::printStaticMessage`
- Equivalent Lambda: `(message) -> Printer.printStaticMessage(message)`

## 🔑 **4. Constructor Reference (ClassName::new)**
- Used to create a **new instance** of a class.
- Example: `Printer::new`
- Equivalent Lambda: `() -> new Printer()`

## ⚠️ **Rule of Thumb:**
- **If the input is the instance → `ClassName::methodName`**
- **If an object is needed → `object::methodName`**
- **If static → `ClassName::staticMethod`**
- **If creating an object → `ClassName::new`**
