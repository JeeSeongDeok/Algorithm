class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var minPoint = mutableListOf<Int>(51, 51)
        var maxPoint = mutableListOf<Int>(-1, -1)
        wallpaper.forEachIndexed { rowIndex, line ->
            line.forEachIndexed { colIndex, char ->
                if (char == '#') {
                    if (minPoint[0] > rowIndex) {
                        minPoint[0] = rowIndex
                    }
                    if (minPoint[1] > colIndex) {
                        minPoint[1] = colIndex
                    }
                    if (maxPoint[0] < rowIndex) {
                        maxPoint[0] = rowIndex
                    }
                    if (maxPoint[1] < colIndex) {
                        maxPoint[1] = colIndex
                    }

                }
            }
        }
        return intArrayOf(minPoint[0], minPoint[1], maxPoint[0], maxPoint[1])
    }
}
