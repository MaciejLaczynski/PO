import static java.lang.Math.*;
import java.util.Arrays;
public class Zadanie2_1h {

    static int count_if_elements_apply_to_condition3(int x, int[] y){
        int count = 0;
        for(int i=0;i<x;i++){
            if(abs(y[i])<pow(i, 2)){
                count += 1;
                System.out.print(y[i]+"\n");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = {0,1,2,421,7,-5,-15};
        System.out.print(Arrays.toString(numbers)+"\n");
        System.out.println("Ilosc liczb spelniajacych warunek: "+ count_if_elements_apply_to_condition3(n, numbers));

    }
}