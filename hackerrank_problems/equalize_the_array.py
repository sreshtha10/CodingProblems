n = int(input())
arr = list(map(int,input().split()))
maXcount = 0
for i in arr:
    if arr.count(i) > maXcount:
        maXcount = arr.count(i)
print(n-maXcount)
