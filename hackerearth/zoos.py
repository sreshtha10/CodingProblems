word  = input()
l = []
for a in word:
    l.append(a)
if 2*l.count('z') == l.count('o'):
    print("Yes")
else: 
    print('No')  
