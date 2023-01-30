import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>();
        grupa.add(new Osoba("Kowalski", LocalDate.of(2004, 1, 13)));
        grupa.add(new Osoba("Witkowski", LocalDate.of(1990, 7, 5)));
        grupa.add(new Osoba("Witkowski", LocalDate.of(2004, 1, 13)));
        grupa.add(new Osoba("Pikus", LocalDate.of(2000, 9, 17)));
        grupa.add(new Osoba("Sosnowski", LocalDate.of(2001, 3, 31)));
        grupa.add(new Osoba("Kowalski", LocalDate.of(2004, 1, 13)));

        // gettery
        System.out.println(grupa.get(0) + "\n");
        System.out.println(grupa.get(1) + "\n");
        System.out.println(grupa.get(2) + "\n");
        System.out.println(grupa.get(3) + "\n");
        System.out.println(grupa.get(4) + "\n");
        System.out.println(grupa.get(5) + "\n");

        // equals
        System.out.println(grupa.get(0).equals(grupa.get(2)));
        System.out.println(grupa.get(1).equals(grupa.get(2)));
        System.out.println(grupa.get(0).equals(grupa.get(5)));
        System.out.println("\n");

        // compareTo
        System.out.println(grupa.get(0).compareTo(grupa.get(2)));
        System.out.println(grupa.get(1).compareTo(grupa.get(2)));
        System.out.println(grupa.get(0).compareTo(grupa.get(5)));

        // sortowanie
        System.out.println(grupa);

        grupa.sort(Comparator.comparing(Osoba::getDataUrodzenia));
        System.out.println(grupa);

        grupa.sort(Comparator.comparing(Osoba::getNazwisko));
        System.out.println(grupa);
        System.out.println("\n");
        // Student

        ArrayList<Student> studenciaki = new ArrayList<>();
        studenciaki.add(new Student("Kowalski", LocalDate.of(2004, 1, 13), 4.2 ));
        studenciaki.add(new Student("Witkowski", LocalDate.of(1990, 7, 5), 3.6));
        studenciaki.add(new Student("Witkowski", LocalDate.of(2004, 1, 13), 3.6));
        studenciaki.add(new Student("Pikus", LocalDate.of(2000, 9, 17), 5.0));
        studenciaki.add(new Student("Sosnowski", LocalDate.of(2001, 3, 31), 4.5));
        studenciaki.add(new Student("Kowalski", LocalDate.of(2004, 1, 13), 4.2));

        // gettery
        System.out.println(studenciaki.get(0) + "\n");
        System.out.println(studenciaki.get(1) + "\n");
        System.out.println(studenciaki.get(2) + "\n");
        System.out.println(studenciaki.get(3) + "\n");
        System.out.println(studenciaki.get(4) + "\n");
        System.out.println(studenciaki.get(5) + "\n");

        // compareTo
        System.out.println(studenciaki.get(0).compareTo(studenciaki.get(2)));
        System.out.println(studenciaki.get(1).compareTo(studenciaki.get(2)));
        System.out.println(studenciaki.get(0).compareTo(studenciaki.get(5)));
    }
}
