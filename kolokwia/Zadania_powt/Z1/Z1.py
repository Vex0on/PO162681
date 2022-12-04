from typing import List

class Stat:
    lista: list

    def __init__(self, lst: List[float]) -> None:
        self.lista = lst
        if self.lista is None:
            self.lista = []

    def sum_list(self) -> float:
        suma = 0
        for i in self.lista:
            suma += i
        return suma

    def avg_list(self) -> float:
        licznik = 0
        for i in self.lista:
            licznik += 1
        return self.sum_list() / licznik

    def median_list(self):
        sorted_list = self.lista.copy()
        sorted_list.sort()
        leng = len(sorted_list)
        if leng % 2 == 0:
            mediana = (sorted_list[(leng - 1) // 2] + sorted_list[leng // 2]) / 2
        else:
            mediana = sorted_list[leng // 2]
        return mediana

    def min_lista(self):
        return min(self.lista)

    def max_lista(self):
        return max(self.lista)

