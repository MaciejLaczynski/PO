package Lab4;
import java.util.ArrayList;

public class Lab4Zadanie4 {

    public static void main(String[] args){

        ArrayList<Integer> arr1 = new ArrayList<>(8);
        for(int i=0; i<8; i++)
            arr1.add(i, i+1);

        System.out.println(arr1);
        System.out.println(mergeReverse(arr1));

    }

    public static ArrayList<Integer> mergeReverse(ArrayList<Integer> a){
        ArrayList<Integer> arrRev = new ArrayList<>();
        int ca = a.size()-1;
        for (int i = 0; i < a.size(); i++){
            arrRev.add(a.get(ca--));
        }
        return arrRev;
    }

}