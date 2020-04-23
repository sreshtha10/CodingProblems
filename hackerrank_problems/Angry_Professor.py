test_cases = int(input())
outcomes = []
for test in range(test_cases):
    arr = list(map(int,input().split()))
    student_timings = list(map(int,input().split()))
    onTime = 0
    for student_timing in student_timings:
        if student_timing <= 0:
            onTime += 1
    if onTime < arr[1]:
        outcomes.append('YES')
    else:
        outcomes.append('NO')
for outcome in outcomes:
    print(outcome)
