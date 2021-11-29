import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){
    while (hasNext()) {
        val str = nextLine()!!
        val stack = mutableListOf<Char>()
        run {
            str.forEach { ch ->
                when (ch) {
                    '(', '[' ->
                        stack.add(ch)
                    ')' -> {
                        if (stack.lastOrNull() == '(')
                            stack.removeLast()
                        else {
                            stack.add(')')
                            return@run
                        }
                    }
                    ']' -> {
                        if (stack.lastOrNull() == '[')
                            stack.removeLast()
                        else {
                            stack.add(']')
                            return@run
                        }
                    }
                }
            }
        }
        if (str == ".") return@with
        else if (stack.isEmpty()) println("yes")
        else println("no")
    }
}
