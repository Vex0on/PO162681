import java.time.LocalDate;

public class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        LocalDate[] dateArray1 = {LocalDate.of(2020, 1, 1), LocalDate.of(2020, 2, 1), LocalDate.of(2020, 3, 1)};
        Integer[] intArray2 = {5, 3, 2, 1};
        LocalDate[] dateArray2 = {LocalDate.of(2020, 3, 1), LocalDate.of(2020, 2, 1), LocalDate.of(2020, 1, 1)};

        // True
        System.out.println(isSorted(intArray1));
        System.out.println(isSorted(dateArray1));

        // False
        System.out.println(isSorted(intArray2));
        System.out.println(isSorted(dateArray2));
    }
}