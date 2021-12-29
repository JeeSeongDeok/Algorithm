import java.util.*

val list = mutableListOf<String>()
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val s = nextLine()!!
    var t = nextLine()!!

    while (s.length != t.length) {
        if (t.last() == 'A') {
            t = t.dropLast(1)
        } else {
            t = t.dropLast(1)
            t = t.reversed()
        }
    }
    if (s == t) {
        println(1)
    } else {
        println(0)
    }
}
