package nr_158809E02.Z1;

import java.util.ArrayList;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args){

        ArrayList<Integer> test = new ArrayList<Integer>();

        test.add(1);
        test.add(2);
        test.add(3);
        test.add(2);
        test.add(1);

        System.out.println(nr_158809E02.Z1.ArrayUtil.jestPalindromem(test));

        LocalTime localTime1 = LocalTime.of(10, 0, 0);
        LocalTime localTime2 = LocalTime.of(12, 0, 0);

        ArrayList<LocalTime> test2 = new ArrayList<LocalTime>();
        test2.add(localTime1);
        test2.add(localTime2);
        test2.add(localTime2);

        System.out.println(ArrayUtil.jestPalindromem(test2));
    }
}

