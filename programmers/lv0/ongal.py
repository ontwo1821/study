def solution(babbling):
    speak = ["aya", "ye", "woo", "ma"]
    answer = 0
    for babb in babbling:
        word = ''
        # 각 단어는 한번씩 사용 가능
        for i, b in enumerate(babb):
            word += b
            if word in speak:
                word = ''
            if i + 1 == len(babb) and word == '':
                answer += 1

    return answer

if __name__ == '__main__':
    babbling = ["aya", "yee", "u", "maa", "wyeoo"]
    assert 1 == solution(babbling)

    babbling = ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]
    assert 3 == solution(babbling)    