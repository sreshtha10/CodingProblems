n,k = map(int,input().split())
n = str(n)
l = []
for w in n:
    l.append(w)
for j in range(len(l)):
    if k !=  0:
        if l[j] != '9':
            l[j] ='9'
            k -= 1
        else:
            continue
    else:
        break
s = ''
s = s.join(l)
print(s)
