#include <string>
#include <vector>
#include <cmath>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;
    double first = ceil((100 - (double)progresses[0]) / (double)speeds[0]);
    int iCount = 1;
    for(int i = 1; i < progresses.size(); i++){
        double day = ceil((100 - (double)progresses[i]) / (double)speeds[i]);
        if(first >= day){
            iCount++;
        }
        else{
            answer.push_back(iCount);
            iCount = 1;
            first = day;
        }
        if(i == progresses.size() - 1)
            answer.push_back(iCount);
    }
    return answer;
}
