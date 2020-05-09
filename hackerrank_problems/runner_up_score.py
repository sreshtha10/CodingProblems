n = input()
arr = list(map(int,input().split()))
arr = sorted(arr,reverse = True)
for score in arr:
    if score < max(arr):
        print(score)
        break
