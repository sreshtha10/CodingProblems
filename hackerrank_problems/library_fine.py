ld,lm,ly = map(int,input().split())
dd,dm,dy = map(int,input().split())
if ly< dy:
    print('0')
elif ly > dy:
    print('10000')
elif lm > dm:
    print(500*(lm-dm))
elif lm < dm:
    print('0') 
elif ld > dd:
    print(15*(ld-dd))
else:
    print('0')
