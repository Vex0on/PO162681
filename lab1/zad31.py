import random

random.seed(123456)
randomlist = [random.randrange(1, 101) for i in range(200)]
randomlist2 = []

for x in randomlist:
    if x > 27:
        randomlist2.append(x)

print(randomlist2)
print(len(randomlist2))

