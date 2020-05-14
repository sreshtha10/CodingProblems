test = int(input())
while(test != 0):
    n = input()
    l = []
    count = 0
    for word in n:
        l.append(word)
    l = list(map(int,l))
    for i in l:
        try:
            if int(n)%i == 0:
                count += 1
        except:
            continue     
    print(count)
    test -= 1


