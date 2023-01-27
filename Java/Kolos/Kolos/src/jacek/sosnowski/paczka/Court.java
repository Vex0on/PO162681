package jacek.sosnowski.paczka;

import java.time.LocalDate;
import java.util.Objects;

class Court {
    private double width;
    private double length;
    private String address;
    private int year_built;

    public Court(double width, double length, String address, int year_built){
        if (length < 90 ||  length > 120)
        {
            length = 150;
        }
        if (width < 45 || width > 90)
        {
            width = 68;
        }
        this.width = width;
        this.length = length;
        this.address = address;
        this.year_built = year_built;
    }
    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public String getAddress() {
        return this.address;
    }

    public int getYear_built() {
        return this.year_built;
    }

    public void setWidth(double width) {
        if (width >= 45 && width <= 90)
            this.width = width;
    }

    public void setLength(double length) {
        if (length >= 90 && length <= 120)
            this.length = length;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setYear_built(int year_built) {
        this.year_built = year_built;
    }

    public double area(){
        return this.width * this.length;
    }

    public static void validate(Court other){
        if (other.year_built < 0 || other.year_built > LocalDate.now().getYear()){
            other.year_built = LocalDate.now().getYear();
        }
    }

    @Override
    public String toString(){
        return "Boisko wybudowane w roku " + this.year_built + ", o długości " + this.length + " metrów i szerokości " + this.width + " metrów.\n" +
                "Pole powierzchni: " + this.area() + " mkw.\n" +
                "Adres: " + this.address + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Court))
            return false;
        Court court = (Court) obj;
        return this.area() == court.area();
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, address, year_built);
    }
}
