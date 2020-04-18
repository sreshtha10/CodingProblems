n = int(input())
data = input().split()
print(all(int(i) >0 for i in data) and any(j == j[::-1] for j in data))
