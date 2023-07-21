def solution(numbers):
    answer = [i * 2 for i in numbers]
    return answer

if __name__ == '__main__':
    numbers = [1, 2, 3, 4, 5]
    solution(numbers)

    numbers = [1, 2, 100, -99, 1, 2, 3]	
    solution(numbers)