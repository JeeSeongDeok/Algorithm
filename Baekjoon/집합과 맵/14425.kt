import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val token = nextLine().split(" ")
    val n = token[0]
    val m = token[1]
    val answerList = mutableListOf<String>()
    repeat(n.toInt()) {
        answerList.add(nextLine())
    }
    val myList = mutableListOf<String>()
    repeat(m.toInt()) {
        myList.add(nextLine())
    }
    answerList.sort()
    var resultCount = 0
    for (str in myList) {
        var isHave = false
        var low = 0
        var high = answerList.size - 1

        while(low <= high) {
            val center = (high + low) / 2
            if (str == answerList[center]) {
                isHave = true
                break
            } else if (str < answerList[center]) {
                high = center - 1
            } else if (str > answerList[center]){
                low = center + 1
            }
        }
        if(isHave) {
            resultCount += 1
        }
    }
    print(resultCount)
}
