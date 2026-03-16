// ================================================
//   Exercise 3: Drawable Shapes with Interfaces
//   Demonstrates: Interfaces, implementation,
//   ASCII art, and polymorphism
// ================================================

// Interface defining drawable contract
interface Drawable {
    fun draw()
    fun describe(): String
}

// -----------------------------------------------
// Circle implementation
// -----------------------------------------------
class Circle(val radius: Int) : Drawable {
    
    override fun describe(): String = "Circle with radius $radius"
    
    override fun draw() {
        println("Drawing Circle (radius: $radius):")
        when {
            radius >= 5 -> {
                println("     *****      ")
                println("   *       *    ")
                println("  *         *   ")
                println("  *         *   ")
                println("   *       *    ")
                println("     *****      ")
            }
            radius >= 3 -> {
                println("   ***    ")
                println("  *   *   ")
                println("   ***    ")
            }
            else -> {
                println(" * ")
            }
        }
    }
}

// -----------------------------------------------
// Square implementation
// -----------------------------------------------
class Square(val sideLength: Int) : Drawable {
    
    override fun describe(): String = "Square with side length $sideLength"
    
    override fun draw() {
        println("Drawing Square (side: $sideLength):")
        val border = "*".repeat(sideLength)
        val middle = "*" + " ".repeat(sideLength - 2) + "*"
        
        println(border)
        repeat(sideLength - 2) {
            println(middle)
        }
        println(border)
    }
}

// -----------------------------------------------
// Rectangle implementation (bonus)
// -----------------------------------------------
class Rectangle(val width: Int, val height: Int) : Drawable {
    
    override fun describe(): String = "Rectangle ($width x $height)"
    
    override fun draw() {
        println("Drawing Rectangle ($width x $height):")
        val border = "*".repeat(width)
        val middle = "*" + " ".repeat(width - 2) + "*"
        
        println(border)
        repeat(height - 2) {
            println(middle)
        }
        println(border)
    }
}

// -----------------------------------------------
// Triangle implementation (bonus)
// -----------------------------------------------
class Triangle(val size: Int) : Drawable {
    
    override fun describe(): String = "Triangle with size $size"
    
    override fun draw() {
        println("Drawing Triangle (size: $size):")
        for (i in 1..size) {
            val spaces = " ".repeat(size - i)
            val stars = "*".repeat(2 * i - 1)
            println(spaces + stars)
        }
    }
}

// ================================================
//   Main entry point
// ================================================
fun main() {
    println("================================================")
    println("       DRAWABLE SHAPES - INTERFACES             ")
    println("================================================\n")

    // Create a list of drawable objects (polymorphism)
    val shapes: List<Drawable> = listOf(
        Circle(5),
        Square(6),
        Rectangle(8, 4),
        Circle(3),
        Triangle(5)
    )

    // Draw all shapes and display descriptions
    shapes.forEach { shape ->
        println("--- ${shape.describe()} ---")
        shape.draw()
        println()
    }

    println("================================================")
    println("  Key Concepts Demonstrated:")
    println("  ✓ Interface: Drawable defines the contract")
    println("  ✓ Implementation: Each shape implements Drawable")
    println("  ✓ Polymorphism: Loop treats all as Drawable")
    println("  ✓ ASCII Art: Different shapes have unique patterns")
    println("  ✓ Properties: Each shape has relevant dimensions")
    println("================================================\n")

    // Advanced example: filtering shapes
    println("--- Example: Drawing only Circles ---")
    shapes.filterIsInstance<Circle>().forEach { circle ->
        circle.draw()
    }

    println("\n--- Example: Drawing only Rectangles & Squares ---")
    shapes.filterIsInstance<Rectangle>().forEach { rect ->
        rect.draw()
    }
    shapes.filterIsInstance<Square>().forEach { square ->
        square.draw()
    }

    println()
    println("✨ Interfaces enable flexible, extensible design!")
}
