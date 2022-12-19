def avg_age(**kwargs):
    suma = 0
    for name, age in kwargs.items():
        suma += age
    return suma / len(kwargs)


print(avg_age(Mateusz=12, Adam=8, Oliwia=4))
print(avg_age(Mateusz=13, Adam=7, Oliwia=10))
