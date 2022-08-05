import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val list = nextLine().chunked(1)
    val map = mutableMapOf<String, Int>()

    for (element in 'a'..'z') {
        map[element.toString()] = -1
    }

    list.forEachIndexed { index, s ->
        if (map[s] == -1) {
            map[s] = index
        }
    }

    for (mapItem in map) {
        print("${mapItem.value} ")
    }
}
