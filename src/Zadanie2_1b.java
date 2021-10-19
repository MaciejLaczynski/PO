import java.util.Arrays;
public class Zadanie2_1b {

    static int divisible_by_3_not_5(int x, int[] y){
        int count = 0;
        for(int i=0;i<x;i++){
            if(y[i]%3==0 && !(y[i]%5==0)){
                count += 1;
                System.out.print(y[i]+"\n");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = {0,1,2,3,4,9,10};
        System.out.print(Arrays.toString(numbers)+"\n");
        System.out.println("Ilosc liczb podzielnych przez 3 ale nie przez 5: "+ divisible_by_3_not_5(n, numbers));

    }
}

