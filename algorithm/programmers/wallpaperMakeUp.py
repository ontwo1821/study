def solution(wallpaper):
    st, ed = [], []

    # 바탕화면에 파일을 찾아 세로 배열과 가로 배열에 저장
    for wY, wallY in enumerate(wallpaper):
        for wX, wallX in enumerate(wallY):
            if wallX == '#':
                st.append(wY)
                ed.append(wX)

    # 세로 및 가로 배열에서 최소 최대 값을 돌려준다. 최대값 경우엔 + 1 해준다.
    return [min(st), min(ed), max(st) + 1, max(ed) + 1]


if __name__ == '__main__':
    wallpaper = [".#...", "..#..", "...#."]

    print(solution(wallpaper))