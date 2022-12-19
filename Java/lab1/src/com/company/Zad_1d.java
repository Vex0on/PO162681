package com.company;

import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Zad_1d {

    public static void main(String[] args) {
        System.out.println("Zadanie 1 d) ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc skladnikow: ");
        int n = scan.nextInt();
        int start = 0;
        for (int i = 0;i<n;i++)
        {
            System.out.println("Podaj liczbe rzeczywista: ");
            int a = scan.nextInt();
            start += sqrt(abs(a));
        }
        System.out.println("Suma bezwzgl tych liczb wynosi " + start);
    }
}

