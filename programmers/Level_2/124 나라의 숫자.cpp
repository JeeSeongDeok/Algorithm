#include <string>
#include <vector>

using namespace std;
string solution(int n) {
	string answer = "";

	if (n / 3 > 3) {
		if (n % 3 == 0)
			answer += solution((n - 1) / 3);
		else
			answer += solution(n / 3);
		answer += solution(n % 3);
	}
	else if (n > 3) {
		if (n % 3 == 0)
			answer += to_string((n - 1) / 3);
		else if (n / 3 == 1)
			answer += "1";
		else if (n / 3 == 2)
			answer += "2";
		else if (n / 3 == 3)
			answer += "4";
		answer += solution(n % 3);
	}
	else if (n < 4) {
		if (n % 3 == 0)
			answer += "4";
		else if (n % 3 == 1)
			answer += "1";
		else if (n % 3 == 2)
			answer += "2";
	}


	return answer;
}
