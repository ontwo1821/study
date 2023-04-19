def solution(my_string, n):
    answer = ''
    for i in my_string:
        answer += i * n
    return answer

if __name__ == '__main__':
    print(solution("hello", 3))