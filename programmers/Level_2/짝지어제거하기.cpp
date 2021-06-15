#include <iostream>
#include <string>
#include <vector>
using namespace std;

int solution(string s)
{
    vector<char> stack;
    int sIndex = -1;
    for(int i = 0; i < s.length(); i++){
        char c = s[i];
        // stack안에 있던 값이랑 동일한 경우
        if(stack[sIndex] == c && sIndex > -1){
            stack.pop_back();
            sIndex--;
        }
        else{
            stack.push_back(c);
            sIndex++;   
        }
    }
    if (stack.empty())
        return 1;
    else
        return 0;
}
