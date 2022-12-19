package com.company;

import java.util.Scanner;

public class Zad_2d {

    public static void main(String[] args) {
        System.out.println("Zadanie 2 d) ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc liczb: ");
        int n = scan.nextInt();
        int wynik = 0;
        int[]x = new int[n];

        for (int i=0;i<n;i++) {
            System.out.println("Podaj liczbe naturalna: ");
            int a = scan.nextInt();
            x[i] = a;

            if (a < 0) {
                System.out.println("Podana liczba nie jest naturalna, włącz program jeszcze raz i przeczytaj instrukcje");
                break;
            }
        }
        for (int i=0;i<n-1;i++)
        {
            if (i>0 && ((x[i-1] + x[i+1])/2) > x[i]){
                wynik += 1;
            }
        }
        System.out.println("Wsród podanych liczb jest " + wynik + " liczb, które spełniają warunek podany w poleceniu");
    }
}
