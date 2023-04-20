def solution(age):
    answer = ''
    
    ageStr = list(str(age))

    for i in ageStr:
        answer += chr(97 + int(i))

    
        
    
    return answer


if __name__ == '__main__':
    print(solution(23))
    print(solution(51))
    print(solution(100))