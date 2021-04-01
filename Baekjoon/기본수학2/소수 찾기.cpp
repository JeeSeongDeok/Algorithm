#include <iostream>
#include <cmath>
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
	int n;
	
	cin >> n;
	int arr[1001];
	int count = 0;
	for (int i = 0; i < n; i++)
		cin >> arr[i];

	for (int i = 0; i < n; i++) {
		if (check(arr[i]))
			count++;
	}
	cout << count << endl;
}
