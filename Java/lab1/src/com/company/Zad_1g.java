package com.company;

import java.util.Scanner;

public class Zad_1g {

    public static void main(String[] args) {
        System.out.println("Zadanie 1 g) ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc skladnikow: ");
        int n = scan.nextInt();
        int start = 0;
        int start2 = 1;
        for (int i = 0;i<n;i++)
        {
            System.out.println("Podaj liczbe rzeczywista: ");
            int a = scan.nextInt();
            start += a;
            start2 *= a;
        }
        System.out.println("Wynik =  " + start + " oraz " + start2);
    }
}
