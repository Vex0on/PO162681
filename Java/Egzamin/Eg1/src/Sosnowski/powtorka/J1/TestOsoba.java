package Sosnowski.powtorka.J1;

import Sosnowski.powtorka.ArrayUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>();
        grupa.add(new Osoba("Kowalski", LocalDate.of(2004, 1, 13)));
        grupa.add(new Osoba("Witkowski", LocalDate.of(1990, 7, 5)));
        grupa.add(new Osoba("Witkowski", LocalDate.of(2004, 1, 13)));
        grupa.add(new Osoba("Pikus", LocalDate.of(2000, 9, 17)));
        grupa.add(new Osoba("Sosnowski", LocalDate.of(2001, 3, 31)));

        for (Osoba o : grupa)
        {
            System.out.println(o);
        }

        Collections.sort(grupa);
        System.out.println();

        for (Osoba o : grupa)
        {
            System.out.println(o);
        }

        System.out.println(grupa.get(0).compareTo(grupa.get(1)));
        System.out.println(grupa.get(1).compareTo(grupa.get(2)));
        System.out.println(grupa.get(0).compareTo(grupa.get(2)));


    }
}
