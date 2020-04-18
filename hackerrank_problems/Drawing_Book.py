n = int(input())
p = int(input())
l = []
i = 0
while i<n+1:
    if i+1 <= n:
        l.append([i,i+1])
    else:
        l.append([i,0])
    i +=2
count = 0
for i in range(0,len(l)):
    if l[i][0] == p or l[i][1] == p:
        break
    else:
        count += 1
s = 0
i = len(l)-1
while  i >= 0:
    if l[i][0] == p or l[i][1] == p:
        break
    else:
        s += 1
    i -= 1
if count < s:
    print(count)
else:
    print(s)

