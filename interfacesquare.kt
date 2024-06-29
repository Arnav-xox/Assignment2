Solutions
Docs
Community
Teach
Play

2.0.0
JVM
Program arguments
Copy link
Share code
Run
interface Drawable {
    fun drawInfo()
}
​
class Square(private val sideLength: Double) : Drawable {
    override fun drawInfo() {
        println("Square with side length $sideLength")
    }
}
​
class Triangle(private val base: Double, private val height: Double) : Drawable {
    override fun drawInfo() {
        println("Triangle with base $base and height $height")
    }
}
​
fun main() {
    val shapes: List<Drawable> = listOf(
        Square(4.0),
        Triangle(3.0, 5.0)
    )
​
    for (shape in shapes) {
        shape.drawInfo()
    }
}
​
Square with side length 4.0
Triangle with base 3.0 and height 5.0