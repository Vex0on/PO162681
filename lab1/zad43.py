import random

tup = (2, 8, 4)


def del_elem_tuple(tuplee):
    list1 = list(tuplee)
    del_item = random.randrange(0, len(tuplee))
    del (list1[del_item])
    tup2 = tuple(list1)
    print(tup2)


del_elem_tuple(tup)
