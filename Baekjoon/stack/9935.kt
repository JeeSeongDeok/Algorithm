import java.util.*
import java.util.ArrayDeque

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val word = nextLine()
    val removeWord = nextLine()
    val stack = Stack<Char>()
    val rememberStack = mutableListOf<Char>()

    word.forEach {
        stack.add(it)
        var index = removeWord.lastIndex
        while (stack.lastOrNull() == removeWord[index]) {
            if (stack.last() == removeWord[index]) {
                rememberStack.add(stack.pop())
            }
            index -= 1
            if (index == -1) {
                rememberStack.clear()
                index = removeWord.lastIndex
            }
        }
        if (rememberStack.isNotEmpty()) {
            rememberStack.reversed().forEach { element ->
                stack.add(element)
            }
            rememberStack.clear()
        }

    }

    if (stack.isEmpty()) print("FRULA")
    else print(stack.joinToString(""))
}
