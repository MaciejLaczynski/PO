import java.util.Arrays;
public class Zadanie2_1f {

    static int count_uneven_indexes(int x, int[] y){
        int count = 0;
        for(int i=0;i<x;i++){
            if(i%2!=0 && y[i]%2==0){
                count += 1;
                System.out.print(y[i]+"\n");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = {0,1,2,3,4,10,15};
        System.out.print(Arrays.toString(numbers)+"\n");
        System.out.println("Liczby bedace liczbami parzystymi majacymi nieparzysty numer: "+ count_uneven_indexes(n, numbers));

    }
}