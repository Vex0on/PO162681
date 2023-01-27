package Z_A;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Fiat", 2005, "Punto", 3, 1368, 5.5);
        Car car2 = new Car("Audi", 2015, "A4", 5, 1798, 7.0);

        System.out.println(car1 + "\n");
        System.out.println(car2 + "\n");

        System.out.println(car1.countDriveCost());
//        car1 = car2;
//
//        System.out.println("Po zmianie: \n");
//        System.out.println(car1 + "\n");
//        System.out.println(car2 + "\n");

    }
}