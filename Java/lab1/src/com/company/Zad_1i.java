package com.company;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Zad_1i {

    public static int silnia(int liczba) {
        int wynik = 1;
        for (int i=1;i<=liczba;i++)
        {
            wynik *= i;
        }
        return wynik;
    }

    public static void main (String[]args){
        System.out.println("Zadanie 1 i)");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc skladnikow: ");
        int n = scan.nextInt();
        int wynik = 0;
        for (int i=1;i<=n;i++) {
            System.out.println("Podaj liczbe rzeczywista: ");
            int liczba = scan.nextInt();
            wynik += pow(-1, i) * (liczba / silnia(i));
        }
        System.out.println("Wynik =  " + wynik);
    }
}