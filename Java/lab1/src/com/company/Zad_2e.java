package com.company;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Zad_2e {

    public static int silnia(int liczba) {
        int wynik = 1;
        for (int i=1;i<=liczba;i++)
        {
            wynik *= i;
        }
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println("Zadanie 2 e) ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc liczb: ");
        int n = scan.nextInt();
        int[]x = new int[n];
        int wynik = 0;

        for (int i=0;i<n;i++) {
            System.out.println("Podaj liczbe naturalna: ");
            int a = scan.nextInt();
            x[i] = a;

            if (a < 0) {
                System.out.println("Podana liczba nie jest naturalna, włącz program jeszcze raz i przeczytaj instrukcje");
                break;
            }
        }
        for (int i=0;i<n;i++)
        {
            if ((pow(2, i) < x[i]) && (silnia(i) > x[i]))
            {
                wynik += 1;
            }
        }
        System.out.println("Wsród podanych liczb jest " + wynik + " liczb, które spełniają warunek podany w poleceniu");
    }
}