class Konto:
    _saldo_poczatkowe: float
    _saldo_koncowe: float
    _przelew_miedzy: float
    _przelew_zewnetrzny: float
    _wplata: float
    _wyplata: float

    def __init__(self, saldo_poczatkowe: float, saldo_koncowe: float, przelew_miedzy: float,
                 przelew_zewnetrzny: float, wplata: float, wyplata: float):
        self._saldo_poczatkowe = saldo_poczatkowe
        self._saldo_koncowe = saldo_koncowe
        self._przelew_miedzy = przelew_miedzy
        self._przelew_zewnetrzny = przelew_zewnetrzny
        self._wplata = wplata
        self._wyplata = wyplata

    @property
    def saldo_poczatkowe(self):
        return self.saldo_poczatkowe

    @saldo_poczatkowe.setter
    def saldo_poczatkowe(self, value):
        self._saldo_poczatkowe = value

    @property
    def saldo_koncowe(self):
        return self.saldo_koncowe

    @saldo_koncowe.setter
    def saldo_koncowe(self, value):
        self._saldo_koncowe = value

    @property
    def przelew_miedzy(self):
        return self.przelew_miedzy

    @przelew_miedzy.setter
    def przelew_miedzy(self, value):
        self._przelew_miedzy = value

    @property
    def przelew_zewnetrzny(self):
        return self.przelew_zewnetrzny

    @przelew_zewnetrzny.setter
    def przelew_zewnetrzny(self, value):
        self._przelew_zewnetrzny = value

    @property
    def wplata(self):
        return self.wplata

    @wplata.setter
    def wplata(self, value):
        self._wplata = value

    @property
    def wyplata(self):
        return self.wyplata

    @wyplata.setter
    def wyplata(self, value):
        self._wyplata = value

    def bilans_konta(self) -> float:
        return self._saldo_poczatkowe - self._saldo_koncowe

    def wartosc_po_przelewie_od(self):
        self._saldo_koncowe = self._saldo_poczatkowe + self._przelew_miedzy
        return self._saldo_koncowe

    def wartosc_po_przelewie_do(self):
        self._saldo_koncowe = self._saldo_poczatkowe - self._przelew_miedzy
        return self._saldo_koncowe

    def po_wplacie(self):
        self._saldo_koncowe = self._saldo_poczatkowe + self._wplata
        return self._saldo_koncowe

    def po_wyplacie(self):
        self._saldo_koncowe = self._saldo_poczatkowe - self._wyplata
        return self._saldo_koncowe
