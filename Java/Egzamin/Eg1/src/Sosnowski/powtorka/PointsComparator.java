package Sosnowski.powtorka;

import java.util.Comparator;

public class PointsComparator implements Comparator<Doktorant> {

    @Override
    public int compare(Doktorant doktorant1, Doktorant doktorant2) {
        int doktor1Sum = 0;
        int doktor2Sum = 0;
        for (int i = 0; i < doktorant1.getPoints().size(); i++)
        {
            doktor1Sum += doktorant1.getPoints().get(i);
        }
        for (int i = 0; i < doktorant2.getPoints().size(); i++)
        {
            doktor2Sum += doktorant2.getPoints().get(i);
        }
        return Integer.compare(doktor1Sum, doktor2Sum);
    }
}
