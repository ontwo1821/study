def solution(array):
    tempIdx = {}
     
    for i in array:
        if i in tempIdx:
            tempIdx[i] += 1
        else:
            tempIdx[i] = 1

    if len(tempIdx) == 1:
        return next(iter(tempIdx))

    sortIdx = sorted(tempIdx.items(), key = lambda x:x[1])

    if sortIdx[len(sortIdx) - 1][1] == sortIdx[len(sortIdx) - 2][1]:
        return -1
    else:
        return sortIdx[len(sortIdx) - 1][0]
    

if __name__ == '__main__':
    num_list = [1, 2, 3, 3, 3, 4]
    print(solution(num_list))

    num_list = [1, 1, 2, 2]
    print(solution(num_list))

    num_list = [2, 2]
    print(solution(num_list))