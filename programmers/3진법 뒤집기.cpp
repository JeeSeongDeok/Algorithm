#include <string>

using namespace std;

int solution(int n) {
    int answer = 0;
    int i = 1;
    // 크기 확인
    for(i; i <= n; i *= 3){}
    i = i / 3;
    // 10진법 표현
    while(n > 0){
        answer += (n%3) * i;
        i = i / 3;
        n =  n/ 3;
    }
    return answer;
}
