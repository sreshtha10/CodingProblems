arr = list(map(int,input().split()))
def returnReverse(n):
    reverse = 0
    while n >0:
        a = n%10
        reverse = reverse*10 +a
        n = n//10
    return reverse
count = 0
for day in range(arr[0],arr[1]+1):
    if (day-returnReverse(day))%arr[2] == 0:
        count += 1
print(count)
