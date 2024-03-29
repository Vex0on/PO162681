from court import Court


class Stadium(Court):
    __name: str
    __common_name: str
    __capacity: int

    def __init__(self, width: float = 68, length: float = 150, address: str = "", year_built: int = 0, name: str = "",
                 capacity: int = 0, common_name: str = None) -> None:
        super().__init__(width, length, address, year_built)
        self.__name = name
        self.__common_name = common_name
        if capacity < 0:
            capacity = 0
            self.__capacity = capacity
        else:
            self.__capacity = capacity

    @property
    def name(self) -> str:
        return self.__name

    @name.setter
    def name(self, value: str) -> None:
        self.__name = value

    @property
    def common_name(self) -> str:
        return self.__common_name

    @common_name.setter
    def common_name(self, value: str) -> None:
        self.__common_name = value

    @property
    def capacity(self) -> int:
        return self.__capacity

    @capacity.setter
    def capacity(self, value: int) -> None:
        if value < 0:
            self.__capacity
            print("Podano nieprawidłową wartość pojemności. \n")
        else:
            self.__capacity = value

    def __str__(self):
        if self.common_name is None:
            return f'Boisko wybudowane w roku {self.year_built}, o długości {self.length} metrów i ' \
                   f'szerokości {self.width} metrów. \n' \
                   f'Pole powierzchni: {self.area()} mkw. \n' \
                   f'Adres: {self.address}. \n' \
                   f'Nazwa: {self.name}. \n' \
                   f'Pojemność stadionu: {self.capacity}.'
        else:
            return f'Boisko wybudowane w roku {self.year_built}, o długości {self.length} metrów i ' \
                   f'szerokości {self.width} metrów. \n' \
                   f'Pole powierzchni: {self.area()} mkw. \n' \
                   f'Adres: {self.address}. \n' \
                   f'Nazwa: {self.name}. \n' \
                   f'Nazwa zwyczajowa: {self.common_name}. \n' \
                   f'Pojemność stadionu: {self.capacity} osób.'

    def __eq__(self, other):
        return self.capacity == other.capacity or self.area() == other.area()

    def __ne__(self, other):
        return self.capacity != other.capacity or self.area() != other.area()

