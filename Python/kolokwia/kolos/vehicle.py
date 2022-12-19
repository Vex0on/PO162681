class Vehicle:
    __reg: str
    __model: int
    __prod_year: int

    def __init__(self, reg: str = None, model: int = 0, prod_year: int = 2022) -> None:
        self.__reg = reg
        if model < 0:
            model = 0
            self.__model = model
        else:
            self.__model = model
        if prod_year < 1900 or prod_year > 2022:
            prod_year = 2022
            self.__prod_year = prod_year
        else:
            self.__prod_year = prod_year

    @property
    def reg(self) -> str:
        return self.__reg

    @reg.setter
    def reg(self, value) -> None:
        self.__reg = value

    @property
    def model(self) -> int:
        return self.__model

    @model.setter
    def model(self, value) -> None:
        if value < 0:
            value = 0
            self.__model = value
            print("Model musi być większy od 0")
        else:
            self.__model = value

    @property
    def prod_year(self) -> int:
        return self.__prod_year

    @prod_year.setter
    def prod_year(self, value) -> None:
        if value < 1900 or value > 2022:
            value = 2022
            self.__prod_year = value
            print("Rok produkcji musi być większy od 1900 i mniejszy od 2022")
        else:
            self.__prod_year = value

    def brake(self) -> str:
        return f'Zatrzymuję się'

    def drive(self) -> str:
        return f'Jadę świetnym pojazdem z roku {self.__prod_year}'

    def __str__(self):
        if self.__reg is None:
            return f'Pojazd wyprodukowany w roku: {self.__prod_year}. \n' \
                   f'Model: {self.__model}.'
        else:
            return f'Pojazd wyprodukowany w roku: {self.__prod_year}. \n' \
                   f'Model: {self.__model}. \n' \
                   f'Rejestracja: {self.__reg}.'

    def __eq__(self, other):
        return self.__model == other.model and self.__prod_year == other.prod_year

    def __ne__(self, other):
        return self.__model != other.model or self.__prod_year != other.prod_year
