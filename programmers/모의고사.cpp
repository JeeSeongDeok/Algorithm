// https://programmers.co.kr/learn/courses/30/lessons/42840?language=cpp#
#include <string>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;
bool compare(pair<int, int>a, pair<int, int>b) {
	if (a.first == b.first) {
		return a.second < b.second;
	}
	else {
		return a.first > b.first;
	}
}
vector<int> solution(vector<int> answers) {
    vector<int> answer;
    int first[5] = {1,2,3,4,5};
    int second[8] = {2,1,2,3,2,4,2,5};
    int third[10] = {3,3,1,1,2,2,4,4,5,5};
    int result[3] = {0,0,0};
    for(int i = 0; i < answers.size(); i++){
        if(first[i%5] == answers[i])
            result[0] += 1;
        if(second[i%8] == answers[i])
            result[1] += 1;
        if(third[i%10] == answers[i])
            result[2] += 1;
    }
    vector<pair<int,int>> v;
    for(int i =0; i < 3; i++){
        v.push_back(pair<int, int>(result[i], i+1));
    }
    sort(v.begin(), v.end(), compare);
    // 일단 0이 아닌지 확인 후 인설트
    if(v[0].first !=0){
        answer.push_back(v[0].second);
        // 0이랑 같으면 인설트
        if(v[0].first == v[1].first)
            answer.push_back(v[1].second);
        if(v[0].first == v[2].first)
            answer.push_back(v[2].second);
    }
    return answer;
}
