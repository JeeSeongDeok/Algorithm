import java.util.*

fun main(args: Array<String>) =with(Scanner(System.`in`)){
val testCase = nextLine().toInt()

repeat(testCase){
val tokenList = nextLine().split(" ")
        val n = tokenList[0].toInt()
        val str = tokenList[1]

        str.forEach{char->
repeat(n){
print(char)
}
        }
println()
}
}

