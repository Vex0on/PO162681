import datetime


class Court:
    def __init__(self, width: float = 68, length: float = 150, address: str = "", year_built: int = 0) -> None:
        if 45 > width or width > 90 or 90 > length or length > 120:
            width = 70
            length = 75
            self.__width = width
            self.__length = length
        else:
            self.__width = width
            self.__length = length
        self.__address = address
        self.__year_built = year_built

    @property
    def width(self) -> float:
        return self.__width

    @width.setter
    def width(self, value: float) -> None:
        if 45 > value or value > 90:
            self.__width
        else:
            self.__width = value

    @property
    def length(self) -> float:
        return self.__length

    @length.setter
    def length(self, value: float) -> None:
        if 90 > value or value > 120:
            self.__length
        else:
            self.__length = value

    @property
    def address(self) -> str:
        return self.__address

    @address.setter
    def address(self, value: str) -> None:
        self.__address = value

    @property
    def year_built(self) -> int:
        return self.__year_built

    @year_built.setter
    def year_built(self, value: int) -> None:
        self.__year_built = value

    def area(self) -> float:
        return self.__width * self.__length

    def __str__(self):
        return f'Boisko wybudowane w roku {self.year_built}, o długości {self.length} metrów i ' \
               f'szerokości {self.width} metrów. \n' \
               f'Pole powierzchni: {self.area()} mkw. \n' \
               f'Adres: {self.address}.'

    def __eq__(self, other):
        return self.area() == other.area()

    def __ne__(self, other):
        return self.area() != other.area()


def validate(court: Court) -> None:
    year = datetime.datetime.today().year
    if 0 < court.year_built > year:
        court.year_built = year
