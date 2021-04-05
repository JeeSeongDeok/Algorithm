#include <string>
#include <vector>
#include <iostream>
using namespace std;

int solution(string skill, vector<string> skill_trees) {
    int answer = 0;
    vector<int> v;
    for(int index = 0; index < skill_trees.size(); index++){
        v.clear();
        int check = 0;
        for(int i = 0; i < skill.length(); i++){
            if(skill_trees.at(index).find(skill[i]) != string::npos){
                v.push_back(skill_trees.at(index).find(skill[i]));
            }
            else if(skill_trees.at(index).find(skill[i]) == string::npos){
                v.push_back(-1);
            }
        }
        int start = v[0];
        for(int i = 1; i < v.size(); i++){
            if(start == -1 && v[i] != -1){
                check = 1;
                break;
            }
            else if(start > v[i] && v[i] != -1){
                check = 1;
                break;
            }
            else{
                start = v[i];
            }
        }
        if(check != 1)
            answer += 1;
    }
    
    
    return answer;
}
