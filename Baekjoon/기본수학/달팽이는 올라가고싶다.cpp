// https://www.acmicpc.net/problem/2869
#include <iostream>
using namespace std;

int main() {
	int A, B, V;
	cin >> A >> B >> V;
	int ans = (V - A) / (A - B);

	if (ans * (A - B) >= (V-A)) {
		cout << ans + 1 << endl;
	}
	else {
		cout << ans + 2 << endl;
	}
}
