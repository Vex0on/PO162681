package Z_A;

import java.util.Scanner;

public class Car {
    private final String carBrand;
    private final int carProdYear;
    private final String carModel;
    private final int doorNumber;
    private final int engineCapacity;
    private final double avgCombustion;

    public Car(String carBrand, int carProdYear, String carModel, int doorNumber, int engineCapacity, double avgCombustion) {
        this.carBrand = carBrand;
        this.carProdYear = carProdYear;
        this.carModel = carModel;
        this.doorNumber = doorNumber;
        this.engineCapacity = engineCapacity;
        this.avgCombustion = avgCombustion;
    }

    public String getCarBrand() { return carBrand;}
    public int getCarProdYear() {return carProdYear;}
    public String getCarModel() {return carModel;}
    public int getDoorNumber() {return doorNumber;}
    public int getEngineCapacity() {return engineCapacity;}
    public double getAvgCombustion() {return avgCombustion;}

    @Override
    public String toString() {
        return "Marka pojazdu: " + this.getCarBrand() + "\nRok produkcji: " + this.getCarProdYear() + "\nModel pojazdu: " +
                this.getCarModel() + "\nLiczba drzwi: " + this.getDoorNumber() + "\nPojemność silnika: " + this.getEngineCapacity()
                + "\nŚrednie spalanie: " + this.getAvgCombustion();
    }

    private double countCombustion()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długość drogi: ");
        double roadLength = scan.nextDouble();
        return roadLength * avgCombustion;
    }

    public double countDriveCost()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj cenę paliwa: ");
        double fuelPrice = scan.nextDouble();
        return countCombustion() * fuelPrice;
    }
}
