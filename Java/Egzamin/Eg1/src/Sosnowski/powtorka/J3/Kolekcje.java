package Sosnowski.powtorka.J3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Kolekcje {
    public static void redukuj(LinkedList<String> pracownicy, int n) {
        Iterator<String> iterator = pracownicy.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
            if (count % n == 0) {
                iterator.remove();
            }
        }
    }

    public static <T> void redukujGen(LinkedList<T> lista, int n) {
        Iterator<T> iterator = lista.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
            if (count % n == 0) {
                iterator.remove();
            }
        }
    }

    public static void odwroc(LinkedList<String> lista) {
        int i = 0, j = lista.size() - 1;
        while (i < j) {
            String temp = lista.get(i);
            lista.set(i, lista.get(j));
            lista.set(j, temp);
            i++;
            j--;
        }
    }

    public static <T> void odwrocGen(LinkedList<T> lista) {
        int i = 0, j = lista.size() - 1;
        while (i < j) {
            T temp = lista.get(i);
            lista.set(i, lista.get(j));
            lista.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        // 1
        LinkedList<String> pracownicy = new LinkedList<>(Arrays.asList("Anna", "Bartek", "Czesław", "Dorota", "Emilia", "Franciszek", "Grzegorz"));
        System.out.println("Lista przed redukcją: " + pracownicy);
        redukuj(pracownicy, 2);
        System.out.println("Lista po redukcji: " + pracownicy);

        // 2
        LinkedList<Integer> listaLiczb = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Lista przed redukcją: " + listaLiczb);
        redukujGen(listaLiczb, 3);
        System.out.println("Lista po redukcji: " + listaLiczb);

        // 3
        System.out.println("Lista przed odwróceniem: " + pracownicy);
        odwroc(pracownicy);
        System.out.println("Lista po odwróceniu: " + pracownicy);

        // 4
        System.out.println("Lista przed odwróceniem: " + listaLiczb);
        odwrocGen(listaLiczb);
        System.out.println("Lista po odwróceniu: " + listaLiczb);
    }
}
