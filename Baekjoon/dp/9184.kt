import java.util.*

val wList = Array(21) { Array(21) { Array(21) { -1 } } }
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    while (true) {
        val token = nextLine().split("\\s".toRegex()).map { it.toInt() }
        if(token[0] == -1 && token[1] == -1 && token[2] == -1) {
            return@with 
        }
        println("w(${token[0]}, ${token[1]}, ${token[2]}) = ${w(token[0], token[1], token[2])}")
    }
}

fun w(a: Int, b: Int, c: Int): Int {
    if (a <= 0 || b <= 0 || c <= 0)
        return 1
    else if (a > 20 || b > 20 || c > 20)
        return w(20, 20, 20)
    else if (b in (a + 1) until c) {
        if (wList[a][b][c - 1] == -1) {
            wList[a][b][c - 1] = w(a, b, c - 1)
        }
        if (wList[a][b - 1][c - 1] == -1) {
            wList[a][b - 1][c - 1] = w(a, b - 1, c - 1)
        }
        if (wList[a][b - 1][c] == -1) {
            wList[a][b - 1][c - 1] = w(a, b - 1, c - 1)
        }

        return wList[a][b][c - 1] + wList[a][b - 1][c - 1] - wList[a][b - 1][c - 1]
    } else {
        if (wList[a - 1][b][c] == -1) {
            wList[a - 1][b][c] = w(a - 1, b, c)
        }
        if (wList[a - 1][b - 1][c] == -1) {
            wList[a - 1][b - 1][c] = w(a - 1, b - 1, c)
        }
        if (wList[a - 1][b][c - 1] == -1) {
            wList[a - 1][b][c - 1] = w(a - 1, b, c - 1)
        }
        if (wList[a - 1][b - 1][c - 1] == -1) {
            wList[a - 1][b - 1][c - 1] = w(a - 1, b - 1, c - 1)
        }

        return wList[a - 1][b][c] + wList[a - 1][b - 1][c] + wList[a - 1][b][c - 1] - wList[a - 1][b - 1][c - 1]
    }
}
