import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val token = nextLine().split(" ")
    val n = token[0]
    val pocketMonsterMap = mutableMapOf<String, Int>()
    var indexCount = 1
    repeat(n.toInt()) {
        pocketMonsterMap[nextLine()] = indexCount
        indexCount += 1
    }
    val reversedMap = pocketMonsterMap.entries.associate{(k,v)-> v to k}
    repeat(token[1].toInt()) {
        val question: String = nextLine()
        if(isNumber(question)) {
            println(reversedMap[question.toInt()])
        } else {
            println(pocketMonsterMap[question])
        }
    }
}

fun isNumber(input:String): Boolean = input.toIntOrNull() != null
