def solution(n):
    if n > 7:
        answer = n // 7
        if n % 7 > 0:
            answer += 1
    else:
        answer = 1
    return answer

if __name__ == '__main__':
    print(solution(7))
    print(solution(1))
    print(solution(15))