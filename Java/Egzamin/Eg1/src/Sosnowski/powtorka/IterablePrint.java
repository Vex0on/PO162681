package Sosnowski.powtorka;

import java.time.LocalDate;
import java.util.*;

public class IterablePrint {
    public static <E> void print(Iterable<E> iterable)
    {
        Iterator<E> iterator = iterable.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            if (iterator.hasNext())
                System.out.print(", ");
        }
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        Set<String> stringSet = new HashSet<>(Arrays.asList("hello", "world"));
        Queue<LocalDate> dateQueue = new LinkedList<>(Arrays.asList(LocalDate.now(), LocalDate.now().plusDays(1)));
        IterablePrint.print(intList);
        System.out.println();
        IterablePrint.print(stringSet);
        System.out.println();
        IterablePrint.print(dateQueue);
        System.out.println();
    }
}
