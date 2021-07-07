#include <iostream>

using namespace std;

int cal(int n){
    int iResult = n / 2;
    if(n % 2 == 1)
        iResult+=1;
    return iResult;
}

int solution(int n, int a, int b)
{
    int iRound = 1;
    // a > b
    int iBig = a;
    int iSmall = b;
    if(a < b){
        iBig = b;
        iSmall = a;
    }
    // 만날 경우 끝남
    while(iBig - 1 != iSmall || iBig % 2 != 0){
        // iBig 계산
        iBig = cal(iBig);
        // iSmall 계산
        iSmall = cal(iSmall);
        // 라운드 카운트
        iRound++;
    }
    
    return iRound;
}
