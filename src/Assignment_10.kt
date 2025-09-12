class Person(val name: String, val age: Int) {
    constructor(name: String) : this(name, 18)
    init {
        println("Person created → Name: $name, Age: $age")
    }
}
fun main() {
    val person1 = Person("Sarika", 22)
    val person2 = Person("Aditya")
}