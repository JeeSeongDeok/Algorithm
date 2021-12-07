import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val token = nextLine()!!.split(" ")
    val n = token[0].toInt()
    var resultMoney = token[1].toInt()
    val moneyList = mutableListOf<Int>()
    var iCount = 0
    repeat(n) {
        moneyList.add(nextLine()!!.toInt())
    }
    moneyList.reversed().forEach { money ->
        if (money <= resultMoney) {
            var i = 0
            while (i * money <= resultMoney) {
                i++
            }
            i--
            resultMoney -= (money * i)
            iCount += i
        }
    }
    println(iCount)
}
