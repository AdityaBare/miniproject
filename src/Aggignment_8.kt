import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.in)
    var cond: String
    do {
        var i = 10
        while (i >= 1) {
            println(i)
            i--
        }
        println("Enter yes to continue and no to stop")
        cond = sc.next()
    } while (cond.equals("yes", ignoreCase = true))

    sc.close()
}