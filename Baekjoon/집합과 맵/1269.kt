import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    nextLine()
    val a = nextLine().split(" ").map { it.toInt() }.sorted()
    val b = nextLine().split(" ").map { it.toInt() }.sorted()
    var elementCount = 0

    for(aElement in a) {
        elementCount += search(aElement, b)
    }

    print("${(a.size - elementCount) + (b.size - elementCount)}")
}

fun search(element: Int, list: List<Int>): Int {
    var low = 0
    var high = list.size - 1

    while(low <= high) {
        val center = (low + high) / 2
        if(element == list[center]) {
            return 1
        } else if (element < list[center]) {
            high = center - 1
        } else {
            low = center + 1
        }
    }
    return 0
}
