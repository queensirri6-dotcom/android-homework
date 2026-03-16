# Kotlin Object-Oriented Programming Exercises

A comprehensive collection of Kotlin exercises demonstrating fundamental and intermediate OOP concepts using modern build practices with Gradle.

## Project Structure

```
AnimalHierarchy/
├── README.md                          # Main project guide
├── EXERCISES_GUIDE.md                 # This file
│
├── exercise 1/                        # Animal Hierarchy (Abstract Classes)
│   ├── README.md                      # Detailed exercise guide
│   ├── src/main/kotlin/Main.kt       # Animal hierarchy implementation
│   ├── build.gradle.kts
│   ├── settings.gradle.kts
│   ├── gradlew.bat
│   └── gradle/wrapper/
│
├── exercise 2/                        # Network State (Sealed Classes)
│   ├── README.md                      # Detailed exercise guide
│   ├── src/main/kotlin/Main.kt       # Sealed class implementation
│   ├── build.gradle.kts
│   ├── settings.gradle.kts
│   ├── gradlew.bat
│   └── gradle/wrapper/
│
└── exercise 3/                        # Drawable Shapes (Interfaces)
    ├── README.md                      # Detailed exercise guide
    ├── src/main/kotlin/Main.kt       # Interface implementation
    ├── build.gradle.kts
    ├── settings.gradle.kts
    ├── gradlew.bat
    └── gradle/wrapper/
```

## Available Exercises

### 🐾 Exercise 1: Animal Hierarchy with Abstract Classes
**Location:** `exercise 1/`  
**Concepts:** Abstract classes, inheritance, polymorphism, method overriding  
**Status:** ✅ Complete and tested

Demonstrates an animal class hierarchy with `Dog` and `Cat` subclasses inheriting from an abstract `Animal` base class. This is the foundation for understanding OOP concepts.

**Key Features:**
- Abstract class definition and enforcement
- Abstract properties and methods
- Inheritance and method overriding
- Polymorphic list handling
- Type checking with `when` expressions

**Run:**
```bash
cd "exercise 1"
.\gradlew.bat run
```

**Output:** Shows dogs saying "Woof!" and cats saying "Meow!" with polymorphic behavior.

---

### 📡 Exercise 2: Network State with Sealed Classes
**Location:** `exercise 2/`  
**Concepts:** Sealed classes, exhaustive when expressions, type-safe state management  
**Status:** ✅ Complete and tested

Models network request states (`Loading`, `Success`, `Error`) using sealed classes for safe, exhaustive state handling.

**Key Features:**
- Type-safe state representation
- Compiler-enforced exhaustiveness
- Real-world network state patterns
- Advanced state chaining examples

**Run:**
```bash
cd "exercise 2"
.\gradlew.bat run
```

**Output:** Demonstrates handling multiple network states with proper error/success feedback.

---

### 🎨 Exercise 3: Drawable Shapes with Interfaces
**Location:** `exercise 3/`  
**Concepts:** Interfaces, polymorphism, type filtering, ASCII art rendering  
**Status:** ✅ Complete and tested

Implements different shape types (`Circle`, `Square`, `Rectangle`, `Triangle`) that all implement a common `Drawable` interface.

**Key Features:**
- Interface-based design
- Polymorphic shape rendering
- ASCII art implementation
- Type filtering with `filterIsInstance`
- Extensible architecture

**Included Shapes:**
- Circle (with size-aware ASCII art)
- Square (perfect dimensions)
- Rectangle (flexible width/height)
- Triangle (pyramid pattern)

**Run:**
```bash
cd "exercise 3"
.\gradlew.bat run
```

**Output:** Demonstrates rendering different shapes and filtering by type.

---

## Technologies

| Technology | Version | Purpose |
|-----------|---------|---------|
| **Kotlin** | 1.9.23 | Modern JVM language with concise syntax |
| **Gradle** | 8.7 | Build automation and project management |
| **Java** | 17+ | JVM runtime (recommended: 21) |

## Building & Running

### All Projects Use the Same Commands

```bash
# Navigate to project directory
cd "AnimalHierarchy"              # or "exercise 2" or "exercise 3"

# Build the project
.\gradlew.bat build

# Run the application
.\gradlew.bat run

# View available tasks
.\gradlew.bat tasks

# Clean build artifacts
.\gradlew.bat clean
```

## Key OOP Concepts Covered

### Exercise 1 (Animal Hierarchy)
- ✓ Abstract classes
- ✓ Abstract properties and methods
- ✓ Inheritance
- ✓ Polymorphism
- ✓ Method overriding

### Exercise 2 (Sealed Classes)
- ✓ Sealed classes
- ✓ Object declarations
- ✓ Data classes
- ✓ Type-safe enums
- ✓ Exhaustive when expressions
- ✓ Pattern matching

### Exercise 3 (Interfaces)
- ✓ Interface definition
- ✓ Interface implementation
- ✓ Polymorphism
- ✓ Type filtering
- ✓ Loose coupling
- ✓ SOLID principles

## Quick Start

1. **Clone/open** the workspace in VS Code
2. **Open a terminal** (Ctrl+`)
3. **Navigate** to desired exercise:
   ```bash
   cd "exercise 1"    # or "exercise 2" or "exercise 3"
   ```
4. **Run**:
   ```bash
   .\gradlew.bat run
   ```

## Gradle Wrapper

Each project includes a **Gradle wrapper** (`gradlew.bat` for Windows) that:
- ✅ Works without global Gradle installation
- ✅ Ensures consistent Gradle version across machines
- ✅ Automatically downloads dependencies
- ✅ Bootstraps JDK if using Foojay resolver

**Bootstrap (one-time setup):**
```bash
gradle wrapper
```

## Project Configuration

### build.gradle.kts
- Kotlin JVM plugin
- Application plugin
- Maven Central repository
- Kotlin standard library dependency
- Fat JAR generation (for distribution)
- JVM toolchain (Java 17)

### settings.gradle.kts
- Foojay JDK resolver (auto-downloads JDK if needed)
- Project naming

### gradle/wrapper/gradle-wrapper.properties
- Gradle version: 8.7
- Distribution URL configuration

## Debugging Tips

**If build fails:**
```bash
# Check Gradle version
.\gradlew.bat -version

# Run with full debug info
.\gradlew.bat run --info

# Clean and rebuild
.\gradlew.bat clean build
```

**If Java not found:**
```bash
# Check Java installation
java -version

# Check JAVA_HOME environment variable
echo $env:JAVA_HOME

# Set it if needed (PowerShell)
$env:JAVA_HOME = "C:\Program Files\Java\jdk-21"
```

## Learning Path

### Recommended Order
1. **Start with Animal Hierarchy** — understand basic inheritance and polymorphism
2. **Move to Exercise 2** — learn sealed classes for type-safe state management
3. **Try Exercise 3** — master interfaces and polymorphic design

### Study Tips
- Read the `README.md` in each exercise folder
- Review the code comments for detailed explanations
- Modify and experiment with the code
- Add new shapes to Exercise 3
- Create new network states for Exercise 2

## Assessment Checklist

- ✅ Animal Hierarchy — Abstract classes working correctly
- ✅ Exercise 2 — Sealed class compiles without exhaustive warnings
- ✅ Exercise 3 — All shapes render correctly with proper output

## Summary

This workspace provides a practical exploration of Kotlin OOP concepts through runnable, well-organized exercises. Each project demonstrates real-world patterns and best practices used in professional Kotlin development.

**Start exploring:** Open a terminal and run `.\gradlew.bat run` in any exercise folder! 🚀
