data = list(map(int,input().split()))
hurdles = sorted(list(map(int,input().split())),reverse = True)
doses = 0
if data[1] < hurdles[0]:
    doses = hurdles[0] - data[1]
print(doses)
