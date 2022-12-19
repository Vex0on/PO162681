from typing import List

lista1: List[List[int]] = [[1, 2, 3], [4, 5, 6]]
lista2: List[List[int]] = [[6, 5, 4], [3, 2, 1]]
result: List[List[int]] = [[0, 0, 0], [0, 0, 0]]


def suma(x: List[List[int]], y: List[List[int]]):
    for i in range(len(x)):
        for j in range(len(x[0])):
            result[i][j] = x[i][j] + y[i][j]
    return result


print(suma(lista1, lista2))
