package Sosnowski.powtorka.J1;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba>{

    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba[" + nazwisko + ", " + dataUrodzenia + ']';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(nazwisko, osoba.nazwisko) && Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwisko, dataUrodzenia);
    }

    @Override
    public Osoba clone() {
        try {
            return (Osoba) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Osoba o) {
        int compareNazwisko = this.getNazwisko().compareTo(o.getNazwisko());
        if (compareNazwisko != 0) {
            return compareNazwisko;
        }
        return dataUrodzenia.compareTo(o.dataUrodzenia);
    }
}
