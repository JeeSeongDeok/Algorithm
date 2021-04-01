//https://www.acmicpc.net/problem/10250
#include <iostream>
using namespace std;

int main() {
	int T;
	int I[1000];
	int J[1000];
	cin >> T;
	for (int i = 0; i < T; i++) {
		int H, W, N;
		cin >> H >> W >> N;
		if (N % H == 0) {
			I[i] = H;
			J[i] = N / H;
		}
		else {
			I[i] = N % H;
			J[i] = N / H + 1;
		}
	}
	for (int i = 0; i < T; i++) {
		if (J[i] > 9) {
			cout << I[i] << J[i] << endl;
		}
		else {
			cout << I[i] << "0" << J[i] << endl;
		}
	}
}
