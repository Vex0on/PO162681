from car import Car


class Bus(Car):
    seats: int

    def __init__(self, model: str, price: int, seats: int) -> None:
        super().__init__(model, price)
        self.seats = seats

    def __str__(self):
        return f'Model pojazdu: {self.get_model()}, \n cena pojazdu: {self.get_price()} \n miejsca: {self.seats} \n'
