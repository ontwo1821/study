def solution(rsp):
    answer = ''

    for i in rsp:
        if i == "2":
            answer += "0"
        elif i == "0":
            answer += "5"
        elif i == "5":
            answer += "2"

    return answer


if __name__ == '__main__':
    assert "0" == solution("2")
    assert "052" == solution("205")