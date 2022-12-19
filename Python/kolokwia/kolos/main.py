from vehicle import Vehicle
from car import Car


def main():

    v1 = Vehicle("NO1234", 1, 2022)
    v2 = Vehicle(None, 1, 2022)
    v3 = Vehicle("NO4321", -3, 2020)
    v4 = Vehicle("NOL4567", 1, 2027)
    v5 = Vehicle("NOL9876", 1, 1805)

    c1 = Car(25000, "Czerwony", 0, "NOS1234", 1, 2022)
    c2 = Car(-5, "Czerwony", 5, "NOL1234", 0, 2022)
    c3 = Car(17000, "Czerwony", -3, "NO1234", 1, 2022)
    c4 = Car(25000, None, -3, "NO1234", 1, 2022)
    c5 = Car(17000, "Czerwony", -3, None, 1, 2022)
    c6 = Car(17000, None, -3, None, 1, 2022)

    # print(c1.__eq__(c1))
    # print(c1.__eq__(c2))
    # print(c1.__eq__(c3))
    # print(c1.__eq__(c4))

    print(c1.__ne__(c1))
    print(c1.__ne__(c2))
    print(c1.__ne__(c3))
    print(c1.__ne__(c4))

    # print(f'{v1} \n')
    # print(f'{v2} \n')
    # print(f'{v3} \n')
    # print(f'{v4} \n')
    # print(f'{v5} \n')
    #
    # print(v1.brake())
    # print(v1.drive())



    # print(f'{c1} \n')
    # print(f'{c2} \n')
    # print(f'{c3} \n')
    # print(f'{c4} \n')
    # print(f'{c5} \n')
    # print(f'{c6} \n')
    #
    # print(c1.brake())
    # print(c1.drive())

    # print(v1.__eq__(v2))
    # print(v1.__eq__(v3))
    # print(v1.__ne__(v2))
    # print(v1.__ne__(v3))




if __name__ == "__main__":
    main()