#include <string>
#include <vector>

using namespace std;

long long solution(int a, int b) {
    long long answer = 0;
    int max = a;
    int min = b;
    if(a < b){
        max = b;
        min = a;
    }
    for(int i = min; i <= max; i++)
        answer += i;
    return answer;
}
