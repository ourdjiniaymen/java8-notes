# Java Collectors Exercises

## Exercise 1: Sum and Average of Prices
- **Problem:** Given a list of `Product` objects, compute the **total sum** of prices and the **average price** of the products.
- **Collectors Used:** `summingDouble`, `averagingDouble`
- **Goal:** Calculate and print the total and average product prices.

---

## Exercise 2: Group Products by Category
- **Problem:** Group a list of `Product` objects by their **category**.
- **Collectors Used:** `groupingBy`
- **Goal:** Print products grouped by category in a map structure.

---

## Exercise 3: Count Products by Category
- **Problem:** Count the number of products in each **category**.
- **Collectors Used:** `groupingBy`, `counting`
- **Goal:** Display the count of products per category.

---

## Exercise 4: Concatenate Product Names
- **Problem:** Concatenate all **product names** into a single comma-separated string.
- **Collectors Used:** `joining`
- **Goal:** Print product names as a single string.

---

## Exercise 5: Find the Product with the Maximum Price
- **Problem:** Find the **product with the maximum price** from a list.
- **Collectors Used:** `maxBy`
- **Goal:** Print the product with the highest price.

---

## Exercise 6: Group Products by Price Range
- **Problem:** Group products into **price ranges** (e.g., "Cheap", "Affordable", "Expensive").
- **Collectors Used:** `groupingBy` with a custom classifier
- **Goal:** Display products grouped by price ranges.

---

## Exercise 7: Partition Products into Expensive and Cheap
- **Problem:** Partition products into **Expensive (price > 100)** and **Cheap (price <= 100)** groups.
- **Collectors Used:** `partitioningBy`
- **Goal:** Display products in two groups: Expensive and Cheap.

---

## Exercise 8: Summarize Products' Prices
- **Problem:** Summarize product prices with statistics (sum, average, min, max, count).
- **Collectors Used:** `summarizingDouble`
- **Goal:** Print a summary of product prices.

---

## Exercise 9: Reduce Products' Prices Using `reducing()`
- **Problem:** Calculate the **sum of all product prices** using `reducing()`.
- **Collectors Used:** `reducing`
- **Goal:** Print the total price using a custom reduction.

---

## Exercise 10: Create a Map of Product Names and Prices
- **Problem:** Create a **map** of product names and their corresponding prices.
- **Collectors Used:** `toMap`
- **Goal:** Display a map where the key is the product name and the value is its price.

---

## Exercise 11: Flatten List of Lists and Extract Unique Words
- **Problem:** Flatten a **list of lists** of words and extract unique words.
- **Collectors Used:** `flatMap`, `toSet`
- **Goal:** Print unique words from a nested list.

---

## Exercise 12: Count Distinct Product Categories
- **Problem:** Count the number of **distinct product categories**.
- **Collectors Used:** `mapping`, `toSet`
- **Goal:** Display the number of unique categories.

---

## Exercise 13: Partition Customers by Age Group
- **Problem:** Partition customers into **Young (age <= 30)** and **Old (age > 30)** groups.
- **Collectors Used:** `partitioningBy`
- **Goal:** Display customers split into Young and Old groups.

---

## Exercise 14: List the Names of Customers in Alphabetical Order
- **Problem:** Concatenate **customer names** in **alphabetical order** into a single string.
- **Collectors Used:** `mapping`, `joining`
- **Goal:** Display customer names sorted alphabetically in one string.  
