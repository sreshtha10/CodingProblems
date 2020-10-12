def sumEven(arr,i):
    if i == len(arr):
         return 0
    elif arr[i]%2 == 0:
        return arr[i] +sumEven(arr,i+1)
    else:
        return sumEven(arr,i+1)
    
    
arr = list(map(int, input().strip().split()))
print(sumEven(arr,0))
