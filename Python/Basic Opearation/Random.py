import random
import math
x = random.randint(1, 6)
y = math.floor(random.random() * 10) 

print(x,     y)

myList = ['prakash', 'pankaj', 'rahul', 'chandan', 'vikash']
z = random.choice(myList)

print(z)

cards = [1, 2, 3, 4, 5, 6, 7, 8, 9, 'J', 'Q', "K", 'A']
random.shuffle(cards)
print(cards)

cards1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 'J', 'Q', "K", 'A'}
print(cards1)
