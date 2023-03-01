package Sosnowski.powtorka;

import java.time.LocalDate;

public class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer [] integers = {5, 1, 3};
        String [] strings = {"b", "w", "a"};
        LocalDate [] localDates = {LocalDate.of(2019, 3, 22), LocalDate.of(2020, 2, 1)};

        System.out.println(isSorted(integers));
        System.out.println(isSorted(strings));
        System.out.println(isSorted(localDates));
    }
}
