// https://programmers.co.kr/learn/courses/30/lessons/42576?language=cpp
#include <string>
#include <vector>
#include <map>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";
    int index = 0;
    map<string, int> result_map;
    while (participant.size() > index) {
        // participant 먼저 점검
        result_map[participant[index]] += 1;
        // completion 점검 전 사이즈가 크면 인덱스 에러뜨기땜에 점검
        if (index < completion.size()) {
            result_map[completion.at(index)] += 1;
        }
        index++;
    }
    for (int i = 0; i < result_map.size(); i++) {
        if (result_map[participant[i]] % 2 != 0 || result_map[participant[i]] == 0) {
            answer = participant[i];
            break;
        }
    }
    return answer;
}
