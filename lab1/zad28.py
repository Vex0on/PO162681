import random

random.seed(162681)
randomList = [random.randrange(1, 101) for i in range(200)]


def max_repeats(tab):
    num = tab[0]
    result = 0
    for i in tab:
        if tab.count(i) > result:
            num = i
            result = randomList.count(i)
    print(f'Liczba: {num} powtórzyła się {result} razy')


max_repeats(randomList)
