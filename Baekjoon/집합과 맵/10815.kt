import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextLine()
    val cardList = nextLine().split(" ").map { it.toInt() }.sorted() as MutableList<Int>
    val m = nextLine()
    val myCard = nextLine().split(" ").map { it.toInt() } as MutableList<Int>

    val result = mutableListOf<Int>()
    for (card in myCard) {
        var isHave = false
        var low = 0
        var high = cardList.size - 1

        while(low <= high) {
            val center = (high + low) / 2
            if (card == cardList[center]) {
                isHave = true
                break
            } else if (card < cardList[center]) {
                high = center - 1
            } else if (card > cardList[center]){
                low = center + 1
            }
        }
        if(isHave) {
            result.add(1)
        } else {
            result.add(0)
        }
    }
    print(result.joinToString(" "))
}
