# Exercise 2: Network Request State with Sealed Class

## Overview
This exercise demonstrates how to use **sealed classes** in Kotlin to model different states of a network request. Sealed classes provide a type-safe, exhaustive way to handle state management.

## Concepts Demonstrated

### 1. **Sealed Class**
```kotlin
sealed class NetworkState {
    object Loading : NetworkState()
    data class Success(val data: String) : NetworkState()
    data class Error(val message: String) : NetworkState()
}
```
- `Loading` — represents a request in progress
- `Success` — represents a successful response with data
- `Error` — represents a failed request with error message

### 2. **Exhaustive When Expression**
```kotlin
when (state) {
    is NetworkState.Loading -> { /* handle loading */ }
    is NetworkState.Success -> { /* handle success */ }
    is NetworkState.Error -> { /* handle error */ }
}
```
The Kotlin compiler ensures all cases are handled — no default case needed!

### 3. **Type-Safe State Management**
- Only `Loading`, `Success`, and `Error` can be NetworkState instances
- Impossible to create invalid states
- IDE warnings if you miss a case in `when`

## Key Benefits of Sealed Classes

✅ **Type Safety** — Only predefined subtypes allowed  
✅ **Exhaustiveness** — Compiler warns if you miss a case  
✅ **Clarity** — State transitions are explicit and visible  
✅ **No Null States** — Invalid states cannot exist  

## Running the Project

```bash
# Build
.\gradlew.bat build

# Run
.\gradlew.bat run
```

## Expected Output
The program demonstrates:
- Processing multiple network states
- Handling Loading, Success, and Error states
- Advanced chaining with result mapping
- Type narrowing with `is` operator

## Code Structure
- **Main.kt** — Contains sealed class definition and handling logic
- **build.gradle.kts** — Gradle configuration with Kotlin plugin
- **settings.gradle.kts** — Project name and plugin management

## When to Use Sealed Classes
- **State Management** — Loading/Success/Error patterns
- **Result Types** — Ok/Failure patterns
- **UI Events** — Different navigation events
- **API Responses** — Different response types
- **Any closed hierarchy** — Where you control all subtypes

## Related OOP Concepts
- **Polymorphism** — Different state types handled uniformly
- **Encapsulation** — Internal details hidden
- **Type Hierarchy** — Clear parent-child relationships
