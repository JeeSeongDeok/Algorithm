#include <string>
#include <vector>
#include <sstream>
#include <map>
#include <iostream>

using namespace std;

vector<string> solution(vector<string> record) {
    vector<string> answer;
    string str;
    map<string, string> nickname;
    // Change 확인
    for(int i =0; i < record.size(); i++){
        if(record[i][0] == 'L')
            continue;
        stringstream ss(record[i]);
        ss >> str;
        ss >> str;
        string uid = str;
        ss >> str;
        string name = str;
        if(nickname[uid] == ""){
            nickname[uid] = name;
        }
        else if(nickname[uid] != name){
            nickname[uid] = name;
        }
    }
    // 정답 추출
    for(int i = 0; i < record.size(); i++){
        stringstream ss(record[i]);
        ss >> str;
        ss >> str;
        if(record[i][0] == 'E'){
            answer.push_back(nickname[str] + "님이 들어왔습니다.");
        }
        else if(record[i][0] == 'L'){
            answer.push_back(nickname[str] + "님이 나갔습니다.");
        }
    }
    return answer;
}
