for _ in range(int(input())):
    for _ in range(int(input())):
        i,n,q=list(map(int,input().strip().split()))
        if n%2==0:
            print(n//2) 
        else:
            if i==q:
                print(n//2)
            elif i!=q:
                print(n//2+1)
