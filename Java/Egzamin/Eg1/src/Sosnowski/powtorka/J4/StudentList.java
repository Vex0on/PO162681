package Sosnowski.powtorka.J4;

import java.util.*;

public class StudentList {

    public static void main(String[] args) {
        Map<String, String> oceny = new TreeMap<>();

        oceny.put("Carl", "db+");
        oceny.put("Joe", "db");
        oceny.put("Susan", "bdb");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodaj studenta");
            System.out.println("2. Usuń studenta");
            System.out.println("3. Zmień ocenę studenta");
            System.out.println("4. Wyświetl listę studentów");

            int wybor = scanner.nextInt();
            scanner.nextLine();

            switch (wybor) {
                case 1:
                    System.out.println("Podaj nazwisko studenta:");
                    String nazwisko = scanner.nextLine();
                    System.out.println("Podaj ocenę:");
                    String ocena = scanner.nextLine();
                    oceny.put(nazwisko, ocena);
                    break;
                case 2:
                    System.out.println("Podaj nazwisko studenta, którego chcesz usunąć:");
                    nazwisko = scanner.nextLine();
                    oceny.remove(nazwisko);
                    break;
                case 3:
                    System.out.println("Podaj nazwisko studenta, którego ocenę chcesz zmienić:");
                    nazwisko = scanner.nextLine();
                    if (oceny.containsKey(nazwisko)) {
                        System.out.println("Podaj nową ocenę:");
                        ocena = scanner.nextLine();
                        oceny.put(nazwisko, ocena);
                    } else {
                        System.out.println("Nie ma takiego studenta.");
                    }
                    break;
                case 4:
                    System.out.println("Lista studentów:");
                    for (Map.Entry<String, String> entry : oceny.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                default:
                    System.out.println("Niepoprawny wybór.");
                    break;
            }

            System.out.println();
        }
    }
}
