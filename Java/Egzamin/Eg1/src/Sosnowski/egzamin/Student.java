package Sosnowski.egzamin;

import java.util.Date;

public class Student extends Person implements Named, Cloneable {
    private final int id;
    private Date dateOfStart = null;

    public Student(String name, int id) {
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

    public Student clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.dateOfStart = (Date) dateOfStart.clone();
        return cloned;
    }

}
