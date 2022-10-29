from typing import List


class Stat:
    def __init__(self, lst: List[float]):
        self.lista = lst
        if self.lista is None:
            self.lista = []

    def fun_sum(self):
        sum_c = 0
        for i in self.lista:
            sum_c += i
        return sum_c

    def fun_min(self):
        return min(self.lista)

    def fun_max(self):
        return max(self.lista)
