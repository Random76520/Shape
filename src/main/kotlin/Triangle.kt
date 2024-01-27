import kotlin.math.*

open class Triangle(name: String): Shape(name) {
    private var side1: Double = 0.00
    private var side2: Double = 0.00
    private var side3: Double = 0.00

    override fun setDimensions(vararg dimensions: Double) {
        require(dimensions.size == 3) { "Triangle requires 3 side dimensions" }
        this.side1 = dimensions[0]
        this.side2 = dimensions[1]
        this.side3 = dimensions[2]
    }

    override fun printDimensions() {
        println("Triangle - Side1: $side1, Side2: $side2, Side3: $side3")
    }

    override fun getArea(): Double {
        val s = (side1 + side2 + side3) / 2
        return sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }
}