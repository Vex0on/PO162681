import random


class Coin:
    def __init__(self) -> None:
        self.side = ""

    def throw(self):
        if random.randint(0, 1):
            self.side = "Orzeł"
        else:
            self.side = "Reszka"

    def show_side(self):
        return self.side
