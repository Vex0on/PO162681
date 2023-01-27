package pl.uwm.wmii.kaz.Vex0on;

import java.time.LocalDate;
import java.util.Objects;

public class House {
    private String address;
    private int floors;
    private int year;
    private String ownerName;

    public House(String address, int floors, int year, String ownerName){
        if (Objects.equals(address, ""))
        {
            address = "ul. Słoneczna 54, 10-710 Olsztyn";
        }

        if (floors < 0)
        {
            floors = 5;
        }
        if (year < LocalDate.now().getYear())
        {
            year = LocalDate.now().getYear();
        }
        this.address = address;
        this.floors = floors;
        this.year = year;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return this.address;
    }

    public int getFloors() {
        return this.floors;
    }

    public int getYear() {
        return this.year;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setAddress(String address) {
        if (!Objects.equals(address, "")) {
            this.address = address;
        }
    }

    public void setFloors(int floors) {
        {
            this.floors = floors;
        }
    }

    public void setYear(int year) {
        if (year < LocalDate.now().getYear())
        {
            this.year = year;
        }
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString(){
        return House.class.getSimpleName() + ": "+ "\nDom znajdujący się na " + this.address + ", ma " + this.floors +
                " pięter i został wybudowany w " + this.year + ". Jego właścicielem jest " + this.ownerName;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (!(obj instanceof House))
            return false;
        House house = (House) obj;
        return this.floors == house.floors;
    }

    public void renovate(int amount){
        this.floors += amount;
        if (this.floors > 50){
            this.floors = 50;
        }
    }

    public void jakiLimit(House house){
        System.out.println("W domu jest aktualnie " + this.floors + " pięter\n");
        int limit = 50 - this.floors;
        System.out.println("Do limitu brakuje jeszcze: " + limit + " pięter");
    }
}

