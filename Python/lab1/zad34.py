import random

random.seed(162681)
randomList = [random.randrange(1, 101) for i in range(200)]


def repeats(tab):
    result = dict((i, tab.count(i)) for i in tab)
    return result


print(repeats(randomList))
