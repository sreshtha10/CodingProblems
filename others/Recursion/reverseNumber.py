# reverse a number 
num = int(input())
s = 0
def rev(num):
    global s
    if(num == 0):
        return
    y = num%10
    s = s*10 +y
    rev(num//10)
    
rev(num)
print(s)
    
