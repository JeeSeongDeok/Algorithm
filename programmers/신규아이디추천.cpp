// 프로그래머스 레벨 1 알고리즘 신규 아이디 추천 주소 - https://programmers.co.kr/learn/courses/30/lessons/72410?language=cpp
#include <string>
#include <vector>
#include <iostream>

using namespace std;

string solution(string new_id) {
    string answer = "";
    int index = 0;
    while (index < new_id.length()) {
        // 1단계 대문자 -> 소문자
        if (new_id[index] >= 'A' && new_id[index] <= 'Z') {
            new_id[index] = (char)new_id[index] + 32;
            index++;
        }
        // 2단계 알파벳 소문자, 숫자, 빼기 밑줄 마침표를 제외한 모든 문자 제거
        else if (!((new_id[index] == '-' || new_id[index] == '_' || new_id[index] == '.') || new_id[index] >= 'a' && new_id[index] <= 'z'|| new_id[index] >= '0' && new_id[index] <= '9')) {
            new_id.erase(index, 1);
            if (new_id.empty())
                new_id = "a";
        }
        // 3단계 마침표 2번이상 연속될 시 하나 제거
        else if (new_id[index] == '.' && new_id[index + 1] == '.' || new_id[index] == '.' && new_id[index-1] =='.') {
            new_id.erase(index, 1);
        }
        else {
            index++;
        }
    }
    // 4단계 . 처음 끝 제거
    if (new_id[0] == '.') {
        new_id.erase(0, 1);
        // 5단계 빈 문자열인지 확인
        if (new_id.empty())
            new_id = "a";
    }
    if (new_id[new_id.length() - 1] == '.') {
        while (new_id[new_id.length() - 1] == '.') {
            new_id.erase(new_id.length() - 1);
            // 5단계 빈 문자열인지 확인
            if (new_id.empty())
                new_id = "a";
        }
    }
    // 6단계 16자 이상 제거
    if (new_id.length() >= 16) {
        new_id.erase(15);
        while (new_id[new_id.length() - 1] == '.')
            new_id.erase(new_id.length() - 1);
    }
    // 7단계 3자 이하일 때
    if (new_id.length() < 3) {
        while (new_id.length() < 3) {
            new_id += new_id[new_id.length()-1];
        }
    }
    answer = new_id;
    return answer;
}
