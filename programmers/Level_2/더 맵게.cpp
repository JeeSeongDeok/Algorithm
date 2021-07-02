#include <string>
#include <vector>
#include <queue>
#include <algorithm>
#include <iostream>
using namespace std;

int solution(vector<int> scoville, int K) {
    priority_queue<int, vector<int>, greater<int>> q;
    int combineCount = 0;
    // 큐안에 값 넣기
    for(int i = 0; i < scoville.size(); i++){
        q.push(scoville[i]);
    }
    // 큐 시작 
    while(q.top() < K && !q.empty()){
        int first = q.top();
        q.pop();
        // 두 번째 값을 불러올 수 없는 경우
        if(q.empty() && first < K)
            return -1;
        else if(q.empty() && first > K)
            return combineCount;
        // 두 번째 값을 불러온 경우
        int second =  q.top();
        q.pop();
        // 두 음식을 섞은 스코빌 지수
        int combindScoville = first + (second * 2);
        // 구한 값을 q에 push
        q.push(combindScoville);
        // 섞은 횟수 증가
        combineCount += 1;
    }
    return combineCount;
}
