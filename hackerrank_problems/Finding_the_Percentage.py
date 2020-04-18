n = int(input())
data = {}
for i in range(0,n):
    data[i] = list(map(str,input().split()))
x = input()
avg = 0
for key in data.keys():
    if x in data[key]:
        avg = (float(data[key][1])+float(data[key][2])+float(data[key][3]))/float(3)

print('{:.2f}'.format(avg))
