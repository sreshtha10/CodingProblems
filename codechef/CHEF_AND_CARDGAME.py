test = int(input())
def power(a):
    l = []
    for i in a:
        l.append(int(i))
    return sum(l)
while(test != 0):
    chef_sc,morty_sc = 0,0
    n = int(input())
    while(n != 0):
        a,b = input().split()
        if power(a)>power(b):
            chef_sc += 1
        elif power(b) > power(a):
            morty_sc += 1
        else:
            chef_sc += 1
            morty_sc += 1
        n -=1
    if chef_sc > morty_sc:
        print('0 ',chef_sc)
    elif chef_sc < morty_sc:
        print('1',morty_sc)
    else:
        print('2',chef_sc)
    test -= 1
