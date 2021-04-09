#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<int> nums)
{
    int answer = 1;
    sort(nums.begin(), nums.end());
    for(int i = 0; i < nums.size()-1; i++){
        if(nums[i] != nums[i+1])
            answer++;
    }
    if(answer > nums.size()/2)
        answer = nums.size()/2;
    return answer;
}
