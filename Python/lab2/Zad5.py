def merge(x: dict, y: dict):
    res = x | y
    return res


smth1 = {10: 'x', 8: 'y', 10: 'z'}
smth2 = {5: 'a', 2: 'b'}
my_dict = merge(smth1, smth2)
print(my_dict)

