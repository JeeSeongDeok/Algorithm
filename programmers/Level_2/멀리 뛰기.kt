class Solution {
    fun solution(n: Int): Long {
        val list = mutableListOf<Long>(1, 2)
        var index = 1
        if (n - 1 <= index) {
            return list[n - 1]
        }
        while (list.size < n - 1) {
            list.add((list[index] + list[index - 1]) % 1234567)
            index += 1;
        }
        return (list[index] + list[index - 1]) % 1234567
    }

}
