import static java.lang.Math.*;
import java.util.Arrays;
public class Zadanie2_1e {
    static int factorial(int x){
        if(x>=0) {
            int result = 1;
            for (int j = 1; j <= x; j++) result *= j;
            return result;
        }
        return 0;
    }
    static int count_if_elements_apply_to_condition2(int x, int[] y){
        int count = 0;
        for(int i=1;i<=(x-1);i++){
            if(y[i]>pow(2,i) && y[i]<factorial(i)){
                count += 1;
                System.out.print(y[i]+"\n");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 10;
        int[] numbers = {1,15,3,7,9,10,16,235,1444,4999};
        System.out.print(Arrays.toString(numbers)+"\n");
        System.out.println("Liczby spelaniajace warunek: "+ count_if_elements_apply_to_condition2(n, numbers));

    }
}