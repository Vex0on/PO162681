package Sosnowski.egzamin2;

import java.util.Comparator;

public class PointsComparator implements Comparator<Mentor> {

    @Override
    public int compare(Mentor o1, Mentor o2) {
        int pointsSum = 0;
        int mentorSum = 0;
        for (int i = 0; i < o1.getPoints().size(); i++)
        {
            pointsSum += o1.getPoints().get(i);
        }
        for (int i = 0; i < o2.getPoints().size(); i++)
        {
            mentorSum += o2.getPoints().get(i);
        }
        return Integer.compare(pointsSum, mentorSum);
    }
}
