n = int(input())
data = []
scorelist = []
while n > 0:
    name = input()
    grade = float(input())
    student = []
    if grade not in scorelist:
        scorelist.append(grade)
    student.append(name)
    student.append(grade)
    data.append(student)
    n -= 1
scorelist = sorted(scorelist)
second_low = scorelist[1]
for i in range (len(data)-1):
    if data[i][0][0] > data[i+1][0][0]:
        temp = data[i]
        data[i] = data[i+1]
        data[i+1] = temp
for i in range(len(data)):
    if data[i][1] == second_low:
        print(data[i][0])
