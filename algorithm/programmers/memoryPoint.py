def solution(name, yearning, photo):
    answer = []
    # 이름 인덱스를 생성
    nameDic = {n : y for n, y in zip(name, yearning)}

    for p in photo:
        # 점수 계산 시 이름 있는것만 포함
        answer.append(sum(nameDic[ii] for ii in p if ii in name))

    return answer


if __name__ == '__main__':
    
    name = ["may", "kein", "kain", "radi"]
    yearning = [5, 10, 1, 3]
    photo = [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]    


    print(solution(name, yearning, photo))