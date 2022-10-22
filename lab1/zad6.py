tab = [0.1, 1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.01, 10.02]
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

for i in range(5):
    if i not in tab:
        print(i)

print()
print("Po dodaniu: ")

tab.append(2)
tab.append(4)
for i in range(5):
    if i not in tab:
        print(i)

print()
print("Po usunięciu: ")

del tab[3:5]
for i in range(5):
    if i not in tab:
        print(i)

print()
print("Cała lista: ")

for i in tab:
    print(i, end=",")
