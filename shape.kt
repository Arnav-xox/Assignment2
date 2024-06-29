abstract class Shape {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}
class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}
class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Rectangle(5.0, 3.0),
        Circle(4.0)
    )

    for (shape in shapes) {
        println("Area: ${shape.area()}")
        println("Perimeter: ${shape.perimeter()}")
    }
}
