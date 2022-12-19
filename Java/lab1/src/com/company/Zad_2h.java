package com.company;

import java.util.Scanner;
import static java.lang.Math.abs;

    public class Zad_2h {

        public static void main(String[] args) {
            System.out.println("Zadanie 2 h) ");
            Scanner scan = new Scanner(System.in);
            System.out.println("Ilosc liczb: ");
            int n = scan.nextInt();
            int []x = new int[n];
            int wynik = 0;

            for (int i=0;i<n;i++) {
                System.out.println("Podaj liczbe naturalna: ");
                int a = scan.nextInt();
                x[i] = a;
            }

            for (int i=0;i<n;i++)
                {
                    if (abs(x[i]) < i * i) {
                        wynik += 1;
                    }
                }
                System.out.println("Wsród podanych liczb jest " + wynik + " liczb, które spełniają warunek podany w poleceniu");
            }
        }
