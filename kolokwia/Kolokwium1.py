import datetime


class Court:
    def __init__(self, width: float = 68, length: float = 150, address: str = "", year_built: int = 0):
        if 45 > width > 90 or 90 > length < 120:
            width = 70
            length = 75
            self.__width = float(width)
            self.__length = float(length)
        else:
            self.__width = float(width)
            self.__length = float(length)
        self.__address = str(address)
        self.__year_built = int(year_built)

    def get_width(self) -> float:
        return self.__width

    def get_length(self) -> float:
        return self.__length

    def get_address(self) -> str:
        return self.__address

    def get_year_built(self) -> int:
        return self.__year_built

    def set_width(self, x):
        self.__width = float(x)

    def set_length(self, x):
        self.__length = float(x)

    def set_address(self, x):
        self.__address = str(x)

    def set_year_built(self, x):
        self.__year_built = int(x)

    def area(self) -> float:
        return self.__width * self.__length

    def __str__(self):
        return f'Boisko wybudowane w roku {self.set_year_built(1999)}, o długości {self.set_length(100)} metrów i ' \
               f'szerokości {self.set_width(50)} metrów. \n ' \
               f'Pole powierzchni: {self.area()} mkw. \n ' \
               f'Adres: {self.set_address("Słoneczna 10, 10-100 Olsztyn")}.'

    def __eq__(self, other):
        return self.area() == other.area()

    def __ne__(self, other):
        return self.area() != other.area()


def validate(court: Court):
    year = datetime.datetime.today().year
    if 0 < court.get_year_built() > year:
        court.set_year_built(year)
