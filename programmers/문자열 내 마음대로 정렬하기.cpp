#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<string> strings, int n) {
    vector<string> answer;
    
    while(!strings.empty()){
        string min = strings.back();
        strings.pop_back();
        
        for(int i = 0; i < strings.size(); i++){
            if(min[n] > strings[i][n]){
                strings.push_back(min);
                min = strings[i];
                strings.erase(strings.begin() + i);
                i--;
            }
            else if(min[n] == strings[i][n]){
                int index = 0;
                while(index < min.length() && strings[i].length() > index){
                    if(min[index] > strings[i][index]){
                        strings.push_back(min);
                        min = strings[i];
                        strings.erase(strings.begin() + i);
                        i--;
                        break;
                    }
                    else if(min[index] < strings[i][index])
                        break;
                    index++;
                }
            }
        }
        answer.push_back(min);
    }
    return answer;
}
