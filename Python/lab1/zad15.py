list1 = [1, 4, 6, 8, 12, 543, 876, 890, 1000]
list2 = list1[::-1]


def is_sorted_asc(list_name):
    z = 0
    for x in list_name:
        if z == 0 or x < z:
            z = x
        else:
            return False
    return True


print(is_sorted_asc(list1))
print(is_sorted_asc(list2))
