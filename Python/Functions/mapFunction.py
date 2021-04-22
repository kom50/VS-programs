'''#map() : This function is used to return a list of results after applying a given 
function to each item of an iterable(list, tuple etc.)

Syntax :- map(function, iter)

parameters: 
  fun : It is a function to which map passes each element of given iterable

  iter : It is a iterable which is to be mapped
'''
#define function
def addition(n):
    return n + n

num = [1, 2, 3, 4, 5]

result = map(addition, num)

print(result)
print(list(result))


#using lambda function

result = list(map(lambda x: x*x, num))
print(result) 

#add two list using map() and lambda functiondd
# num1 = (6, 7, 8, 9, 10, 11)
# listAddition = map(lambda x, y: x + y, num, num1)
# l =list(listAddition)
# print(l)
# print(f'{type(listAddition)}, {type(l)}')

python = object()  
  
print(type(python))  
print(dir(python))  
print(python.__sizeof__)
f = open("python.txt")  
# specifying full path  
# f = open("C:/Python33/README.txt")  