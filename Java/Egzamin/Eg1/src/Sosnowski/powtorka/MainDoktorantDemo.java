package Sosnowski.powtorka;

import java.util.ArrayList;
import java.util.Arrays;

public class MainDoktorantDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Doktorant> doktorants = new ArrayList<>();
        doktorants.add(new Doktorant("Paweł", 995, new ArrayList<>(Arrays.asList(5, 8, 12))));
        doktorants.add(new Doktorant("Gaweł", 996, new ArrayList<>(Arrays.asList(8, 3, 27))));
        doktorants.add(new Doktorant("Wioletka", 997, new ArrayList<>(Arrays.asList(5, 8, 12))));
        doktorants.add(new Doktorant("Grażynka", 998, new ArrayList<>(Arrays.asList(7, 14, 23))));

        Doktorant d1 = doktorants.get(0).clone();
        doktorants.add(d1);

        for (Doktorant e : doktorants)
        {
            System.out.println("Imię: " + e.getName() + ", Punkty: " + e.getPoints());
        }
        System.out.println(doktorants.get(0).compareTo(doktorants.get(1)));
        System.out.println(doktorants.get(0).compareTo(doktorants.get(2)));
        System.out.println(doktorants.get(2).compareTo(doktorants.get(3)));
        System.out.println(doktorants.get(0).compareTo(doktorants.get(4)));

        doktorants.sort(new PointsComparator());
        for (Doktorant e : doktorants)
        {
            System.out.println("Imię: " + e.getName() + ", Punkty: " + e.getPoints());
        }

    }
}