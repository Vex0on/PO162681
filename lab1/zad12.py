def strong_rec(n):
    if n == 1:
        return 1
    return n * strong_rec(n - 1)


print(strong_rec(4))
