package Sosnowski.powtorka.J3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListChange {
    public static void main(String[] args) {
        // 1
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Ala", "ma", "kota", "a", "kot", "ma", "Ale"));
        ListIterator<String> iter = lista.listIterator();
        while (iter.hasNext()) {
            String s = iter.next();
            iter.set(s.toUpperCase());
        }
        System.out.println(lista);

        // 2

        ArrayList<String> lista2 = new ArrayList<>(Arrays.asList("Ala", "ma", "kota", "a", "kot", "ma", "Ale"));
        for (int i = 0; i < lista.size(); i++) {
            String s = lista2.get(i);
            lista2.set(i, s.toUpperCase());
        }
        System.out.println(lista2);

    }
}
