
# Advanced Optional Exercises

## Exercise 1: Chaining Operations with `map` and `flatMap`
Given a `Person` class with a `getAddress()` method that returns an `Optional<Address>`, and `Address` having a `getCity()` method that returns a `String`, perform the following operations:

1. Write a method that, given a `Person`, returns the name of the city where the person lives (if available), wrapped in an `Optional<String>`. If the city is not available, return `Optional.empty()`.

   **Person class**:
   ```java
   class Person {
       private Address address;

       public Optional<Address> getAddress() {
           return Optional.ofNullable(address);
       }
   }

   class Address {
       private String city;

       public String getCity() {
           return city;
       }
   }
   ```

2. **Challenge**: Modify your method to safely return the city name in uppercase, or `Optional.empty()` if any of the properties in the chain is `null`.

## Exercise 2: Combining Multiple `Optional`s
You are given two `Optional<String>` variables, one representing a first name and another representing a last name. Write a method that returns a single `Optional<String>` combining both names, formatted as `"First Last"`, but only if both names are present. If either is missing, return `Optional.empty()`.

**Example**:
   ```java
   Optional<String> firstName = Optional.of("John");
   Optional<String> lastName = Optional.of("Doe");

   Optional<String> fullName = combineNames(firstName, lastName);
   ```

**Expected Result**:
- If both `firstName` and `lastName` are present, return `"John Doe"`.
- If either `firstName` or `lastName` is empty, return `Optional.empty()`.

## Exercise 3: Handling Default Values with `orElse` and `orElseGet`
Write a method that takes an `Optional<String>` representing a user's email address and returns the email if present. If the email is not present, return a default email address `"default@example.com"`.

1. Use `orElse` to return the default email.
2. Modify the method to use `orElseGet` for lazy evaluation of the default value (i.e., the default email address should only be computed if the `Optional` is empty).

## Exercise 4: Optional and Exception Handling
You are dealing with a service that fetches user data from a database, but the user might not exist. Instead of returning `null` or throwing exceptions, you want to return `Optional<User>`, where `User` is a class with a `getName()` method.

1. Write a method that takes a user ID and returns an `Optional<User>`. If the user doesn't exist, return `Optional.empty()`.

   ```java
   class User {
       private String name;

       public String getName() {
           return name;
       }
   }
   ```

2. Write another method that, given the user ID, either:
    - Returns the user's name if they exist.
    - Returns a default message ("User not found") if the user does not exist.

   Use `map`, `orElse`, or `ifPresent` to implement this functionality.

## Exercise 5: Optional with `filter` and `map`
You have an `Optional<String>` representing a person's phone number, but some phone numbers contain spaces or special characters (e.g., `"(123) 456-7890"`). Write a method that:
1. Removes any non-numeric characters from the phone number.
2. Returns the cleaned-up phone number as an `Optional<String>`, or `Optional.empty()` if the phone number is invalid (empty or after cleanup is empty).

   **Hint**: Use `filter` to check for a valid value and `map` to transform the phone number.

## Exercise 6: Combining Multiple Optionals with `reduce`
You are given a list of `Optional<Integer>` values. Write a method that calculates the sum of all the values in the list. If any value in the list is empty, ignore it and continue with the rest. Use `reduce` to combine the values and return an `Optional<Integer>` representing the sum.

**Example**:
   ```java
   List<Optional<Integer>> numbers = Arrays.asList(Optional.of(5), Optional.empty(), Optional.of(10), Optional.of(15));
   Optional<Integer> total = sum(numbers);
   ```

The result should be `Optional.of(30)`.

## Exercise 7: Optional with Complex Object Transformation
You are working with a `User` object, which contains an `Optional<Address>`. The `Address` object has an `Optional<String>` representing the street address. Write a method that:
1. Takes a `User`.
2. If the user has an address and a valid street name, it returns the street name in uppercase.
3. If the address or street is absent, return `Optional.empty()`.

```java
class User {
    private Optional<Address> address;
    public Optional<Address> getAddress() {
        return address;
    }
}

class Address {
    private Optional<String> street;
    public Optional<String> getStreet() {
        return street;
    }
}
```

## Exercise 8: Optional and `ifPresentOrElse`
You are working with a service that fetches configuration values. It returns an `Optional<String>` for a setting. Write a method that:
1. Prints the setting value if it is present.
2. Prints a message `"Setting not available"` if the setting is absent.

Use the `ifPresentOrElse` method to achieve this.

## Bonus Challenge: Handling Multiple Nested Optionals
You are working with a system where a `User` object contains an `Optional<Profile>`, and the `Profile` contains an `Optional<ProfileDetails>`, and `ProfileDetails` contains an `Optional<String>` for the user's email.

Write a method that:
1. Given a `User`, extracts the user's email (if available) using `flatMap`.
2. If the email is available, return it wrapped in an `Optional`.
3. If not, return `Optional.empty()`.

```java
class User {
    private Optional<Profile> profile;
    public Optional<Profile> getProfile() {
        return profile;
    }
}

class Profile {
    private Optional<ProfileDetails> profileDetails;
    public Optional<ProfileDetails> getProfileDetails() {
        return profileDetails;
    }
}

class ProfileDetails {
    private Optional<String> email;
    public Optional<String> getEmail() {
        return email;
    }
}
```

---

# Objective of the Exercises:
- Understand how to safely chain operations using `map`, `flatMap`, `filter`, `ifPresent`, and other `Optional` methods.
- Learn how to handle default values, exceptions, and empty states with `Optional`.
- Gain practice in combining multiple `Optional` values.
- Get comfortable with more advanced methods like `reduce`, `ifPresentOrElse`, and handling deeply nested structures.

By working through these exercises, you'll get a much clearer understanding of how to use `Optional` effectively in real-world scenarios!
