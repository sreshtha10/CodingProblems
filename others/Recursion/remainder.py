try:
    def remainder(a,b,i):
        if b*i == a:
            return 0
        elif b*i > a:
            return a-(b*(i-1))
        else:
            return remainder(a,b,i+1)
        
    print(remainder(1002,91,1))
except:
    pass
        
