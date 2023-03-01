package Sosnowski.powtorka.J2;

import java.util.ArrayList;
import java.util.Arrays;

public class PairUtilDemo {
    public static void main(String[] args) {
        Pair<String> pair1 = new Pair<>("hello", "world");
        System.out.println("Before swap: " + pair1.getFirst() + ", " + pair1.getSecond());

        Pair<String> pair2 = PairUtil.swap(pair1);
        System.out.println("After swap: " + pair2.getFirst() + ", " + pair2.getSecond());

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Number> list2 = new ArrayList<>(Arrays.asList(4.0, 5.0, 6.0));

        addAll(list1, list2);

        ArrayList<Object> list3 = new ArrayList<>();
        addAll2(list2, list3);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }

    public static <E> void addAll(ArrayList<? extends E> source, ArrayList<E> destination) {
        destination.addAll(source);
    }

    public static <E> void addAll2(ArrayList<E> source, ArrayList<? super E> destination) {
        destination.addAll(source);
    }
}
