/**
* 백준은 .max()를 지원해주지 않아서 이대로 코드를 나둠.
*/
import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val colorList = mutableListOf<String>()
    val numberList = mutableListOf<Int>()

    repeat(5) {
        val token = nextLine().split(" ")
        colorList.add(token[0])
        numberList.add(token[1].toInt())
    }
    val distinctColorList = colorList.distinct()
    val distinctNumberList = numberList.distinct()
    var isNumberContinue = false
    // 연속적인 숫자 확인
    with(numberList.sorted()) {
        var num = -1
        this.forEach {
            if (num == -1 || num + 1 == it) {
                num = it
            } else {
                return@with
            }
        }
        isNumberContinue = true
    }
    var result = 0
    // Color Check
    if (distinctColorList.size == 1) {
        result = if (isNumberContinue)
            900 + numberList.max()
        else
            600 + numberList.max()
    }
    if (distinctNumberList.size == 2) {
        var firstNum = numberList.count { it == distinctNumberList[0] }
        var secondNum = numberList.count { it == distinctNumberList[1] }

        if (firstNum < secondNum) {
            val tmp = firstNum
            firstNum = secondNum
            secondNum = tmp
        }

        if (firstNum == 4 && result < 800 + firstNum ) {
            result = 800 + firstNum
        }
        if (firstNum == 3 && secondNum == 2 && result < 700 + firstNum * 10 + secondNum) {
            result = 700 + firstNum * 10 + secondNum
        }

    }
    if (isNumberContinue && result < 500 + numberList.max())
        result = 500 + numberList.max()
    if (distinctNumberList.size == 3) {
        val tmpList = mutableListOf<Pair<Int, Int>>()
        distinctNumberList.forEach { distinctNum ->
            tmpList.add(Pair(numberList.count {it == distinctNum}, distinctNum))
        }
        with(tmpList.sortedBy { it.first }) {
            if(this.last().first == 3 && result < 500 + this.last().second) {
                result = 500 + this.last().second
            } else if (this.last().first == 2 && this[2].first == 2) {
                val low = if(this.last().second > this[2].second) {
                    this[2].second
                } else {
                    this.last().second
                }
                val high = if(this.last().second < this[2].second) {
                    this[2].second
                } else {
                    this.last().second
                }
                if (result < 300 + high * 10 + low) result = 300 + high * 10 + low
            }
        }
    }

    if (distinctNumberList.size == 4) {
        val tmpList = mutableListOf<Pair<Int, Int>>()
        distinctNumberList.forEach { distinctNum ->
            tmpList.add(Pair(numberList.count {it == distinctNum}, distinctNum))
        }
        with(tmpList.sortBy{it.first}) {
            if (result < 200 + tmpList.last().second)
                result = 200 + tmpList.last().second
        }
    } else {
        if(result < 100 + numberList.max())
            result = 100 + numberList.max()
    }
    print(result)
}
