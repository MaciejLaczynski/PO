package Lab4;
import java.util.ArrayList;

public class Lab4Zadanie5 {

    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<>(8);
        for(int i=0; i<9; i++)
            arr1.add(i, i+1);

        System.out.println(arr1);
        reverse(arr1);
    }

    public static void reverse(ArrayList<Integer> a){
        int size = a.size();
        for (int i = 0; i < size / 2; i++) {
            Integer rev = a.get(i);
            a.set(i, a.get(size - i - 1));
            a.set(size - i - 1, rev);
        }
        System.out.println(a);
    }

}

