n = int(input())
arr = list(map(int,input().split()))
def p(x):
    for i in range(len(arr)):
        if arr[i] == x:
            return i+1
for i in range(1,n+1):
    print(p(p(i)))

