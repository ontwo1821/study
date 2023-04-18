def solution(park, routes):
    answer = []

    maxX = len(park[0]) - 1
    maxY = len(park) - 1

    # 시작위치 찾기
    for yI, x in enumerate(park):
        for xI, y in enumerate(x):
            if y == 'S':
                answer = [yI, xI]
                break
    
    for r in routes:
        direction = r[0]
        move = int(r[2])

        # 동쪽으로
        if direction == 'E':
            loc = answer[1] + move
            if loc > maxX:
                continue
            # 시작지점 + 1 부터 이동지점 + 1 까지 장애물 조사
            if 'X' in park[answer[0]][answer[1] + 1:loc + 1]:
                continue
            else:
                answer[1] = loc

        # 서쪽으로
        elif direction == 'W':
            loc = answer[1] - move
            if loc < 0:
                continue
            # 이동지점 부터 현재위치까지 장애물 조사
            if 'X' in park[answer[0]][loc:answer[1]]:
                continue
            else:
                answer[1] = loc
        
        # 남쪽으로
        elif direction == 'S':
            loc = answer[0] + move
            if loc > maxY:
                continue
            # 현재위치 + 1 부터 이동지점 + 1까지 장애물 조사
            if 'X' in [park[i][answer[1]] for i in range(answer[0] + 1, loc + 1)]:
                continue
            else:
                answer[0] = loc            

        # 북쪽으로
        elif direction == 'N':
            loc = answer[0] - move
            if loc < 0:
                continue
            # 이동지점 부터 현재위치 까지 장애물 조사
            if 'X' in [park[i][answer[1]] for i in range(loc, answer[0])]:
                continue
            else:
                answer[0] = loc

    return answer

if __name__ == '__main__':
    
    park = ["SOO","OOO","OOO"]
    routes = ["E 2","S 2","W 1"]

    print(solution(park, routes))

    park = ["SOO","OXX","OOO"]
    routes = ["E 2","S 2","W 1"]

    print(solution(park, routes))

    park = ["OSO","OOO","OXO","OOO"]	
    routes = ["E 2","S 3","W 1"]

    print(solution(park, routes))