import kotlin.math.sqrt

open class EquilateralTriangle(name: String): Triangle(name) {
    private var side: Double = 0.00

    override fun setDimensions(vararg dimensions: Double) {
        require(dimensions.size == 1) { "EquilateralTriangle requires 1 side dimension" }
        this.side = dimensions[0]
    }

    override fun printDimensions() {
        println("Equilateral Triangle - Side: $side")
    }

    override fun getArea(): Double {
        val s = (side * 3) / 2
        return sqrt(s * (s - side) * (s - side) * (s - side))
    }
}