package com.company;

import java.util.Scanner;

public class Zad_2_2 {

    public static void main(String[] args) {
        System.out.println("Zadanie 2_2) ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc liczb: ");
        int n = scan.nextInt();
        int wynik = 0;

        for (int i=0;i<n;i++) {
            System.out.println("Podaj liczbę rzeczywistą: ");
            int a = scan.nextInt();

            if (a > 0)
            {
                wynik += a;
            }
        }
        System.out.println("Podwojona suma liczb wynosi " + wynik * 2);
    }
}
