import random

random.seed(162681)
randomList = [random.randrange(1, 101) for i in range(200)]


def three_biggest_smallest(tab):
    sorted_tab = tab.copy()
    sorted_tab.sort()
    print(f'Największe: {sorted_tab[-3:]}, najmniejsze: {sorted_tab[:3]}')


three_biggest_smallest(randomList)

