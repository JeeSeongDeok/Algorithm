// 주소 - https://programmers.co.kr/learn/courses/30/lessons/64061?language=cpp
#include <string>
#include <vector>
#include <stack>

using namespace std;

int solution(vector<vector<int>> board, vector<int> moves) {
    int answer = 0;
    stack<int> s;
    // Move 아이템 탐색
    for (int i = 0; i < moves.size(); i++) {
        int boardIndex = moves.at(i) - 1;
        for (int j = 0; j < board.size(); j++) {
            int item = board[j][boardIndex];
            // item을 들고왔을 경우
            if (item != 0) {
                // stack이 안비고, top이 item이랑 같은 경우
                if (!s.empty() && s.top() == item) {
                    s.pop();
                    answer += 2;
                }
                // stack이 비어있거나, top이 item이랑 같지 않은 경우
                else {
                    s.push(item);
                }
                // 그리고 아이템 값을 꺼냇으니 초기화
                board[j][boardIndex] = 0;
                break;
            }
        }
    }
    return answer;
}
