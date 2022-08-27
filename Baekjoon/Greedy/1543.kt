import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val doc = nextLine()
    val word = nextLine()

    val list = Regex(word).findAll(doc)
        .map { it.range.first }
        .toList()
    print(list.size)
}
