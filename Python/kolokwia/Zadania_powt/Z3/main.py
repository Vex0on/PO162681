from osoba import Osoba
from student import Student

def main():
    o1 = Osoba("Wojtek", "Pajac", 2001)
    s1 = Student(2, 3, 824052, "Krzysztof", "Malecki", 2002)
    print(o1.oblicz_wiek())
    print(s1.oblicz_wiek())
    print(o1.przedstaw_sie())
    print(s1.przedstaw_sie())


if __name__ == "__main__":
    main()
