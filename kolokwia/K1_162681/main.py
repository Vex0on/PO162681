from court import Court, validate
from stadium import Stadium


def main():
    c1 = Court(0, 0, "Słoneczna 10 10-100 Olsztyn", 1999)
    s1 = Stadium(68, 100, "Słoneczna 10", 1999, "PGE", 4500)
    s2 = Stadium(70, 105, "Nowatorska 12", 2005, "ARK", 7500, "Arka")
    c2 = Court(46, 100, "Słoneczna 10 10-100 Olsztyn", 2150)
    c3 = Court(75, 70, "Słoneczna 10 10-100 Olsztyn", 1999)

    c2.width = 43
    s1.capacity = -1
    print(c1)
    print()
    # print(s1)
    validate(c2)
    print()
    print(c2)
    print(c1.__eq__(c3))
    print(c1.__ne__(c2))
    print()
    print(s1)
    print()
    print(s2)


if __name__ == "__main__":
    main()
