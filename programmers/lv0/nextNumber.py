def solution(common):
    answer = 0
    step1 = common[2] - common[1]
    step0 = common[1] - common[0]
    minS = min(step1, step0)
    maxS = max(step1, step0)
    
    if step1 == step0:
        answer = common[len(common) - 1] + step0
    else:
        answer = common[len(common) - 1] * (maxS / minS)
    return int(answer)

if __name__ == '__main__':
    common = [3, 9, 27]
    print(solution(common))

    common = [3, 6, 12, 24]
    print(solution(common))

    common = [1, 3, 5, 7]
    print(solution(common))

    common = [1, 2, 3, 4]
    print(solution(common))
    common = [2, 4, 8]
    print(solution(common))