from court import Court, validate
from stadium import Stadium


def main():
    c1 = Court(0, 0, "Słoneczna 10 10-100 Olsztyn", 1999)
    s1 = Stadium(68, 100, "Słoneczna 10", 1999, "PGE", 4500)
    c2 = Court(50, 100, "Słoneczna 10 10-100 Olsztyn", 2150)

    print(c2)
    print()
    # print(s1)
    validate(c2)
    print()
    print(c2)


if __name__ == "__main__":
    main()
