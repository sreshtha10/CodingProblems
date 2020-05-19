import math 
t = int(input())
while t != 0:
    r1,r2 = map(int,input().split())
    count = math.floor(math.sqrt(r2))-math.ceil(math.sqrt(r1))+1
    print(count)
    t -= 1
