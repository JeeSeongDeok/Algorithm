#include <iostream>
using namespace std;

int main() {
	int n, iCount;
	cin >> n;
	iCount = 0;
	while (n > 0) {
		if (n < 3) {
			iCount = -1;
			cout << -1;
			return 0;
		}
		else if (n % 5 == 0 && n >= 5) {
			iCount++;
			n = n - 5;
		}
		else if (n % 3 == 0) {
			iCount++;
			n = n - 3;
		}
		else {
			if (n >= 5) {
				iCount++;
				n = n -5;
			}
			else {
				iCount++;
				n = n - 3;
			}
		}
	}
	cout << iCount;
}
