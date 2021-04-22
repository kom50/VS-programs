
#memoryview() 
randomByteArray = bytearray('ABC', 'utf-8')

mv = memoryview(randomByteArray)

print(mv[0])

#it create byte from memory view
b = bytes(mv[0:2])
print(b)

#It create list from memoryview
list = list(mv[0:3])
print(list)
print(mv)

a = 9
b = bytes(a)
print(b)