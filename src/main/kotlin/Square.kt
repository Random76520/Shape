class Square(name: String) : Shape(name) {
    private var length: Double = 0.0

    override fun setDimensions(vararg dimensions: Double) {
        require(dimensions.size == 1) { "Square requires 1 side dimension" }
        this.length = dimensions[0]
    }

    override fun printDimensions() {
        println("Square - Side Length: $length")
    }

    override fun getArea(): Double {
        return length * length
    }
}