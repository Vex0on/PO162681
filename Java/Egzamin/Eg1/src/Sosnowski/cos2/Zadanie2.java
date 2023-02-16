package Sosnowski.cos2;

import java.time.LocalDate;

public class Zadanie2 {
    public static <T extends Comparable<T>> T minimum(T a, T b, T c){
        T min = a;
        if (b.compareTo(min) < 0)
        {
            min = b;
        }
        if (c.compareTo(min) < 0)
        {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        String [] l1 = {"ccc", "bbb", "aaa"};
        Integer [] l2 = {13, 27, 5};
        LocalDate [] l3 = {LocalDate.of(1999, 12, 1),
                LocalDate.of(1999, 11, 5),
                LocalDate.of(1099, 12, 5)};

        System.out.println(minimum(l1[0], l1[1], l1[2]));
        System.out.println(minimum(l2[0], l2[1], l2[2]));
        System.out.println(minimum(l3[0], l3[1], l3[2]));
    }
}
