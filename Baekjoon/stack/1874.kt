import java.io.*
import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val sb = StringBuilder()
    val stack = Stack<Int>()
    var cur = 1
    for(i in 0 until n) {
        val cmd = br.readLine().toInt()
        while(cur<=cmd){
            stack.push(cur)
            sb.append("+\n")
            cur += 1
        }
        if (cmd == stack.last()) {
            stack.pop()
            sb.append("-\n")
        }
        else {
            println("NO")
            return

        }
    }
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}
