def solution(numbers):
    answer = sum(i for i in numbers) / len(numbers)
    return answer

if __name__ == '__main__':
    numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    solution(numbers)