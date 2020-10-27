try:
    test = int(input().strip())
    while test!=0:
        k,d0,d1 = map(int,input().strip().split())
        d2 = (d1+d0)%10
        if k == 2:
            if (d1+d0)%3 == 0:
                print("YES")
                continue
            else:
                print("NO")
                continue
        elif k == 3:
            if (d1+d2+d0)%3 == 0:
                print("YES")
                continue
            else:
                print("NO")
                continue
        else:
            a = (2*(d1+d0))%10
            b = (4*(d1+d0))%10
            c = (8*(d1+d0))%10
            d = (6*(d1+d0))%10
            su = d1+d2+d0+((a+b+c+d)*((k-3)//4))
            if (k-3)%4 == 1:
                su += a
            elif (k-3)%4 == 2:
                su += a+b
            elif (k-3)%4 == 3:
                su += a+b+c
                
            if su%3 == 0:
                print("YES")
                continue
            else:
                print("NO")
                continue
        
        test -=1
except:
    pass
            
