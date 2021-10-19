import java.util.Arrays;
public class Zadanie2_1g {

    static int count_nonnegative_uneven(int x, int[] y){
        int count = 0;
        for(int i=0;i<x;i++){
            if(y[i]%2!=0 && y[i]>=0){
                count += 1;
                System.out.print(y[i]+"\n");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = {0,1,2,3,7,-5,-15};
        System.out.print(Arrays.toString(numbers)+"\n");
        System.out.println("Ilosc liczb nieparzystych i nieujemnych: "+ count_nonnegative_uneven(n, numbers));

    }
}

