package Sosnowski.powtorka;

import java.util.ArrayList;
import java.util.Date;

public class Doktorant extends Student implements Named, Cloneable, Comparable<Doktorant>{
    private final int id;
    private Date dateOfStart = null;
    private ArrayList<Integer> points = null;

    public Doktorant(String name, int id, ArrayList<Integer> points) {
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
    public Doktorant clone() {
        try {
            Doktorant clone = (Doktorant) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Doktorant o) {
        int nameCompare = this.getName().length() - o.getName().length();
        if (nameCompare != 0)
            return nameCompare;
        int pointSum = 0;
        int doktorSum = 0;
        for (int i = 0; i < this.getPoints().size(); i++)
        {
            pointSum += this.getPoints().get(i);
        }
        for (int j = 0; j < o.getPoints().size(); j++)
        {
            doktorSum += o.getPoints().get(j);
        }
        return Integer.compare(pointSum, doktorSum);
    }
}