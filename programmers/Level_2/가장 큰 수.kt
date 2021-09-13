class Solution {
    fun solution(numbers: IntArray): String {
        var answer = ""
        var sortArr = arrayOf<String>()
        
        for(i in numbers){
            sortArr += i.toString()
        }
        sortArr.sortWith(Comparator<String>{ a, b ->
            when{
                a.length == b.length -> b.compareTo(a)
                else-> (b+a).compareTo(a+b)
            }
        })
        
        for(i in sortArr){
            answer += i
        }
        if(answer.elementAt(0) == '0')
            return "0"
        return answer
    }
}
