#include <string>
#include <iostream>
#include <vector>
#include <stack>
using namespace std;

int solution(string s) {
    int iSplit = 1;
    int mAnswer = 999999999;
    if(s.length() == 1)
        return 1;
    while(iSplit < s.length() / 2 + 1){
        int sLength = 0;
        string sResult = "";
        string sSplit = "";
        stack<string> sStack;
        int sIndex = 0;
        for(sIndex = 0; sIndex < s.length(); sIndex += iSplit){
            sSplit = s.substr(sIndex, iSplit);
            // Stack이 비어있을 경우
            if(sStack.empty())
                sStack.push(sSplit);
            // Stack 안의 값이 같을 경우
            else if(sStack.top() == sSplit){
                sStack.push(sSplit);
            }
            // Stack 안의 값과 현재 인덱스 값이 다른 경우
            else{
                // 길이 계산
                sLength += sStack.top().length();
                if(sStack.size() >= 1000)
                    sLength += 4;
                else if(sStack.size() >= 100)
                    sLength += 3;
                else if(sStack.size() >= 10)
                    sLength += 2;
                else if(sStack.size() > 1)
                    sLength += 1;
                // stack clear
                while(!sStack.empty())
                    sStack.pop();
                // 현재 인덱스 값 push
                sStack.push(sSplit);
            }
        }
        // stack 안에 있는 남은 값 처리
        sLength += sStack.top().length();
        if(sStack.size() >= 1000)
            sLength += 4;
        else if(sStack.size() >= 100)
            sLength += 3;
        else if(sStack.size() >= 10)
            sLength += 2;
        else if(sStack.size() > 1)
            sLength += 1;
        
        if(mAnswer > sLength)
            mAnswer = sLength;
        iSplit++;
    }
    
    return mAnswer;
}
