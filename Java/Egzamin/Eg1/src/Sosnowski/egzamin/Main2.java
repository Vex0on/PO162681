package Sosnowski.egzamin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
public class Main2 {

    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<>();
        a.add("Paula");
        a.add("Mania");
        a.add("Henia");
        System.out.println(max(a));
        System.out.println();

        ArrayList<Integer> b = new ArrayList<>();
        b.add(22);
        b.add(0);
        b.add(5);
        System.out.println(max(b));
        System.out.println(maxx(b));

        LocalDate [] tab = {LocalDate.of(1999,12,3),
                LocalDate.of(1099,12,3),
                LocalDate.of(1999,11,3)
        };
        print(tab);

        String [] tab1 = {"Ala", "ma", "kota"};
        print(tab1);
    }


    public static <T> void print(T tab[]) {
        for (int i = 0; i < tab.length-1; i++ ) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[tab.length-1]);
    }


    public static <E extends Comparable<E>> E max(ArrayList<E> c) {
        if (c.isEmpty())
            throw new IllegalArgumentException("Pusta kolekcja");
        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        return result;
    }

    public static <T extends Comparable<? super T>> T maxx( ArrayList<? extends T> list) {
        if (list.isEmpty())
            throw new IllegalArgumentException("Pusta kolekcja");
        T result = null;
        for (T e : list)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        return result;

    }

}
