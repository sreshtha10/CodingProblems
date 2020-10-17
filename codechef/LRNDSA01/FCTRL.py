# cook your dish here
try:
    def Z(n,five):
        if n//five == 0:
            return 0
        return n//five + Z(n,five*5)
    test = int(input().strip())
    while test !=0:
        n = int(input().strip())
        print(Z(n,5))
        test -= 1
except:
    pass
