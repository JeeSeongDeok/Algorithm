def solution(board, moves):
    answer = 0
    stack = []
    stackIndex = 0
    size = len(board)
    for move in moves:
        for i in range(size):
            if(board[i][move-1] != 0):
                stack.append(board[i][move-1])
                board[i][move-1] = 0
                stackIndex += 1
                if(stackIndex > 1 and stack[stackIndex-1] == stack[stackIndex-2]):
                    stack.pop()
                    stack.pop()
                    stackIndex -= 2
                    answer +=2
                break
    return answer
