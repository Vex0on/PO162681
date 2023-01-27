package pl.uwm.wmii.kaz.Vex0on;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
       House h1 = new House("ul. Testowa", 10, 2022, "Karol Tester");

       // Test getterów
       System.out.println(h1.getAddress());
       System.out.println(h1.getFloors());
       System.out.println(h1.getYear());
       System.out.println(h1.getOwnerName());

       // Test setterów
       h1.setAddress("ul. DrugaTestowa");
       h1.setFloors(12);
       h1.setYear(2018);
       h1.setOwnerName("Mariusz Tester");

       System.out.println("\n");
       System.out.println(h1.getAddress());
       System.out.println(h1.getFloors());
       System.out.println(h1.getYear());
       System.out.println(h1.getOwnerName());

       // Test toString

       System.out.println(h1);

       House h2 = new House("ul. Uczelniana", 4, 2021, "Karolina Makot");

       System.out.println("h1.floors = h2.floors: " + h1.equals(h2));

       // Test renovate
       h1.renovate(30);
       System.out.println(h1.getFloors());
       // Test jakiLimit
       h1.jakiLimit(h1);


       ApartamentBlok a1 = new ApartamentBlok("ul. Apartamentowa", 7, 2015, "Krzysztof aaa", "Blok mieszkalny", true);

       // Test getterów
       System.out.println(a1.getType());
       System.out.println(a1.isLift());

       // Test setterów
       a1.setType("Test");
       a1.setLift(false);
       a1.setAddress("ul. Sprawdzajaca");
       a1.setFloors(15);
       a1.setYear(2015);
       a1.setOwnerName("Piotr Tester");

       System.out.println("\n");
       System.out.println(a1.getType());
       System.out.println(a1.isLift());
       System.out.println(a1.getAddress());
       System.out.println(a1.getFloors());
       System.out.println(a1.getYear());
       System.out.println(a1.getOwnerName());

       // Test toString

       System.out.println(a1);

       // Test renovate
       a1.renovate(30);
       System.out.println(h1.getFloors());

       ApartamentBlok a2 = new ApartamentBlok("ul. Apartamentowa", 7, 2015, "Krzysztof aaa", "Blok mieszkalny", true);
       System.out.println(a1.equals(a2));
    }

}