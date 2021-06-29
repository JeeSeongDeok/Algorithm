#include <string>
#include <vector>
#include <algorithm>
using namespace std;

string solution(string number, int k) {
    for(int i = 0; i < k; i++){
        int min = number[0] - '0';
        int index = 0;
        for(int j = 1; j < number.size(); j++){
            if(min > number[j] - '0'){
                min = number[j] - '0';
                index = j;
            }
            else if(min < number[j] - '0'){
                break;
            }
        }
        number.erase(index, 1);
    }
    
    return number;
}
