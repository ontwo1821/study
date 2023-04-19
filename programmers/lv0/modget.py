def solution(num1, num2):
    answer = num1 % num2
    return answer

if __name__ == '__main__':
    num1 = 3
    num2 = 2 
    assert 1 == solution(num1, num2)