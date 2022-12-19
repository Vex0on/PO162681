package com.company;

import java.util.Scanner;

public class Zad_1_2 {

    public static void main(String[] args) {
        System.out.println("Zadanie 1_2");
        Scanner scan = new
                Scanner(System.in);
        System.out.println("Ilosc skladnikow: ");
        int n = scan.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbe rzeczywista: ");
            int a = scan.nextInt();
            x[i] = a;
        }
        System.out.println("Ciag = ");
        for (int i = 1; i < n; i++) {
            System.out.print(x[i] + " -> ");
        }
        System.out.println(x[0]);
    }
}