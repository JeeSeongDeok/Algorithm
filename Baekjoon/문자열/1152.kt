import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val str = nextLine()
    var iCount = 0
    for (token in str) {
        iCount += when (token) {
            'A', 'B', 'C' -> 3
            'D', 'E', 'F' -> 4
            'G', 'H', 'I' -> 5
            'J', 'K', 'L' -> 6
            'M', 'N', 'O' -> 7
            'P', 'Q', 'R', 'S' -> 8
            'T', 'U', 'V' -> 9
            'W', 'X', 'Y', 'Z' -> 10
            else -> 11
        }
    }
    print(iCount)
}
