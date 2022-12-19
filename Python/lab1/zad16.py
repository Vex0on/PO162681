def sqrtsum_fun(*arg):
    suma = 0
    for x in arg:
        suma += x ** 2

    return suma


print(sqrtsum_fun(1, 2, 3))
print(sqrtsum_fun(4, 5, 6))
