test = int(input())
while test != 0:
    b,w = map(int,input().split())
    bc,wc,z = map(int,input().split())
    c1 = (b*bc)+(w*wc)
    c2 = (b+w)*bc +w*z
    c3 = (b+w)*wc +b*z
    print(min(c1,c2,c3))
    test -= 1

