package Sosnowski.powtorka.J2;

import java.time.LocalDate;
import java.util.Arrays;

public class ArrayUtil {
    public static <T extends Comparable<T>> int binSearch(T[] arr, T x) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid].compareTo(x) == 0) {
                return mid;
            } else if (arr[mid].compareTo(x) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T[] a) {
        if (a == null || a.length < 2) {
            return;
        }
        int mid = a.length / 2;
        T[] left = Arrays.copyOfRange(a, 0, mid);
        T[] right = Arrays.copyOfRange(a, mid, a.length);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, a);
    }

    private static <T extends Comparable<T>> void merge(T[] left, T[] right, T[] a) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        // 5
        Integer[] arr1 = {5, 10, 15, 20, 25, 30};
        Integer[] arr6 = {30, 10, 20, 15, 25, 5};
        Integer[] arr7 = {5, 15, 30, 10, 25, 20};
        int index1 = ArrayUtil.binSearch(arr1, 20);
        System.out.println("Index of 20 in arr1: " + index1);

        LocalDate[] arr2 = {
                LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 2, 1),
                LocalDate.of(2022, 3, 1),
                LocalDate.of(2022, 4, 1),
                LocalDate.of(2022, 5, 1)
        };

        LocalDate[] arr6d = {
                LocalDate.of(2022, 2, 1),
                LocalDate.of(2022, 3, 1),
                LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 5, 1),
                LocalDate.of(2022, 4, 1)
        };

        int index2 = ArrayUtil.binSearch(arr2, LocalDate.of(2022, 4, 1));
        System.out.println("Index of 2022-04-01 in arr2: " + index2);

        // 6
        System.out.println("Przed sortowaniem: " + Arrays.toString(arr6));
        ArrayUtil.selectionSort(arr6);
        System.out.println("Po sortowaniu: " + Arrays.toString(arr6));

        System.out.println("Przed sortowaniem: " + Arrays.toString(arr6d));
        ArrayUtil.selectionSort(arr6d);
        System.out.println("Po sortowaniu: " + Arrays.toString(arr6d));

        // 7
        ArrayUtil.mergeSort(arr7);
        System.out.println("Sorted intArray: " + Arrays.toString(arr7));

        LocalDate[] dateArray = {LocalDate.of(2022, 5, 12), LocalDate.of(2021, 1, 1), LocalDate.of(2023, 8, 20)};
        ArrayUtil.mergeSort(dateArray);
        System.out.println("Sorted dateArray: " + Arrays.toString(dateArray));
    }
}
