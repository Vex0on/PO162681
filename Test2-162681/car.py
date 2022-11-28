class Car:
    def __init__(self, model, price):
        self.__model = str(model)
        self.__price = int(price)

    def __str__(self):
        return f'Model pojazdu: {self.__model}, \n cena pojazdu: {self.__price} \n'

    def get_model(self):
        return self.__model

    def get_price(self):
        return self.__price
