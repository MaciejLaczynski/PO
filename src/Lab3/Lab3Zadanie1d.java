package Lab3;
import java.util.Random;

public class Lab3Zadanie1d {
    public static void main(String[] args) {

        Random random = new Random();
        int n;
        int max_n = 100;
        int min_n = 1;
        n = random.nextInt((max_n - min_n)+1) + min_n;

        int[] array = new int[n];
        int max = 999;
        int min = -999;

        int positive_sum = 0;
        int negative_sum = 0;
        for(int i=0; i<n; i++) {
            array[i] = random.nextInt((max-min)+1) + min;
            System.out.println(array[i]);
            if(array[i]>0) positive_sum += array[i];
            else negative_sum += array[i];
        }

        System.out.println("Rozmiar tablicy: "+n);
        System.out.println("Suma liczb dodatnich w tablicy: "+positive_sum);
        System.out.println("Różnica liczb ujemnych w tablicy: "+negative_sum);
    }
}
