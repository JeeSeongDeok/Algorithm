import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){
    val n = nextInt()!!
    val list = mutableListOf<Int>()
    repeat(n){
        list.add(nextInt())
    }
    var stack = mutableListOf<Pair<Int, Int>>()
    for (index in 1 until list.size){
        val nextInt = list[index]
        val beforeInt = list[index-1]
        if(beforeInt < nextInt){
            list[index-1] = nextInt
            while (stack.isNotEmpty() && stack.last().second < nextInt) {
                val stackIndex = stack.last().first
                list[stackIndex] = nextInt
                stack.removeLast()
            }
        } else { stack.add(Pair(index-1, beforeInt)) }
    }
    list[list.lastIndex] = -1
    while(stack.isNotEmpty()){
        val stackIndex = stack.last().first
        list[stackIndex] = -1
        stack.removeLast()
    }
    print(list.joinToString(" "))
}

