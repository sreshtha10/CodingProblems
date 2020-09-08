test  = int(input())
while(test != 0):
    sum = 0
    n = int(input())
    arr = list(map(int,input().split()))
    for i in range(n-1):
        sum += abs(arr[i]-arr[i+1])-1
    print(sum)
    test -= 1
