import random

random.seed(162681)
randomList = [random.randrange(1, 101) for i in range(200)]


def min2(tab):
    tab = randomList[0]
    for i in randomList:
        if tab > i:
            tab = i
    return tab


print(min(randomList))
print(min2(randomList))
