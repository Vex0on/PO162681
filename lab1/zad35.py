import random

random.seed(123456)
randomlist = [random.randrange(1, 101) for i in range(200)]
randomlist2 = []

a = int(input("Podaj a: "))
b = int(input("Podaj b: "))
for x in randomlist:
    if a <= x <= b:
        randomlist2.append(x)

# print(randomlist2)
print(f"Ilosc liczb z przedziału <{a},{b}>  na liscie: " + (str(len(randomlist2))))


