package Sosnowski.powtorka.J2;

public class PairUtil {
    public static <T> Pair<T> swap(Pair<T> pair) {
        T first = pair.getFirst();
        T second = pair.getSecond();
        return new Pair<T>(second, first);
    }
}