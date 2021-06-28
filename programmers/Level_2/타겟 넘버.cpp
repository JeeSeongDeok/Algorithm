#include <string>
#include <vector>
#include <iostream>
using namespace std;

int answer = 0;
int iTarget = 0;
void dfs(int result, int depth, vector<int> numbers){
    if(depth == numbers.size()){
        if(result == iTarget)
            answer++;
        return;
    }
    else if(depth < numbers.size()){
        dfs(result+numbers[depth], depth+1, numbers);
        dfs(result-numbers[depth], depth+1, numbers);
    }
}
int solution(vector<int> numbers, int target) {
    iTarget = target;
    
    dfs(numbers[0], 1, numbers);
    dfs(numbers[0] * -1, 1, numbers);
    return answer;
}
