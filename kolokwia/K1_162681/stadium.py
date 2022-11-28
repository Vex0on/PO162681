from court import Court


class Stadium(Court):
    def __init__(self, width: float, length: float, address: str, year_built: int, name: str, capacity: int = 0,
                 common_name: str = None) -> None:
        super().__init__(width, length, address, year_built)
        self.__name = name
        self.__common_name = common_name
        self.__capacity = capacity

    def get_name(self) -> str:
        return self.__name

    def get_common_name(self) -> str:
        return self.__common_name

    def get_capacity(self) -> int:
        return self.__capacity

    def set_name(self, x):
        self.__name = str(x)

    def set_common_name(self, x):
        self.__common_name = str(x)

    def set_capacity(self, x):
        self.__capacity = int(x)

    def __str__(self):
        return f'Boisko wybudowane w roku {self.get_year_built()}, o długości {self.get_length()} metrów i ' \
               f'szerokości {self.get_width()} metrów. \n' \
               f'Pole powierzchni: {self.area()} mkw. \n' \
               f'Adres: {self.get_address()}. \n' \
               f'Nazwa: {self.get_name()} \n' \
               f'Nazwa zwyczajowa: {self.__common_name} \n' \
               f'Pojemność stadionu: {self.__capacity}.'

