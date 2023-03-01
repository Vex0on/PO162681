package Sosnowski.powtorka.J1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileLines {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<String>();
        try {
            File plik = new File("K:\\PyCharm\\Pytong\\Java\\Egzamin\\Eg1\\src\\test.txt");
            Scanner skanik = new Scanner(plik);
            while (skanik.hasNextLine()) {
                String data = skanik.nextLine();
                lines.add(data);
            }
            skanik.close();
        } catch (FileNotFoundException e) {
            System.out.println("Błąd");
            e.printStackTrace();
        }
        System.out.println("Początkowa Arrayka: "+ lines);
        String[] linie = lines.toArray(new String[]{});
        System.out.println("\n");

        // Sortowanie w porządku naturalnym
        Collections.sort(lines);
        System.out.println("- Sortowanie 1: ");
        lines.forEach(System.out::println);

        // Sortowanie najkrótsze -> najdłuższe
        lines.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("\n- Sortowanie 2");
        lines.forEach(System.out::println);

        // Sortowanie w porządku naturalnym (linie)
        Arrays.sort(linie);
        System.out.println("\n- Sortowanie 3: ");
        for (String line: linie) {
            System.out.println(line);
        }

        // Sortowanie najkrótsze -> najdłuższe (linie)
        Arrays.sort(linie, Comparator.comparingInt(String::length));
        System.out.println("\n- Sortowanie 4: ");
        for (String line : linie) {
            System.out.println(line);
        }
    }
}