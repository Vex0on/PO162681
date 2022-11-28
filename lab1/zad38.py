import random

random.seed(162681)
randomList = [random.randrange(1, 101) for i in range(200)]


def sorting(tab):
    list1 = []
    list2 = []
    for i in tab:
        if i % 2 == 0:
            list1.append(i)
        else:
            list2.append(i)
    list1.sort()
    list2.sort(reverse=True)
    return list1 + list2


li = sorting(randomList)
print(li)
