try:
    def lapindromes(s):
        mid = len(s)//2
        if len(s)%2 == 0:
            if sorted(s[:mid]) == sorted(s[mid:]):
                print("YES")
            else:
                print("NO")
        else:
            if sorted(s[:mid]) == sorted(s[mid+1:]):
                print("YES")
            else:
                print("NO")
    test = int(input().strip())
    while test!=0:
        s = input().strip()
        lapindromes(s)
        test -=1 
except:
    pass
