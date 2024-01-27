import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val square: Shape = Square("Square")
    val circle: Shape = Circle("Circle")
    val triangle: Shape = Triangle("Triangle")
    val equilateralTriangle: Shape = EquilateralTriangle("Equilateral Triangle")

    enterDimensions(square, scanner)
    printShapeDetails(square)

    enterDimensions(circle, scanner)
    printShapeDetails(circle)

    enterDimensions(triangle, scanner)
    printShapeDetails(triangle)

    enterDimensions(equilateralTriangle, scanner)
    printShapeDetails(equilateralTriangle)

    scanner.close()
}

fun enterDimensions(shape: Shape, scanner: Scanner) {
    print("Enter dimensions for ${shape.name}: ")
    when (shape) {
        is Square -> shape.setDimensions(scanner.nextDouble())
        is Circle -> shape.setDimensions(scanner.nextDouble())
        is EquilateralTriangle -> shape.setDimensions(scanner.nextDouble())
        is Triangle -> shape.setDimensions(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble())
    }
}

fun printShapeDetails(shape: Shape) {
    // Print name, dimensions, and area for each object
    println("Name: ${shape.name}")
    shape.printDimensions()
    println("Area: ${shape.getArea()}")
    println()
}