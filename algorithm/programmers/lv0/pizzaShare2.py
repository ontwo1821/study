def solution(n):
    answer = 1
    pizzaPiece = 6

    while 1:
        temp = pizzaPiece * answer
        # 6의 배수로 피자 조각이 남거나 모자르지 않는 수를 찾음
        if temp % n == 0:
            break
        answer += 1

    return answer

if __name__ == '__main__':
    assert 1 == solution(6)
    assert 5 == solution(10)
    assert 2 == solution(4)
    