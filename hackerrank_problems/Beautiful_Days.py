arr = list(map(int,input().split()))
count = 0
for day in range(arr[0],arr[1]+1):
    if (day-int(str(day)[::-1]))%arr[2] == 0:
        count += 1
print(count)
