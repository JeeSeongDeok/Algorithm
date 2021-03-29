# https://programmers.co.kr/learn/courses/30/lessons/68644?language=python3
def solution(numbers):
    answer = []
    tmp = []
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            tmp.append(numbers[i] + numbers[j])
    for i in tmp:
        if i not in answer:
            answer.append(i)
    answer.sort()
    return answer
