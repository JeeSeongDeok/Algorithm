class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val startPosition = mutableListOf<Int>(0, 0)
        val stopPosition = mutableListOf<Pair<Int, Int>>()
        val col = park.size
        var row = -1
        park.forEachIndexed { parkIndex, line ->
            line.forEachIndexed { lineIndex, char ->
                if (char == 'S') {
                    startPosition[0] = parkIndex
                    startPosition[1] = lineIndex
                    row = line.length
                }
                if (char == 'X') {
                    stopPosition.add(Pair(parkIndex, lineIndex))
                }
            }
        }

        for (route in routes) {
            val token = route.split(" ")
            val op = token[0]
            val n = token[1].toInt()
            var flag = true
            when (op) {
                "N" -> {
                    for (stop in stopPosition) {
                        if (stop.second == startPosition[1] && (startPosition[0] >= stop.first && stop.first >= startPosition[0] - n)) {
                            flag = false
                            break
                        }
                    }
                    if (startPosition[0] - n > -1 && flag) {
                        startPosition[0] -= n
                    }
                }

                "S" -> {
                    for (stop in stopPosition) {
                        if (stop.second == startPosition[1] && (startPosition[0] <= stop.first && stop.first <= startPosition[0] + n)) {
                            flag = false
                            break
                        }
                    }
                    if (startPosition[0] + n < col && flag) {
                        startPosition[0] += n
                    }
                }

                "W" -> {
                    for (stop in stopPosition) {
                        if (stop.first == startPosition[0] && (startPosition[1] >= stop.second && stop.second >= startPosition[1] - n)) {
                            flag = false
                            break
                        }
                    }

                    if (startPosition[1] - n > -1 && flag) {
                        startPosition[1] -= n
                    }
                }

                "E" -> {
                    for (stop in stopPosition) {
                        if (stop.first == startPosition[0] && (startPosition[1] <= stop.second && stop.second <= startPosition[1] + n)) {
                            flag = false
                            break
                        }
                    }
                    if (startPosition[1] + n < row && flag) {
                        startPosition[1] += n
                    }
                }
            }
        }
        return intArrayOf(startPosition[0], startPosition[1])
    }
}
