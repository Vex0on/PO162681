from typing import List
import numpy as np

lista: List[List[float]] = [[1, 4], [4, 5]]


def odw(x: List[List[float]]):
    x = np.linalg.inv(x)
    return x


print(odw(lista))
