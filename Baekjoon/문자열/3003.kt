import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val token = nextLine().split(" ").map { it.toInt() }
    print("${1 - token[0]} ${1 - token[1]} ${2 - token[2]} ${2 - token[3]} ${2 - token[4]} ${8 - token[5]}")
}
