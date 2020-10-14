
print("Enter the array to be reversed")
n = list(map(int,input().strip().split()))

def rev(arr,low,high):
    if(low >= high):
        return
    arr[low],arr[high] = arr[high],arr[low]
    return rev(arr,low+1,high-1)
    
rev(n,0,len(n)-1)
print(n)
    
