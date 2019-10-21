open class Animal(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Animal(pName, pWeight)


fun main() {
    val cat = Cat("Dog Vulls", 2.0)
    println("Nama Anjing: ${cat.name}")
    // println("Berat Kucing: ${cat.weight}") <- Cannot access 'weight': it is protected in 'Cat'
}
