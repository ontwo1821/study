def solution(cipher, code):
    answer = ''

    for i, c in enumerate(cipher):
        if (i+1) % code == 0:
            answer += c
    return answer


if __name__ == '__main__':
    cipher = "dfjardstddetckdaccccdegk"	
    code = 4
    assert "attack" == solution(cipher, code)

    cipher = "pfqallllabwaoclk"	
    code = 2
    assert "fallback" == solution(cipher, code)    