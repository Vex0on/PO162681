package Z_C;

import java.util.Scanner;

public class Matematyka {
    static double pi = 3.14;

    public static double obwod_kola()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj promień koła: ");
        double r = scan.nextDouble();
        return 2 * pi * r;
    }
    public static double pole_kola()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj promień koła: ");
        double r = scan.nextDouble();
        return pi * (r * r);
    }
}
