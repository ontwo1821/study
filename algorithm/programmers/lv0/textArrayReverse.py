def solution(my_string):
    answer = ''
    for i in range(len(my_string), 0, -1):
        answer += my_string[i-1]
    return answer

if __name__ == '__main__':
    print(solution("jaron"))