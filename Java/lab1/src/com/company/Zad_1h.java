package com.company;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Zad_1h {

    public static void main(String[] args) {
        System.out.println("Zadanie 1 h)");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc skladnikow: ");
        int n = scan.nextInt();
        int start = 0;
        for (int i = 0;i<n;i++)
        {
            System.out.println("Podaj liczbe rzeczywista: ");
            double a = scan.nextInt();
            start += pow(-1, a + 2);
        }
        System.out.println("Wynik =  " + start);
    }
}