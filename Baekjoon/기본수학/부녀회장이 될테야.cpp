#include <iostream>
using namespace std;

int main() {
	int map[16][16];
	int T;
	cin >> T;
	for (int i = 0; i <= 15; i++) {
		map[0][i] = i;
	}
	for (int i = 1; i <= 15; i++) {
		for (int j = 1; j <= 15; j++) {
			map[i][j] = 0;
			for (int k = 1; k <= j; k++) {
				map[i][j] += map[i - 1][k];
			}
		}
	}
	int result[100], a, b;
	for (int i = 0; i < T; i++) {
		cin >> a >> b;
		result[i] = map[a][b];
	}
	for (int i = 0; i < T; i++) {
		cout << result[i] << endl;
	}
}
