// 프로그래머스 레벨 1 카카오 2018년도 블라인드 테스트 1차 https://programmers.co.kr/learn/courses/30/lessons/17682 
#include <iostream>
#include <string>

using namespace std;

int solution(string dartResult) {
    int answer = 0;
    string numberTmp = "";
    int number[3];
    int numberIndex = 0;
    // 출력형식 점수 -> 보너스 -> 옵션
    for (int i = 0; i < dartResult.length(); i++) {
        // 점수 확인
        if (dartResult[i] >= '0' && dartResult[i] <= '9') {
            numberTmp += dartResult[i];
        }
        // 점수 확인 끝, 보너스 점수 확인
        else if (dartResult[i] == 'S' || dartResult[i] == 'D' || dartResult[i] == 'T') {
            // string to int 후 초기화
            number[numberIndex] = stoi(numberTmp);
            numberTmp = "";
            if (dartResult[i] == 'D')
                number[numberIndex] = number[numberIndex] * number[numberIndex];
            else if (dartResult[i] == 'T')
                number[numberIndex] = number[numberIndex] * number[numberIndex] * number[numberIndex];
            numberIndex++;
        }
        // 아차상
        else if (dartResult[i] == '#') {
            number[numberIndex-1] = number[numberIndex-1] * -1;
        }
        // 스타상
        else if (dartResult[i] == '*') {
            for (int i = 1; i <= 2; i++) {
                if (numberIndex - i >= 0)
                    number[numberIndex - i] = number[numberIndex - i] * 2;
            }
        }
    }
    answer = number[0] + number[1] + number[2];
    return answer;
}
 
