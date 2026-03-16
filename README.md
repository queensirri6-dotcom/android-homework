# Animal Hierarchy

A Kotlin OOP demonstration project showcasing object-oriented programming concepts through a simple animal class hierarchy.

## Project Overview

This project demonstrates fundamental OOP principles using an animal classification system where different animal types inherit from an abstract base class and override shared behaviors.

## Concepts Demonstrated

- **Abstract Classes** — `Animal` is an abstract base class that cannot be instantiated
- **Abstract Properties & Methods** — Required to be overridden in every subclass (`legs`, `makeSound()`)
- **Inheritance** — `Dog` and `Cat` extend the `Animal` class
- **Polymorphism** — Different animal types behave differently through method overriding
- **Method Overriding** — Each subclass implements its own version of abstract methods
- **Type Checking** — Using Kotlin's `when` expression with `is` operator

## Project Structure

```
AnimalHierarchy/
├── src/
│   └── main/
│       └── kotlin/
│           └── Main.kt          # Contains Animal class and subclasses
├── build.gradle.kts             # Gradle build configuration (Kotlin DSL)
├── settings.gradle.kts          # Gradle settings with Foojay JDK resolver
├── gradlew.bat                  # Gradle wrapper for Windows
├── gradle/
│   └── wrapper/                 # Gradle wrapper files
└── README.md                    # This file
```

## Building the Project

### Prerequisites

- **Java 17+** (recommended: Java 21)
- **Gradle** is bundled via wrapper (no separate installation needed)

### Build Commands

```bash
# Build the project
./gradlew.bat build

# Clean and rebuild
./gradlew.bat clean build

# View available tasks
./gradlew.bat tasks
```

## Running the Application

```bash
./gradlew.bat run
```

### Expected Output

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

================================================
  Concepts used:
  - Abstract class (Animal)
  - Abstract property (legs)
  - Abstract method (makeSound)
  - Inheritance (Dog : Animal, Cat : Animal)
  - Polymorphism (List<Animal> holds Dog & Cat)
  - Method overriding (override fun/val)
================================================
```

## Code Structure

### Abstract Base Class: `Animal`

```kotlin
abstract class Animal(val name: String) {
    abstract val legs: Int
    abstract fun makeSound(): String
    fun speak() { /* ... */ }
    fun describe() { /* ... */ }
}
```

### Concrete Implementations

- **Dog** — 4 legs, makes "Woof!" sound
- **Cat** — 4 legs, makes "Meow!" sound

## Key Files

- [Main.kt](src/main/kotlin/Main.kt) — Main application code with class hierarchy
- [build.gradle.kts](build.gradle.kts) — Build configuration with Kotlin stdlib dependency and Fat JAR setup
- [settings.gradle.kts](settings.gradle.kts) — Project settings with Foojay JDK toolchain resolver

## Development

### Using VS Code

- ✅ Use the integrated terminal to run Gradle commands
- ✅ Run: `.\gradlew.bat run` to execute the application
- ✅ Recommended: Install "Gradle Tasks" extension for a Gradle sidebar
- ❌ Do NOT try to "Run" the `.gradle.kts` files directly in VS Code

### Extending the Project

To add more animal types, create a new class extending `Animal`:

```kotlin
class Bird(name: String) : Animal(name) {
    override val legs: Int = 2
    override fun makeSound(): String = "Tweet!"
}
```

Then add instances to the animals list in the `main()` function.

## Technologies Used

- **Kotlin 1.9.23** — Modern JVM language with concise syntax
- **Gradle 8.7** — Build automation tool
- **Java 21** — JVM runtime environment

## License

This is a demonstration/educational project.
