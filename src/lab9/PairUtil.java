package lab9;

public class PairUtil<T>{
    public static <T> Pair<T> swap(Pair<T> test){
        Pair<T> prev_pair = new Pair<>(test.getFirst(), test.getSecond());
        test.swap();
        return prev_pair;
    }
}
