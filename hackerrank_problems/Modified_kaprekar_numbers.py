import math
low = int(input())
high = int(input())
def kaprekar(n):
    squared = pow(n,2)
    d = len(str(n))
    squared = str(squared)
    t = len(squared)-d
    l = squared[:t]
    r = squared[t:]
    try:
        if int(r)+int(l) == n:
            return 'Yes'
        else:
            return 'No'
    except:
            return 'No'
c = 0
for i in range(low,high+1):
    if kaprekar(i) == 'Yes' or i == 1:
        print(i,end=' ')
        c += 1
    if i == high and c == 0:
        print('INVALID RANGE')

    
    
