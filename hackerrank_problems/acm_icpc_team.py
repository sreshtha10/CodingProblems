from itertools import combinations
n,m = map(int,input().split())
teams = []
z = n
while n != 0:
    l = []
    t = input()
    for i in t:
        l.append(i)
    l = list(map(int,l))
    teams.append(l)
    n -= 1
def sub(team1,team2):
    c = 0
    for i in range(0,m):
        if team1[i] == 1 or team2[i] == 1:
            c+= 1
    return c
count = 0
l = []
j = []
for i in range(z): 
    j.append(i)
for i in combinations(j,2):
    l.append(i)
j = []
for i in l:
    team1 = teams[i[0]]
    team2 = teams[i[1]]
    j.append(sub(team1,team2))  
print(max(j))
print(j.count(max(j)))
  
