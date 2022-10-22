tab = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
sum_fun = 0
mul_fun = 1

for i in tab:
    sum_fun += i
print(sum_fun)

for i in tab:
    mul_fun *= i
print(mul_fun)

print()
print("Przed dodaniem: ")

for i in range(15):
    if i not in tab:
        print(i)

print()
print("Po dodaniu: ")

tab.append(11)
tab.append(13)
for i in range(15):
    if i not in tab:
        print(i)

print()
print("Po usunięciu: ")

del tab[3:5]
for i in range(15):
    if i not in tab:
        print(i)

print()
print("Cała lista: ")

for i in tab:
    print(i, end=",")
