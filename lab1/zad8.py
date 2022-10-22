import numpy as np

tab = np.array([1, 0.5, 0, None, True, False, '', 'w'], dtype="bool")
sum_fun = 0

print()
print("Suma elementów: ")

for i in tab:
    sum_fun += 1
print(sum_fun)

print()
print("Lista: ")

print(tab)

