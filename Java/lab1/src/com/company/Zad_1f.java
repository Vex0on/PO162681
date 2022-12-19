package com.company;

import java.util.Scanner;

public class Zad_1f {

    public static void main(String[] args) {
        System.out.println("Zadanie 1 f) ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc skladnikow: ");
        int n = scan.nextInt();
        int start = 0;
        for (int i = 0;i<n;i++)
        {
            System.out.println("Podaj liczbe rzeczywista: ");
            int a = scan.nextInt();
            start += a*a;
        }
        System.out.println("Suma tych liczb wynosi " + start);
    }
}
