test = int(input())
while test != 0:
    n,m = map(int,input().split())
    if m%n == 0:
        print('Yes')
    else:
        print('No')
    test -= 1
