package Sosnowski.egzamin2;

import java.util.ArrayList;
import java.util.Arrays;

public class MainMentorDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Mentor> mentors= new ArrayList<>();
        mentors.add(new Mentor("Adam", 975, new ArrayList<>(Arrays.asList(15, 14, 20))) {
        });
        mentors.add(new Mentor("Krzysztof", 976, new ArrayList<>(Arrays.asList(5, 17, 8))) {
        });
        mentors.add(new Mentor("Adam", 976, new ArrayList<>(Arrays.asList(5, 17, 8))) {
        });

        System.out.println(mentors.get(0));
        System.out.println(mentors.get(1));
        Mentor m1 = mentors.get(0).clone();
        System.out.println(m1);
        mentors.add(3, m1);

        System.out.println();
        System.out.println(mentors.get(0).compareTo(mentors.get(1)));
        System.out.println(mentors.get(0).compareTo(mentors.get(2)));

        mentors.sort(new PointsComparator());
    }
}
