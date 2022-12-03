from court import Court, validate
from stadium import Stadium


def main():
    c1 = Court(0, 0, "Słoneczna 10 10-100 Olsztyn", 1999)
    s1 = Stadium(68, 100, "Słoneczna 10", 1999, "PGE", 4500)
    s2 = Stadium(70, 105, "Nowatorska 12", 2005, "ARK", 7500, "Arka")
    c2 = Court(46, 100, "Słoneczna 10 10-100 Olsztyn", 2150)
    c3 = Court(75, 70, "Słoneczna 10 10-100 Olsztyn", 1999)
    c4 = Court(46, 100, "Słoneczna 10 10-100 Olsztyn", -1)

    # test setterów z wartościami spoza zakresu
    c2.width = 43
    s1.capacity = -1

    # test metod equals i not equals
    print(c1.__eq__(c3))
    print(c1.__ne__(c2))
    print(s1.__eq__(s2))
    print(s1.__ne__(s2))

    # test walidacji na c2 (data większa niż obecna)
    print(f'{c2} \n')
    validate(c2)
    print(f'{c2} \n')

    # test walidacji na c4 (ujemna data)
    print(f'{c4} \n')
    validate(c4)
    print(f'{c4} \n')

    # test metody __str__ (s2 z podaną nazwą zwyczajową, s1 bez)
    print(f'{s1} \n')
    print(f'{s2} \n')

    print(f'{c3} \n')
    print(c1)


if __name__ == "__main__":
    main()
