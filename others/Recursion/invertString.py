string  = input()
def printR(string,n):
    if(n < 0):
        return
    print(string[n],end = "")
    printR(string,n-1)

printR(string,len(string)-1)
