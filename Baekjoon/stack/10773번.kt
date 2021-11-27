import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){
    val n = nextLine().toInt()!!
    val stack = mutableListOf<Int>()
    repeat(n) {
        val num:Int = nextLine().toInt()!!
        if(num == 0) stack.removeLast()
        else stack.add(num)
    }
    print(stack.sum())
}

