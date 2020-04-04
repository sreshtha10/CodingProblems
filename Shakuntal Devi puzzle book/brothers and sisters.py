# let number of boys be b and girls be g
# b = g+1
# 2*(g-1) = b
import numpy as np
a = np.array([[1,-1],[1,-2]])
b = np.array([[1],[-2]])
a = np.linalg.inv(a)
b = np.dot(a,b)
print("No of brothers are",int(b[0][0]))
print("No of sisters are",int(b[1][0]))

