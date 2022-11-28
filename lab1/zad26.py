import random

random.seed(162681)
randomList = [random.randrange(1, 101) for i in range(200)]


def mult_list_elem(tab):
    result = 1
    for i in tab:
        result *= i
    return result


print(mult_list_elem(randomList))
