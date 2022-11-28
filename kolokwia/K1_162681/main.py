from court import Court
from stadium import Stadium


def main():
    c1 = Court(0, 0, "Słoneczna 10 10-100 Olsztyn", 1999)
    s1 = Stadium(68, 100, "Słoneczna 10", 1999, "PGE", 4500)

    print(c1)
    print()
    print(s1)


if __name__ == "__main__":
    main()
