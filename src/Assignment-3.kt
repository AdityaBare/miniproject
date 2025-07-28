fun printLength(str: String?) {
    if (str == null) {
        println("String is null")
    } else {
        println(str.length)
    }
}

fun main() {
    printLength("Kotlin")
    printLength(null)
}