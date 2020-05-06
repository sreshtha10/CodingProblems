a = list(map(int,input().split()))
arr = input().split()
def rotation(arr,d):
    return arr[d:]+arr[:d]
arr = rotation(arr,a[1])
arr = map(int,arr)
print(*arr)
