# cook your dish here
for i in range(int(input())):
    n = int(input().strip())
    sticks = list(map(int, input().strip().split()))
    counter = set(sticks)
    counter.discard(0)
    print(len(counter))
