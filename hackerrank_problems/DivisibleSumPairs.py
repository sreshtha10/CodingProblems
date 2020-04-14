n,k = map(int,input().split())
arr = list(map(int,input().split()))
n = len(arr)
count = 0
for i in range(n):
    for j in range(i+1,n):
        if i<j:
            if (arr[i]+arr[j])%k == 0:
                count += 1;
print(count)
