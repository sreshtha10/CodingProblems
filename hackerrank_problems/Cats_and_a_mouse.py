test_cases = int(input())
l = []
for i in range(test_cases):
    data = list(map(int,input().split()))
    distA = abs(data[0]-data[2])
    distB = abs(data[1]-data[2])
    if(distA > distB):
        l.append('Cat B')
    elif distB > distA:
        l.append('Cat A')
    else:
        l.append('Mouse C')
for result in l:
    print(result)
