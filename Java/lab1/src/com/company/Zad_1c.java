package com.company;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Zad_1c {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 c) ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc skladnikow: ");
        int n = scan.nextInt();
        int start = 0;
        for (int i = 0;i<n;i++)
        {
            System.out.println("Podaj liczbe rzeczywista: ");
            int a = scan.nextInt();
            start += abs(a);
        }
        System.out.println("Suma bezwzgl tych skladnikow wynosi " + start);
    }
}
