import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    print(nextLine()!!.toList().sortedDescending().joinToString(""))
}
