import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val s = nextLine()!!
    val zeroResult = findResult('0', s)
    val oneResult = findResult('1', s)
    if (zeroResult < oneResult) {
        println(zeroResult)
    } else {
        println(oneResult)
    }
}

fun findResult(first: Char, s: String): Int {
    var char = first
    var iCount = 0
    var isDif: Boolean = false
    s.forEach {
        if (isDif && it == char) {
            isDif = false
            iCount++
        } else if (it != char) {
            isDif = true
        }
    }
    if (isDif)
        iCount++
    return iCount
}
