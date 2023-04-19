def solution(num_list):
    answer = [num_list[i-1] for i in range(len(num_list), 0, -1)]
    return answer

if __name__ == '__main__':
    num_list = [1, 2, 3, 4, 5]
    print(solution(num_list))