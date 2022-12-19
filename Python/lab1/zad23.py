import random

random.seed(162681)
randomList = [random.randrange(1, 101) for i in range(200)]


def max2(tab):
    tab = randomList[0]
    for i in randomList:
        if tab < i:
            tab = i
    return tab


print(max(randomList))
print(max2(randomList))
