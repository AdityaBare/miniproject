
data class Student(val name: String, val age: Int, val company: String)
fun main() {
    val students = listOf(
        Student("Nilesh", 19, "Infosys"),
        Student("vaibhav", 20, "TCS"),
        Student("Karan", 21, "Wipro"),
        Student("Varad", 22, "Capgemini"),
        Student("Shubham", 23, "Accenture")
    )
    println("Immutable List: $students")
    val mutableStudents = mutableListOf("Anushka", "Ravi", "Meera", "Amit", "Pooja")
    mutableStudents.add("Nilesh")
    mutableStudents.add("vaibhav")
    mutableStudents[1] = "Karan"
    mutableStudents.remove("varad")
    println("Element at index 2: ${mutableStudents[2]}")
    println("Using for loop:")
    for (name in mutableStudents) {
        println(name)
    }
    println("Using iterator:")
    val iterator = mutableStudents.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}
