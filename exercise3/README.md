# Exercise 3: Drawable Shapes with Interfaces

## Overview
This exercise demonstrates **interfaces** in Kotlin by creating different shape types that all implement a common `Drawable` interface. Each shape renders itself as ASCII art.

## Concepts Demonstrated

### 1. **Interface Definition**
```kotlin
interface Drawable {
    fun draw()
    fun describe(): String
}
```
- Defines a contract that all shapes must follow
- Specifies required methods each shape must implement

### 2. **Interface Implementation**
```kotlin
class Circle(val radius: Int) : Drawable {
    override fun describe(): String = "Circle with radius $radius"
    override fun draw() { /* ASCII drawing */ }
}

class Square(val sideLength: Int) : Drawable {
    override fun describe(): String = "Square with side length $sideLength"
    override fun draw() { /* ASCII drawing */ }
}
```

### 3. **Polymorphism**
```kotlin
val shapes: List<Drawable> = listOf(
    Circle(5),
    Square(6),
    Rectangle(8, 4),
    Triangle(5)
)

shapes.forEach { shape ->
    shape.draw()  // Works for ANY Drawable!
}
```
All shapes behave uniformly through the `Drawable` interface.

## Shapes Included

| Shape | Properties | Features |
|-------|-----------|----------|
| **Circle** | radius | Scales ASCII art based on size |
| **Square** | sideLength | Perfect square with hollow interior |
| **Rectangle** | width, height | Flexible dimensions |
| **Triangle** | size | Pyramid pattern |

## Key Benefits of Interfaces

✅ **Contract Enforcement** — All shapes must implement `draw()`  
✅ **Polymorphism** — Handle all shapes uniformly  
✅ **Extensibility** — Easy to add new shapes  
✅ **Loose Coupling** — Code depends on interface, not concrete classes  

## Running the Project

```bash
# Build
.\gradlew.bat build

# Run
.\gradlew.bat run
```

## Expected Output
The program demonstrates:
- ASCII art rendering for each shape
- Descriptions of each shape
- Filtering shapes by type using `filterIsInstance<T>()`
- Polymorphic behavior through interfaces

## Code Structure
- **Main.kt** — Contains Drawable interface and shape implementations
- **build.gradle.kts** — Gradle configuration with Kotlin plugin
- **settings.gradle.kts** — Project name and plugin management

## Extending the Project

To add a new shape, implement the `Drawable` interface:

```kotlin
class Hexagon(val size: Int) : Drawable {
    override fun describe(): String = "Hexagon with size $size"
    
    override fun draw() {
        println("Drawing Hexagon:")
        // Add your ASCII art here
    }
}

// Add to shapes list
val shapes: List<Drawable> = listOf(
    /* existing shapes... */
    Hexagon(4)
)
```

## Real-World Applications

- **Graphics Rendering** — Different drawable objects in games/apps
- **Plugin Systems** — Define interface that plugins must implement
- **Document Generation** — Different element types (headers, paragraphs, images)
- **Payment Processing** — Different payment methods (credit card, PayPal, etc.)
- **Animation** — Different animator types

## Related OOP Concepts
- **Abstraction** — Hide ASCII implementation details
- **Encapsulation** — Each shape manages its own rendering
- **Polymorphism** — Same `draw()` call, different behaviors
- **Inheritance** — Could also use abstract classes instead
- **SOLID Principles** — Interface Segregation Principle in action
