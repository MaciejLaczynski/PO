import java.util.Arrays;
public class Zadanie2_1d {
    static int count_if_elements_apply_to_condition1(int x, int[] y){
        int count = 0;
        for(int i=2;i<(x-1);i++){
            if(y[i]<(y[i-1]+y[i+1])/2){
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
        System.out.println("Liczby spelniajace warunek: "+ count_if_elements_apply_to_condition1(n, numbers));

    }
}

