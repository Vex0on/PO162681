package Sosnowski.cos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Zadanie2 {
    public static <T extends Comparable<? super T>> T min(ArrayList<? extends T> lista){
        if (lista.isEmpty()){
            throw new IllegalArgumentException("Pusta Lista");
        }
        T result = null;
        for (T m : lista)
        {
            if (result == null || m.compareTo(result) < 0)
                result = Objects.requireNonNull(m);
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList= new ArrayList<>(Arrays.asList(1, 2, 5));
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("aaa", "bbb", "ccc"));
        ArrayList<Double> dblList = new ArrayList<>(Arrays.asList(3.6, 1.5, 9.8));
        ArrayList<LocalDate> dateList = new ArrayList<>(Arrays.asList(LocalDate.of(1999,12,3),
                LocalDate.of(1099,12,3),
                LocalDate.of(1999,11,3)));
        System.out.println(min(intList));
        System.out.println(min(strList));
        System.out.println(min(dblList));
        System.out.println(min(dateList));
    }
}
