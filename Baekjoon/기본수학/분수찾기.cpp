// https://www.acmicpc.net/problem/1193
#include <iostream>
using namespace std;

int main() {
	int X;
	cin >> X;
	int add = 1, n = 0;
	while (n < X) {
		n = n + add;
		add++;
	}
	if (add % 2 == 1)
		cout << X - n + add - 1 << "/" << n - X + 1 << endl;
	else
		cout << n - X + 1 << "/" << X - n + add - 1 << endl;
}
