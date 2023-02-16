package Sosnowski.cos2;

import java.util.Comparator;

public class PointsComparator implements Comparator<Doktorant> {

    @Override
    public int compare(Doktorant o1, Doktorant o2) {
        int pointsSum = 0;
        int doktorSum = 0;
        for (int i = 0; i < o1.getPoints().size(); i++){
            pointsSum += o1.getPoints().get(i);
        }
        for (int i = 0; i < o2.getPoints().size(); i++){
            doktorSum += o2.getPoints().get(i);
        }
        return Integer.compare(pointsSum, doktorSum);
    }
}
