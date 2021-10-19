import java.util.Arrays;
public class Zadanie2_2 {

    static int count_2xsum_of_positive(int x, int[] y){
        int sum = 0;
        for(int i=0;i<x;i++){
            if(y[i]>0){
                sum += y[i];
            }
        }
        return 2*sum;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = {0,-11,2,3,-4,10,15};
        System.out.print(Arrays.toString(numbers)+"\n");
        System.out.println("Podwojona suma liczb dodatnich: "+ count_2xsum_of_positive(n, numbers));

    }
}