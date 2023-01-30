import java.util.Iterator;
import java.util.*;
import java.time.LocalDate;

public class IterablePrinter {
    public static <E> void print(Iterable<E> iterable) {
        Iterator<E> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        Set<String> stringSet = new HashSet<>(Arrays.asList("hello", "world"));
        Queue<LocalDate> dateQueue = new LinkedList<>(Arrays.asList(LocalDate.now(), LocalDate.now().plusDays(1)));
        IterablePrinter.print(intList); // prints "1, 2, 3, 4, 5"
        IterablePrinter.print(stringSet); // prints "hello, world"
        IterablePrinter.print(dateQueue); // prints "2022-01-01, 2022-01-02"
    }
}