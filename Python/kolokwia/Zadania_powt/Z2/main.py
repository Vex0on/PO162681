from Z2 import Konto

def main():
    k1 = Konto(2000, 1100, 200, 0, 500, 0)
    k2 = Konto(3000, 4500, 0, 0, 2000, 500)
    print(k1.bilans_konta())
    print(k2.bilans_konta())
    print(k1.po_wplacie())
    print(k2.po_wyplacie())
    print(k1.wartosc_po_przelewie_do())
    print(k2.wartosc_po_przelewie_od())


if __name__ == "__main__":
    main()
