import random
import statistics

random.seed(162681)
randomList = [random.randrange(1, 101) for i in range(200)]


def median(tab):
    sortlist = tab.copy()
    sortlist.sort()
    lng = len(sortlist)
    if lng % 2 == 0:
        median = (sortlist[(lng - 1) // 2] + sortlist[lng // 2]) / 2
    else:
        median = sortlist[lng // 2]

    return median


print(f'Wbudowana mediana: {statistics.median(randomList)}')
print(f'Moja mediana: {median(randomList)}')
# print('Przypadek nieparzysty: ')
# list1 = [1, 2, 3, 4, 5]
# print(f'Wbudowana mediana: {statistics.median(list1)}')
# print(f'Moja mediana: {median(list1)}')
#
# print('Przypadek parzysty: ')
# list2 = [1, 2, 3, 4, 5, 6]
# print(f'Wbudowana mediana: {statistics.median(list2)}')
# print(f'Moja mediana: {median(list2)}')
