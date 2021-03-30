// 프로그래머스 레벨 1
// 주소 - https://programmers.co.kr/learn/courses/30/lessons/12969
#include <iostream>

using namespace std;

int main(void) {
    int width;
    int height;
    cin >> width >> height;
    for(int i = 0; i < height; i++){
        for (int j = 0; j < width; j++){
            cout << '*';
        }
        cout << endl;
    }
    return 0;
}
