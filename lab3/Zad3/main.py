from ZAD_3 import Rect, describe


def main():
    r1 = Rect(2, 5)
    r2 = Rect(3, 4)
    print(r1.area())
    print(r2.area())
    r_list = []
    r_list.append(r1)
    r_list.append(r2)

    for i in r_list:
        print(f'Bok a: {i.a}, Bok b: {i.b}, Pole prostokąta: {i.area()}')

    print()
    describe(r1)
    print()
    describe(r2)


if __name__ == "__main__":
    main()
