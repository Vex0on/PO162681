package com.company;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Zad_1e {

    public static void main(String[] args) {
        System.out.println("Zadanie 1 e) ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc czynnikow: ");
        int n = scan.nextInt();
        int start = 1;
        for (int i = 0;i<n;i++)
        {
            System.out.println("Podaj liczbe rzeczywista: ");
            int a = scan.nextInt();
            start *= abs(a);
        }
        System.out.println("Iloczyn bezwzgl tych liczb wynosi " + start);
    }
}
