def solution(park, routes):
    answer = []

    maxX = len(park[0])
    maxY = len(park)

    stPos = []
    for xI, x in enumerate(park):
        for yI, y in enumerate(x):
            if y == 'S':
                stPos = [xI, yI]
                break
        
    for i in routes:
        direction = i[0]

        
        

    return answer

if __name__ == '__main__':
    
    park = ["SOO","OOO","OOO"]
    routes = ["E 2","S 2","W 1"]


    print(solution(park, routes))