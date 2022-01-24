import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val token = nextLine().split(" ").map {
        it.reversed().toInt()
    }
    if (token[0] < token[1]) {
        print(token[1])
    } else {
        print(token[0])
    }
}
