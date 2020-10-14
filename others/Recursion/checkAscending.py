def checkAscending(n,index):
    if index == len(n)-1:
        return True
    if n[index] > n[index+1]:
        return False
    return checkAscending(n,index+1)
n = list(map(int,input().strip().split()))
print(checkAscending(n,0))
