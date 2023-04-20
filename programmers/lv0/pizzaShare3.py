def solution(slice, n):
    answer = 0

    while 1:
        answer += 1
        temp = slice * answer
        if temp / n >= 1:
            break

    return answer

if __name__ == '__main__':
    assert 2 == solution(7, 10)
    assert 3 == solution(4, 12)
    