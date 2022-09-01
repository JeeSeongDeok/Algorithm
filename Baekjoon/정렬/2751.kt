import java.lang.StringBuilder
import java.util.*

val sb = StringBuilder()
fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLine().toInt()
    val arr = mutableListOf<Int>()

    for (index in 0 until n) {
        arr.add(nextLine().toInt())
    }
    with(arr.sorted()) {
        this.forEach {
            sb.append("$it\n")
        }
    }
    print(sb)
}
