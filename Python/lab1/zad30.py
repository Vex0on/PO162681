import random

random.seed(162681)
randomList = [random.randrange(1, 101) for i in range(200)]


def triple_repeat(tab):
    result = []
    for i in tab:
        if tab.count(i) == 3:
            if i not in result:
                result.append(i)
    print(result)


triple_repeat(randomList)

