package Sosnowski.egzamin2;

import java.util.ArrayList;
import java.util.Date;

public class Mentor extends Player implements Named, Cloneable, Comparable<Mentor>{
    private final int id;
    private Date dateOfStart = null;
    private ArrayList<Integer> points = null;

    public Mentor(String name, int id, ArrayList<Integer> points) {
        super(name);
        this.id = id;
        this.dateOfStart = new Date();
        this.points = points;
    }

    public int getId() {
        return id;
    }
    public ArrayList<Integer> getPoints() {
        return points;
    }

    public String toString() {
        return "ID = " + id
                + ", dateOfStart = " + dateOfStart
                + ", points = " + points;
    }

    @Override
    public Mentor clone() {
        try {
            Mentor clone = (Mentor) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Mentor mentor) {
        int nameCompare = this.getName().length() - mentor.getName().length();
        if (nameCompare != 0) {
            return nameCompare;
        }
        int pointsSum = 0;
        for (int i = 0; i < this.getPoints().size(); i++) {
            pointsSum += this.getPoints().get(i);
        }
        int mentorSum = 0;
        for (int i = 0; i < mentor.getPoints().size(); i++) {
            mentorSum += mentor.getPoints().get(i);
        }
        return Integer.compare(pointsSum, mentorSum);
    }
}
