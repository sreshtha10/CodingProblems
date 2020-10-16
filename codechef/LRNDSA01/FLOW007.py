# cook your dish here
try:
    def reverse(num,s):
        if(num == 0):
            return s
        s = s*10+(num%10)
        return reverse(num//10,s)
    for i in range(int(input().strip())):
        num = int(input().strip())
        print(reverse(num,0))
except:
    pass
