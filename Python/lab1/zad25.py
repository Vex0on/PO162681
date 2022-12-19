import random

random.seed(162681)
randomList = [random.randrange(1, 101) for i in range(200)]


def first_20_sorted(tab):
    sortlist = tab.copy()
    sortlist.sort()
    for i in range(20):
        print(f'{i + 1}: {sortlist[i]}')


first_20_sorted(randomList)
