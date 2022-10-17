from typing import List

lista1: List[List[float]] = [[1, 2, 3], [4, 5, 6]]
lista2: List[List[float]] = [[2, 5, 4], [3, 2, 1]]
result: List[List[float]] = [[0, 0, 0], [0, 0, 0]]


def mult(x: List[List[float]], y: List[List[float]]):
    for i in range(len(x)):
        for j in range(len(y[0])):
            for k in range(len(y)):
                result[i][j] += x[i][k] * y[k][j]

    for r in result:
        print(r)


mult(lista1, lista2)


