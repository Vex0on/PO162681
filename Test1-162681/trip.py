class Trip:
    def __init__(self, goal, price):
        self.goal: str = goal
        self.price: float = price


def describe(self):
    print(f'The goal inicialized: {self.goal}')
    print(f'The price inicialized: {self.price}')
