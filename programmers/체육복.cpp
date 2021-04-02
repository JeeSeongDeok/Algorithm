//https://programmers.co.kr/learn/courses/30/lessons/42862?language=cpp#
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = n - lost.size();
    int lostIndex = 0;
    sort(lost.begin(), lost.end());
    sort(reserve.begin(), reserve.end());
    while(lostIndex < lost.size()){
        for(int j = 0; j < reserve.size(); j++){
            if(lost.at(lostIndex) - 1 == reserve.at(j) || lost.at(lostIndex) == reserve.at(j) || lost.at(lostIndex) + 1 == reserve.at(j)){
                if(j+1 < reserve.size()&&lost.at(lostIndex) == reserve.at(j+1)){
                    lost.erase(lost.begin() + lostIndex);
                    reserve.erase(reserve.begin() + j+1);
                    lostIndex--;
                    answer++;
                    break; 
                } 
                else if(lostIndex+1 < lost.size() && lost.at(lostIndex+1) == reserve.at(j)){
                    lost.erase(lost.begin() + lostIndex+1);
                    reserve.erase(reserve.begin() + j);
                    lostIndex--;
                    answer++;
                    break; 
                }
                else{
                    lost.erase(lost.begin() + lostIndex);
                    reserve.erase(reserve.begin() + j);
                    lostIndex--;
                    answer++;
                    break;
                }
            }
        }
        lostIndex++;
    }
    return answer;
}
