def solution(num, total):
    answer = []

    med = total // num

    # 짝수인 경우와 홀수인 경우에 따라 다르게 진행한다.
    if num % 2 == 0:
        #앞배열
        answer = [i for i in range(med - num // 2 + 1, med)]
        #뒤배열
        answer = answer + [i for i in range(med, med + num // 2 + 1)]
    else:
        #앞배열
        answer = [i for i in range(med - num // 2, med)]
        #뒤배열
        answer = answer + [i for i in range(med, med + num // 2 + 1)]

    return answer

if __name__ == '__main__':
    num = 3
    total = 12
    assert [3, 4, 5] == solution(num, total)

    num = 5
    total = 15
    assert [1, 2, 3, 4, 5] == solution(num, total)

    num = 4
    total = 14
    assert [2, 3, 4, 5] == solution(num, total)

    num = 5
    total = 5
    assert [-1, 0, 1, 2, 3] == solution(num, total)