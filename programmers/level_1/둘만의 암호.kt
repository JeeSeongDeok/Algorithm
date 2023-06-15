class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val secretBook = ('a'..'z').toMutableList()
        skip.forEach { token ->
            secretBook[Character.getNumericValue(token) - 10] = '-'
        }
        var result = ""
        s.forEach {
            var tokenIndex = Character.getNumericValue(it) - 10
            var count = 0
            while (count < index) {
                if (secretBook[(tokenIndex + 1) % secretBook.size] != '-') {
                    count++
                }
                tokenIndex++
            }
            result += secretBook[tokenIndex % secretBook.size]
        }
        return result
    }
}
