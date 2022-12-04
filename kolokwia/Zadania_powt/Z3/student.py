from osoba import Osoba

class Student(Osoba):
    _rok: int
    _nr_gr: int
    _nr_albumu: int

    def __init__(self, rok: int, nr_gr: int, nr_albumu: int, imie: str, nazwisko: str, rok_urodzenia: int) -> None:
        super(Student, self).__init__(imie, nazwisko, rok_urodzenia)
        self._rok = rok
        self._nr_gr = nr_gr
        self._nr_albumu = nr_albumu
        