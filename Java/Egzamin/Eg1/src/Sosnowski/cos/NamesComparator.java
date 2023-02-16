package Sosnowski.cos;

import java.util.Comparator;

public class NamesComparator implements Comparator<Assistant> {
    @Override
    public int compare(Assistant o1, Assistant o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
