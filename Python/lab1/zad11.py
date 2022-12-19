def strong_fun(n):
    x = 1
    for i in range(1, n + 1):
        x *= i
    return x


print(strong_fun(4))
print(strong_fun(7))
print(strong_fun(9))
