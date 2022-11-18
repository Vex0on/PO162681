from typing import List
from random import randint, choice

print("ZAD 1")


def f(val: int, digits: List[int]) -> bool:
    return val in digits


n = 10
digits_example = [randint(-1000, 1000) for _ in range(n)]

val = choice(digits_example)
print(digits_example)
print(f(13, digits_example))


print("ZAD 2")

number = input("Podaj liczbę z zakresu <101, 99999>: ")

if int(number) < 101 or int(number) > 99999:
    print("Ta liczba jest spoza zakresu")
else:
    newnumber = number[::-1]
    print(number)
    print(newnumber)
