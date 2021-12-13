import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val token = nextLine()!!.split(" ")
    val n = token[0].toInt()
    val m = token[1].toInt()
    val list = mutableListOf<String>()
    var countList = mutableListOf<Int>()
    repeat(n) {
        list.add(nextLine()!!)
    }
    for (widthIndex in 0..n - 8) {
        for (heightIndex in 0..m - 8) {
            // 시작이 W
            countList.add(paintChessBoard(widthIndex, heightIndex, list, 'W'))
            // 시작이 B
            countList.add(paintChessBoard(widthIndex, heightIndex, list, 'B'))
        }
    }
    println(countList.sorted()[0])
}

fun paintChessBoard(width: Int, height: Int, board: MutableList<String>, startChar: Char): Int {
    var boardColor = startChar
    var differentCount = 0
    for (wIndex in width until width + 8) {
        for (hIndex in height until height + 8) {
            if (board[wIndex][hIndex] != boardColor) differentCount++
            boardColor = if (boardColor == 'W') 'B' else 'W'
        }
        boardColor = if (boardColor == 'W') 'B' else 'W'
    }
    return differentCount
}
