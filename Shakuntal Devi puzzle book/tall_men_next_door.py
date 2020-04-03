import numpy as np
#Let a,b,c,d be the height of the four brothers.
#a+b+c+d = 74*4 = 296.
#a-b = 2 , b-c = 2 , c-d = 6.
a = np.array([[1,1,1,1],[1,-1,0,0],[0,1,-1,0],[0,0,1,-1]])
b = np.array([[296],[2],[2],[6]])
a = np.linalg.inv(a)
c = np.dot(a,b)
for i in range(0,4):
    print("Height of brother",i+1,"is",c[i][0])
