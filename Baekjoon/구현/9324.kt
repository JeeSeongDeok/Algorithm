import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLine()!!.toInt()

    repeat(n) {
        val str = nextLine()!!
        val map = mutableMapOf<Char, Int>()
        // init
        for (char in 65..90) {
            map[char.toChar()] = 0
        }
        var boolean = false
        //
        for ((index, value) in str.withIndex()) {
            if (map[value]!! < 2) {
                map[value] = map[value]!! + 1
            } else if (map[value] == 2) {
                if (value == str.getOrNull(index + 1)) {
                    map[value] = -1
                } else {
                    boolean = true
                    println("FAKE")
                    break
                }
            }
        }
        if (!boolean) println("OK")
    }
}
