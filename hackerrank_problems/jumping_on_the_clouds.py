n = int(input())
arr = list(map(int,input().split()))
count = 0
i = 0
while i < len(arr):
    try:
        if arr[i+2] != 1:
            count +=1
            i += 2
        else:
            count += 1
            i += 1
    except:
        count += 1
        i += 1
    
print(count-1)
