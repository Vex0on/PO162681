import java.time.LocalDate;
import java.util.Objects;

public class Student extends Osoba implements Comparable<Osoba>, Cloneable{

    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }


    public double getSredniaOcen() {
        return this.sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public String toString() {
        return "Student[" + getNazwisko() + ", "+ getDataUrodzenia() + ", "  + this.sredniaOcen + ']';
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
