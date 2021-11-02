package Lab4;
import java.util.ArrayList;

public class Lab4Zadanie1 {

    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<>(8);
        for(int i=0; i<8; i++)
            arr1.add(i, i+1);

        ArrayList<Integer> arr2 = new ArrayList<>(4);
        for(int i=0; i<4; i++)
            arr2.add(i, i+9);

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(append(arr1, arr2));
    }

    public static ArrayList<Integer> append(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.addAll(0, arr1);
        arrL.addAll(arr1.size(), arr2);
        return arrL;
    }
}

