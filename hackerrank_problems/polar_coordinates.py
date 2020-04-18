import cmath
number = complex(input())
x= float(number.real)
y = float(number.imag)
print(abs(complex(x,y)))
print(cmath.phase(complex(x,y)))
