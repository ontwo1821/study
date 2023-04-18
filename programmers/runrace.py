def solution(players, callings):
    # 등수 기반 인덱스
    rankIdxDic = {i : player for i, player in enumerate(players)}
    # 플레이어 기반 인덱스
    playerIdxDic = {player : i for i, player in enumerate(players)}

    # 교체 대상 값을 임시 변수에 넣고 교체 해준다.
    for i in callings:
        nowRank = playerIdxDic[i]
        prevRank = nowRank - 1
        prevPlayer = rankIdxDic[prevRank]

        rankIdxDic[prevRank] = i
        rankIdxDic[nowRank] = prevPlayer

        playerIdxDic[i] = prevRank
        playerIdxDic[prevPlayer] = nowRank

    return list(rankIdxDic.values())


if __name__ == '__main__':
    
    players = ["mumu", "soe", "poe", "kai", "mine"]
    callings = ["kai", "kai", "mine", "mine"]

    print(solution(players, callings))