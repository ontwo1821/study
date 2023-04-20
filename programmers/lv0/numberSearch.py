def solution(num, k):
    answer = -1
    strK = str(k)
    for i, n in enumerate(str(num)):
        if n == strK:
            answer = i+1 
            break
        
    return answer

if __name__ == '__main__':
    solution(29183, 1)