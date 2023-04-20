def solution(array):
    answer = 0

    for i in range(len(array)):
        for j in range(i, len(array)):
            if array[i] > array[j]:
                temp = array[i]
                array[i] = array[j]
                array[j] = temp

    
    answer = array[len(array) // 2]


    return answer


if __name__ == '__main__':
    array = [9, -1, 0]
    solution(array)