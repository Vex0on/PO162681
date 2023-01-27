package jacek.sosnowski.paczka;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Court c1 = new Court(44.9, 120.1,"Słoneczna 54", 2000);

        // Test Getterów
        System.out.println(c1.getWidth());
        System.out.println(c1.getLength());
        System.out.println(c1.getAddress());
        System.out.println(c1.getYear_built());

        // Test Setterów
        c1.setWidth(50);
        c1.setLength(95);
        c1.setAddress("Dworcowa 8");
        c1.setYear_built(-1);
        System.out.println(c1.getWidth());
        System.out.println(c1.getLength());
        System.out.println(c1.getAddress());
        System.out.println(c1.getYear_built());

        // Test Metod
        System.out.println("Wartość obliczona: " + 50 * 95);
        System.out.println("Metoda: " + c1.area());

        System.out.println("Aktualny Rok: " + LocalDate.now().getYear());
        Court.validate(c1);
        System.out.println("Rok po walidacji metodą: " + c1.getYear_built() + "\n");

        // toString
        System.out.println(c1);

        // Test equals
        Court c2 = new Court(60, 100, "testowy 12",1999);
        System.out.println("Powierzchnia c1: " + c1.area());
        System.out.println("Powierzchnia c2: " + c2.area());
        System.out.println("c1 == c2: " + c1.equals(c2));

        // Test klasy Stadium
        Stadium s1 = new Stadium(95, 45, "Słoneczna 10, 10-100 Olsztyn", 2001, "Stadion Słoneczny", "Słoneczko", 25000);
        System.out.println("\n");
        System.out.println(s1 + "\n");
        Stadium s2 = new Stadium(95, 45, "Słoneczna 10, 10-100 Olsztyn", 2012, "Stadion Słoneczny",  12000);
        System.out.println(s2 + "\n");
        System.out.println(s1.equals(s2));
    }
}