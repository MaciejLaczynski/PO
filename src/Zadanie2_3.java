import java.util.Arrays;
public class Zadanie2_3 {

    static void count_number_of(int x, int[] y){
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for(int i=0;i<x;i++){
            if(y[i]>0){
                positive += 1;
            } else if(y[i]<0){
                negative += 1;
            } else zeros += 1;
        }
        System.out.format("Liczby dodatnie: %d%n",positive);
        System.out.format("Liczby ujemne: %d%n",negative);
        System.out.format("Liczba zer: %d%n",zeros);
    }
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = {0,-11,2,3,-4,10,15};
        System.out.print(Arrays.toString(numbers)+"\n");
        count_number_of(n, numbers);

    }
}