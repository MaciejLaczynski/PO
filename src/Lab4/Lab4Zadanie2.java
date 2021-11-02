package Lab4;
import java.util.ArrayList;

public class Lab4Zadanie2 {

    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<>(8);
        for(int i=0; i<8; i++)
            arr1.add(i, i+1);

        ArrayList<Integer> arr2 = new ArrayList<>(4);
        for(int i=0; i<4; i++)
            arr2.add(i, i+9);

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(merge(arr1, arr2));
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> arrMerged = new ArrayList<>();
        int ca = 0;
        int cb = 0;
        while(ca < a.size() || cb < b.size()){
            if(ca < a.size())
                arrMerged.add(a.get(ca++));
            if(cb < b.size())
                arrMerged.add(b.get(cb++));
        }
        return arrMerged;
    }
}