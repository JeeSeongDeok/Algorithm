// https://www.acmicpc.net/problem/1712
#include <iostream>
using namespace std;

int main() {
	long A, B, C;
	cin >> A >> B >> C;
	int n = 1;
	if (B >= C)
		cout << -1;
	else {

		cout << (A/(C - B)) + 1;
	}
	return 0;
}
