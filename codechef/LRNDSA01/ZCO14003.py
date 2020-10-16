try:
    n = int(input().strip())
    arr = []
    for i in range(n):
        arr.append(int(input().strip()))
    arr = sorted(arr,reverse = True)
    m = arr[0]
    c = 1
    for i in range(n):
        if(arr[i]*c > m):
            m = arr[i]*c
        c += 1
    print(m)
except:
    pass
