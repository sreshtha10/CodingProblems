test_cases = int(input())
sol = []
for test in range(test_cases):
    budget = int(input())
    useless = input()
    prices = list(map(int,input().split()))
    for i in range(len(prices)):
        for j in range(i+1,len(prices)):
            if prices[i]+prices[j] == budget:
                sol.append(str(i+1)+' '+str(j+1))
for ans in sol:
    print(ans)
        
