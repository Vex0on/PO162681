from car import Car
from bus import Bus


def main() -> None:
    c1: Car = Car("Audi", 35000)
    print(c1)
    b1: Bus = Bus("Skoda", 450000, 74)
    print(b1)


if __name__ == "__main__":
    main()
