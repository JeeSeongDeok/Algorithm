import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val money = nextLine().toInt()
    val n = nextLine().toInt()
    var myMoney: Int = 0
    repeat(n) {
        val token = nextLine().split(" ").map { it.toInt() }
        myMoney += (token[0] * token[1])
    }
    if(money == myMoney) {
        print("YES")
    } else {
        print("NO")
    }
}
