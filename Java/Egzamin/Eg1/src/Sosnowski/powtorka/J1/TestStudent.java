package Sosnowski.powtorka.J1;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> studenciaki = new ArrayList<>();
        studenciaki.add(new Student("Kowalski", LocalDate.of(2004, 1, 13), 4.2 ));
        studenciaki.add(new Student("Witkowski", LocalDate.of(1990, 7, 5), 3.6));
        studenciaki.add(new Student("Witkowski", LocalDate.of(2004, 1, 13), 3.6));
        studenciaki.add(new Student("Pikus", LocalDate.of(2000, 9, 17), 5.0));
        studenciaki.add(new Student("Sosnowski", LocalDate.of(2001, 3, 31), 4.5));
        studenciaki.add(new Student("Kowalski", LocalDate.of(2004, 1, 13), 4.2));

        for (Student s : studenciaki)
        {
            System.out.println(s);
        }

        // compareTo
        System.out.println(studenciaki.get(0).compareTo(studenciaki.get(2)));
        System.out.println(studenciaki.get(1).compareTo(studenciaki.get(2)));
        System.out.println(studenciaki.get(0).compareTo(studenciaki.get(5)));
    }
}