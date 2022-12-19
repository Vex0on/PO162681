package com.company;

import java.util.Scanner;

public class Zad_1b {

    public static void main(String[] args) {
        System.out.println("Zadanie 1 b)");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc czynnikow: ");
        int n = scan.nextInt();
        int start = 1;
        for (int i=0;i<n;i++)
        {
            System.out.println("Podaj liczbe rzeczywista: ");
            int a = scan.nextInt();
            start *= a;
        }
        System.out.println("Iloczyn tych skladnikow wynosi " + start);
    }
}
