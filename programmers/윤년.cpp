#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string arr[7] = { "SUN","MON","TUE","WED","THU","FRI","SAT"};
	int check = 4;
	for (int i = 1; i < a; i++) {
		if (i % 2 == 1 && a != 1) {
            if(i < 9)
                check += 3;
            else
                check += 2;
		}
		else if (i % 2 == 0 && i != 2) {
            if(i < 8)
                check += 2;
            else
                check += 3;
		}
		else if (i % 2 == 0 && i == 2) {
			check += 1;
		}
	}
	
	check += b;
	check = check % 7;
    return arr[check];
}
