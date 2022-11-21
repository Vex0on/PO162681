import random

random.seed(162681)
randomList = [random.randrange(1, 101) for i in range(200)]

suma = 0

for i in randomList:
    suma += i
print(suma)
