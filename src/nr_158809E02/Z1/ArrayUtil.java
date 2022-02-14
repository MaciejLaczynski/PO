package nr_158809E02.Z1;

import java.util.ArrayList;

public class ArrayUtil {

    public static <T extends Comparable<? super T>> boolean jestPalindromem(ArrayList<T> list){
        if(list.size() == 0 || list.size() == 1){
            return true;
        }

        int n = list.size();

        for(int i=0; i<(n/2); i++){
            if(list.get(i) != list.get(n-i-1)){
                return false;
            }
        }
        return true;
    }

}