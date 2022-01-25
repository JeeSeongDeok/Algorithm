#include <iostream>
using namespace std;

bool check(int n) {
	if (n == 1)
		return false;
	for (int j = 2; j <= sqrt(n); j++) {
		if (n % j == 0) return false;
	}
	return true;
}
int main() {
	int first, second;
	cin >> first >> second;
	int arr[10001];
	int n = 0;

	for (int i = first; i <= second; i++) {
		if (check(i)){
			arr[n] = i;
			n++;
		}
	}
	if (n == 0) {
		cout << -1 << endl;
	}
	else {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		cout << sum << endl;
		cout << arr[0] << endl;
	}
}
