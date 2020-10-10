num = int(input().strip())

#Check divisiblity by 9

def check(num):
    #base case
    if num < 10:
        if num == 9:
            return True
        else:
            return False
    return 
            
def sumofdigits(num):
    if num <= 9:
        return num
    return num%10 + sumofdigits(num//10)

print(check(num))
