def solution(n, m, section):
    answer = 0
    job = 0
    
    # 최소 칠할 위치 부터 붓 길이 만큼 더 해가며 작업을 진행
    for sec in section:
        # 칠할 영역이 작업되있는 부분보다 크다면 작업 진행
        if sec >= job:
            job = sec + m
            answer += 1 

    return answer


if __name__ == "__main__":
    n = 8
    m = 4
    section = [2, 3, 6]

    print(solution(n, m, section))

    n = 5
    m = 4
    section = [1, 3]

    print(solution(n, m, section))

    n = 4
    m = 1
    section = [1, 2, 3, 4]

    print(solution(n, m, section))        