from court import Court


class Stadium(Court):
    def __init__(self, name: str, common_name: str, capacity: int = 0) -> None:
        super().__init__(width=0, length=0, address="", year_built=0)
        self.__name = name
        self.__common_name = common_name
        self.__capacity = capacity
