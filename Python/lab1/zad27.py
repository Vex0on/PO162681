import random

random.seed(162681)
randomList = [random.randrange(1, 101) for i in range(200)]


def sum_three_digit(tab):
    result = 0
    for i in tab:
        if i > 99:
            result += 1
    return result


print(sum_three_digit(randomList))
