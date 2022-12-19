from trip import Trip, describe


def main():
    t1 = Trip("test", 2.5)
    t2 = Trip("test2", 3.5)

    describe(t1)
    print()
    describe(t2)


if __name__ == "__main__":
    main()
