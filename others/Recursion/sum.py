n = list(map(int,input().strip().split()))
s = 0
def SumArray(arr):
    global s
    if(len(arr) == 1):
        s += arr[0]
        return
    mid = len(arr)//2
    left = arr[:mid]
    right = arr[mid:]
    SumArray(left)
    SumArray(right)
SumArray(n) 
print(s)
