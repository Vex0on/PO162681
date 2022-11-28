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

    # @property
    def get_width(self) -> float:
        return self.__width

    # @property
    def get_length(self) -> float:
        return self.__length

    # @property
    def get_address(self) -> str:
        return self.__address

    # @property
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
        return f'Boisko wybudowane w roku {self.get_year_built()}, o długości {self.get_length()} metrów i ' \
               f'szerokości {self.get_width()} metrów. \n' \
               f'Pole powierzchni: {self.area()} mkw. \n' \
               f'Adres: {self.get_address()}.'

    def __eq__(self, other):
        return self.__length == other.length

    def __ne__(self, other):
        return self.__width != other.width


def validate(court: Court):
    year = datetime.datetime.today().year
    if 0 < court.get_year_built() > year:
        court.set_year_built(year)
