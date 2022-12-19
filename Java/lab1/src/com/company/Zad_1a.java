package com.company;

import java.util.Scanner;

public class Zad_1a {

    public static void main(String[] args) {
        System.out.println("Zadanie 1 a)");
	Scanner scan = new
            Scanner(System.in);
        System.out.println("Ilosc skladnikow: ");
        int n = scan.nextInt();
        int start = 0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Podaj liczbe rzeczywista: ");
            int a = scan.nextInt();
            start += a;
        }
        System.out.println("Suma tych skladnikow wynosi " + start);
    }
}
