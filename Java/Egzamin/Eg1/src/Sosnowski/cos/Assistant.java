package Sosnowski.cos;

import java.util.Date;

public class Assistant extends AcademicTeacher implements Cloneable, Comparable<Assistant>{
    private final int id;
    private Date dateOfStart = null;

    public Assistant(String name, int id) {
        super(name);
        this.id = id;
        this.dateOfStart = new Date();
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID = " + id
                + ", dateOfStart = " + dateOfStart
                + "]";
    }

    @Override
    public Assistant clone() {
        try {
            Assistant clone = (Assistant) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Assistant o) {
        return this.getName().length() - o.getName().length();
    }
}
