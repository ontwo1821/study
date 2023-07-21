def solution(keymap, targets):
    answer = []

    # 키 별 최소 입력 값 인덱스 생성
    keyIdx = {}
    for keys in keymap:
        for i, k in enumerate(keys):
            # 키가 없는 경우 새로 입력
            if k not in keyIdx:
                keyIdx[k] = i + 1
            else:
                # 기존 키 입력 값과 현재 입력 숫자와 비교하여 최소 값 넣기
                keyIdx[k] = min(keyIdx[k], i + 1)

    for i, target in enumerate(targets):
        val = 0
        for t in target:
            # 해당되는 키 맵이 없을 경우 -1 지정
            if t not in keyIdx:
                val = -1
                break
            else:
                val += keyIdx[t]
        answer.append(val)

    return answer

if __name__ == '__main__':
    keymap = ["ABACD", "BCEFD"]
    targets = ["ABCD", "AABB"]

    assert [9, 4] == solution(keymap, targets)

    keymap = ["AA"]
    targets = 	["B"]

    assert [-1] == solution(keymap, targets)

    keymap = ["AGZ", "BSSS"]
    targets = ["ASA","BGZ"]

    assert [4, 6] == solution(keymap, targets)        