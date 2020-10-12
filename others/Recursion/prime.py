a,b = map(int,input().split())
def isPrime(num):
    if(num <= 3):
        if(num == 1):
            return False
        else:
            return True
    for i in range(2,int(pow(num,0.5))+1):
        if num%i == 0:
            return False
    return True
    
def prime(a,b):
    if(a == b):
        return
    if isPrime(a) is True:
        print(a,end = " ")
    return prime(a+1,b)

prime(a,b)
