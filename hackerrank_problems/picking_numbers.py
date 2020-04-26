n = int(input())
arr = list(map(int,input().split()))
arr = sorted(arr)
max_count = 0
for i in range(len(arr)):
    count = 1
    for j in range(i+1,len(arr)):
        if abs(arr[j]-arr[i]) <= 1:
            count += 1
    if(count > max_count):
        max_count = count
print(max_count)
