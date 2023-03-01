package Sosnowski.powtorka.J3;

import java.util.*;

public class Eratosthenes {

    public static Set<Integer> eratosthenes(int n) {
        Set<Integer> primes = new TreeSet<>();
        for (int i = 2; i <= n; i++) {
            primes.add(i);
        }
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrtN; i++) {
            if (primes.contains(i)) {
                for (int j = i * i; j <= n; j += i) {
                    primes.remove(j);
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();
        Set<Integer> primes = eratosthenes(n);
        System.out.println("Liczby pierwsze do " + n + ": " + primes);
    }
}