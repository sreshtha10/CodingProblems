import itertools
a = list(map(int,input().split()))
budget = a[0]
max_cost = -1
l = []
keyboards = list(map(int,input().split()))
usbs = list(map(int,input().split()))
for keyboard in keyboards:
    for usb in usbs:
        l.append(keyboard+usb)
for cost in l:
    if cost > max_cost and cost <= budget:
        max_cost = cost
print(max_cost)
