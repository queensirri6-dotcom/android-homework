# Exercise 1: Animal Class Hierarchy

## Overview
This exercise demonstrates fundamental Object-Oriented Programming concepts through a simple animal classification system.

## Project Structure
```
exercise 1/
├── README.md
├── src/main/kotlin/Main.kt           # Animal hierarchy implementation
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew.bat
└── gradle/wrapper/
```

## Concepts Covered

### 1. Abstract Classes
```kotlin
abstract class Animal(val name: String) {
    abstract val legs: Int
    abstract fun makeSound(): String
    fun speak() { /* concrete method */ }
}
```

### 2. Inheritance
```kotlin
class Dog(name: String) : Animal(name)
class Cat(name: String) : Animal(name)
```

### 3. Polymorphism
Different animals behave differently despite same method calls:
```kotlin
val animals: List<Animal> = listOf(Dog("Buddy"), Cat("Whiskers"))
animals.forEach { it.speak() }  // Different outputs!
```

### 4. Method Overriding
Each subclass implements its own version:
```kotlin
override fun makeSound(): String = "Woof!"    // Dog
override fun makeSound(): String = "Meow!"    // Cat
```

## Running the Project

```bash
# Navigate to Exercise 1
cd "exercise 1"

# Build
.\gradlew.bat build

# Run
.\gradlew.bat run
```

## Expected Output
```
================================================
        ANIMAL CLASS HIERARCHY DEMO
================================================

--- Animal Sounds ---
Buddy says Woof!
Whiskers says Meow!

--- Animal Descriptions ---
Buddy is an animal with 4 legs.
Whiskers is an animal with 4 legs.

--- Type Identification ---
Buddy is a Dog
Whiskers is a Cat
```

## Key Takeaways

✅ Abstract classes enforce implementation contracts  
✅ Inheritance enables code reuse  
✅ Polymorphism allows uniform treatment of different types  
✅ Method overriding enables type-specific behavior  

## Next Steps

After mastering Exercise 1, proceed to:
- **Exercise 2** — Learn sealed classes for type-safe state management
- **Exercise 3** — Master interfaces and polymorphic design
