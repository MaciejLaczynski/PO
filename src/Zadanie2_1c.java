import static java.lang.Math.*;
import java.util.Arrays;
public class Zadanie2_1c {
    static int count_even_to_the_power_of_two(int x, int[] y){
        int count = 0;
        for(int i=0;i<x;i++){
            if(sqrt(y[i])%2==0 && !(y[i]==0)){
                count += 1;
                System.out.print(y[i]+"\n");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = {1,2,3,4,9,10,16};
        System.out.print(Arrays.toString(numbers)+"\n");
        System.out.println("Kwadraty liczb parzystych: "+ count_even_to_the_power_of_two(n, numbers));

    }
}

