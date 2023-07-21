def solution(numer1, denom1, numer2, denom2):
    answer = []
    # 분모
    bm = denom1 * denom2

    # 통분
    numer1 = bm / denom1 * numer1
    numer2 = bm / denom2 * numer2

    # 분자
    bj = numer1 + numer2

    # 2부터 시작하여 더 이상 나누어질 수 없을때까지 기약분수
    div = 2
    while div >= 2:
        if (bm % div == 0) and (bj % div == 0):
            bm = bm // div
            bj = bj // div
            div = 2
        else:
            div += 1
            if div > bm:
                break

    answer = [int(bj), int(bm)]
    return answer

if __name__ == '__main__':
    numer1 = 1
    denom1 = 2
    numer2 = 3
    denom2 = 4
    assert [5, 4] == solution(numer1, denom1, numer2, denom2)

    numer1 = 9
    denom1 = 2
    numer2 = 1
    denom2 = 3
    assert [29, 6] == solution(numer1, denom1, numer2, denom2)    