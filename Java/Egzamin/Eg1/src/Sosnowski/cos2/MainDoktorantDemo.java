package Sosnowski.cos2;

import java.util.ArrayList;
import java.util.Arrays;

public class MainDoktorantDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Doktorant> doktorants = new ArrayList<>();
        doktorants.add(new Doktorant("Paweł", 975, new ArrayList<>(Arrays.asList(15, 8, 9))));
        doktorants.add(new Doktorant("Adam", 975, new ArrayList<>(Arrays.asList(20, 31, 4))));
        doktorants.add(new Doktorant("Wiesława", 975, new ArrayList<>(Arrays.asList(4, 3, 5))));
        doktorants.add(new Doktorant("Wiesława", 975, new ArrayList<>(Arrays.asList(20, 31, 4))));

        Doktorant d1 = doktorants.get(0).clone();

        System.out.println(doktorants.get(0).compareTo(doktorants.get(1)));
        System.out.println(doktorants.get(0).compareTo(doktorants.get(2)));
        System.out.println(doktorants.get(0).compareTo(d1));
        System.out.println(doktorants.get(2).compareTo(doktorants.get(3)));

        for (Doktorant d : doktorants)
        {
            System.out.println("Imię: " + d.getName() + ", Punkty: " + d.getPoints());
        }
        doktorants.sort(new PointsComparator());
        System.out.println();

        for (Doktorant d : doktorants)
        {
            System.out.println("Imię: " + d.getName() + ", Punkty: " + d.getPoints());
        }
    }
}
