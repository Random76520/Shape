abstract class Shape(_name: String) : Dimensionable {
    var name = _name

    abstract fun getArea(): Double
}