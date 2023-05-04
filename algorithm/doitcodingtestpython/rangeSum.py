import sys
input = sys.stdin.readline

n, m = map(int, input().split())

A = [[0] * (n+1)]
D = [[0] * (n+1) for _ in range(n+1)]

for i in range(n):
    A_row = [0] + [int(x) for x in input().split()]
    A.append(A_row)

# 2차원배열 대입 값넣기
# for i in range(1, n+1):
#     for j in range(1, n+1):
#         D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j]

# 2차원배열 대입 값넣기 2번째 방법 이중 for문 없다.
for i in range(1, n+1):
    D[i][1] = D[i-1][1] + A[i][1]
    D[1][i] = D[1][i-1] + A[1][i]

for _ in range(m):
    x1, y1, x2, y2 = map(int, input().split())
    result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]
    print(result)