#include <string>
#include <vector>

using namespace std;
int solution(vector<int> priorities, int location) {
    int answer = 1;
    int size = priorities.size();
    int index = 0;

    while (answer - 1 < priorities.size()) {
        int max = priorities.at(index);
        for (int i = index + 1; i < priorities.size(); i++) {
            if (max < priorities.at(i)) {
                max = priorities.at(i);
                index = i;
            }
        }
        // max의 인덱스까지 뒤로 넘기기
        if (index == location)
            return answer;
        else {
            for (int i = answer - 1; i < index; i++) {
                priorities.push_back(priorities.at(answer - 1));
                priorities.erase(priorities.begin() + answer - 1);
                location--;
                if (location < answer - 1)
                    location = priorities.size()-1;
            }
            index = answer;
            answer++;
        }
    }

    return answer;
}
