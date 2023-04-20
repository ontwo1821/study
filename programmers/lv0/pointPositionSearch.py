def solution(dot):
    answer = 0

    dot1 = dot[0] > 0
    dot2 = dot[1] > 0

    if dot1 and dot2:
        answer = 1
    elif not dot1 and dot2:
        answer = 2
    elif not dot1 and not dot2:
        answer = 3
    elif dot1 and not dot2:
        answer = 4

    return answer

if __name__ == '__main__':
    dot = [2, 4]
    dot = [-7, 9]
    print(solution(dot))
