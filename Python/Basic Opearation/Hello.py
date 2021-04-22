from math import *
from random import *
print(random() * 10)
print(pow(3, 2))
print('Hello python')
a = 5.89
b = 9000
print(a)
if(a == 5):
    print(f'a : {a % 5}');    

print('{0:+^-6.2f} {1:5,d}'.format(a, b))                       

def fact(n):
    f = 1
    for i in range(1, n):
        f *= i
    return f

n = int(input('Enter number :- '))
print(f"Fact : {fact(n):5,d}")
print('Factorial : {0:5,d}'.format(fact(9)))

