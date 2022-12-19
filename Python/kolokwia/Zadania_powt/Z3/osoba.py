import datetime

class Osoba:
    _imie: str
    _nazwisko: str
    _rok_urodzenia: int

    def __init__(self, imie: str, nazwisko: str, rok_urodzenia: int) -> None:
        self._imie = imie
        self._nazwisko = nazwisko
        self._rok_urodzenia = rok_urodzenia

    def przedstaw_sie(self):
        return f'Imię: {self._imie} \n' \
               f'Nazwisko: {self._nazwisko} \n' \
               f'Rok urodzenia: {self._rok_urodzenia} \n'

    def oblicz_wiek(self):
        year = datetime.datetime.today().year
        wiek = year - self._rok_urodzenia
        return wiek
