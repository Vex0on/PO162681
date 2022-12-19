class Rect:
    def __init__(self, a, b) -> None:
        self.a = a
        self.b = b

    def area(self) -> float:
        return self.a * self.b


def describe(rect: Rect):
    print(f'Długości boków: {rect.a}, {rect.b}')
    print(f'Pole boków: {rect.area()}')
