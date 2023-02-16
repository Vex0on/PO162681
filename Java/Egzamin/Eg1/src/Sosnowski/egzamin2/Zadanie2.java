package Sosnowski.egzamin2;

import java.time.LocalDate;
public class Zadanie2 {
    public static <T extends Comparable<T>> T maximum(T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0)
        {
            max = b;
        }
        if (c.compareTo(max) > 0)
        {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        String [] lista = {"aaa", "ccc", "bbb"};
        Integer [] lista2 = {5, 26, 15};
        LocalDate[] lista3 = {LocalDate.of(1999, 12, 1),
                LocalDate.of(1999, 11, 5),
                LocalDate.of(1099, 12, 5)};

        System.out.println(maximum(lista[0], lista[1], lista[2]));
        System.out.println(maximum(lista2[0], lista2[1], lista2[2]));
        System.out.println(maximum(lista3[0], lista3[1], lista3[2]));
    }
}
