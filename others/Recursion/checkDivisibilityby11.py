num = int(input().strip())

#Check divisiblity by 11

def check(num):
    #base case
    if num < 10:
        if num == 0:
            return True
        else:
            return False
    s1,s2 = 0,0     
    while num >0:
        s1+=num%10
        num = num//10
        s2+=num%10
        num = num//10
    if s1>s2:
        diff = s1-s2
    else:
        diff = s2-s1
    return check(diff)
print(check(num))
