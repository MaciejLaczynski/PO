import java.util.Arrays;
public class Zadanie2_4 {

    static void min_and_max_value(int x, int[] y){
        int i = 0;
        int min = y[i];
        int max = y[i];
        for(i=0;i<x;i++){
            if(y[i]>max) max = y[i];
            if(y[i]<min) min = y[i];
        }

        System.out.format("Liczba największa: %d%n",min);
        System.out.format("Liczba najmniejsza: %d%n",max);
    }
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = {0,-11,2,3,-4,10,15};
        System.out.print(Arrays.toString(numbers)+"\n");
        min_and_max_value(n, numbers);

    }
}
