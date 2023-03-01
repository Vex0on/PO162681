package Sosnowski.powtorka.J1;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{

    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public Student clone() {
        Student clone = (Student) super.clone();
        return clone;
    }

    @Override
    public int compareTo(Osoba o) {
        int result = super.compareTo(o);
        if (result == 0 && o instanceof Student) {
            Student s = (Student) o;
            return Double.compare(sredniaOcen, s.sredniaOcen);
        }
        return result;
    }
}
