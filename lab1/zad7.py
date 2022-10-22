tab = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J"]
sum_fun = 0

for i in tab:
    sum_fun += 1
print(sum_fun)

print()
print("Przed dodaniem: ")

for i in tab:
    if i not in "W":
        print(i)

print()
print("Po dodaniu: ")

tab.append("X")
for i in tab:
    if i not in "W":
        print(i)

print()
print("Po usunięciu: ")

del tab[3:5]
for i in tab:
    if i not in "W":
        print(i)

print()
print("Cała lista: ")

for i in tab:
    print(i, end=",")
