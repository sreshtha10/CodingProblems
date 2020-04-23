n =int(input())
def split(word): 
    return [char for char in word]  
steps = input()
steps = list(split(steps))
level = 0
nValley = 0
for step in steps:
    if step =='D':
        level -= 1
    elif step == 'U':
        level +=1
    if level == 0 and step =='U':
        nValley += 1
print(nValley)

        
    
