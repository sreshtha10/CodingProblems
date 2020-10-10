#tower of hanoi
#total number of steps is 2^n -1 
steps = 0
def TOH(n,source,des,aux):
    global steps
    if n == 1:
        steps +=1 
        print(str(steps)+" Move disk from "+source+" to "+des)
        return
    TOH(n-1,source,aux,des)
    steps += 1
    print(str(steps)+" Move disk from "+source+" to "+des)
    TOH(n-1,aux,des,source)
    

print("Enter the no of disks")
n = int(input().strip())
TOH(n,'A','C','B')
