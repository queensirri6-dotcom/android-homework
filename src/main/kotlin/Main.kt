// ================================================
//   ANIMAL CLASS HIERARCHY - Kotlin OOP Demo
//   Demonstrates: Inheritance, Abstract Classes,
//   Polymorphism, Method Overriding
// ================================================

// Abstract base class - cannot be instantiated directly
abstract class Animal(val name: String) {

    // Abstract property - must be overridden in every subclass
    abstract val legs: Int

    // Abstract method - must be implemented in every subclass
    abstract fun makeSound(): String

    // Concrete method - shared by all animals (polymorphism in action)
    fun speak() {
        println("$name says ${makeSound()}")
    }

    // Concrete method - uses the overridden legs property
    fun describe() {
        println("$name is an animal with $legs legs.")
    }
}

// -----------------------------------------------
// Concrete subclass: Dog
// -----------------------------------------------
class Dog(name: String) : Animal(name) {

    // Override the abstract property
    override val legs: Int = 4

    // Override the abstract method
    override fun makeSound(): String = "Woof!"
}

// -----------------------------------------------
// Concrete subclass: Cat
// -----------------------------------------------
class Cat(name: String) : Animal(name) {

    // Override the abstract property
    override val legs: Int = 4

    // Override the abstract method
    override fun makeSound(): String = "Meow!"
}

// -----------------------------------------------
// Main entry point
// -----------------------------------------------
fun main() {

    println("================================================")
    println("        ANIMAL CLASS HIERARCHY DEMO             ")
    println("================================================\n")

    // Create a list of Animal objects (polymorphism - mix of Dog and Cat)
    val animals: List<Animal> = listOf(
        Dog("Buddy"),
        Cat("Whiskers")
    )

    // --- Expected Output Section ---
    println("--- Animal Sounds ---")
    for (animal in animals) {
        animal.speak()           // calls Dog.makeSound() or Cat.makeSound()
    }

    println()

    // --- Extra: show describe() using overridden legs property ---
    println("--- Animal Descriptions ---")
    for (animal in animals) {
        animal.describe()
    }

    println()

    // --- Extra: show type checking with polymorphism ---
    println("--- Type Identification ---")
    for (animal in animals) {
        val type = when (animal) {
            is Dog -> "Dog"
            is Cat -> "Cat"
            else   -> "Unknown"
        }
        println("${animal.name} is a $type")
    }

    println()
    println("================================================")
    println("  Concepts used:")
    println("  - Abstract class (Animal)")
    println("  - Abstract property (legs)")
    println("  - Abstract method (makeSound)")
    println("  - Inheritance (Dog : Animal, Cat : Animal)")
    println("  - Polymorphism (List<Animal> holds Dog & Cat)")
    println("  - Method overriding (override fun/val)")
    println("================================================")
}
