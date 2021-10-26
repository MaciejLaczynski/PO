package Lab3;
import java.util.Random;

public class Lab3Zadanie1f {
    public static void main(String[] args) {
        Random random = new Random();
        int n;
        int max_n = 100;
        int min_n = 1;
        n = random.nextInt((max_n - min_n)+1) + min_n;

        int[] array = new int[n];
        int max = 999;
        int min = -999;


        for(int i=0; i<n; i++) {
            array[i] = random.nextInt((max-min)+1) + min;
            System.out.println(array[i]);
            if(array[i]>0) array[i] = 1;
            else array[i] = -1;

        }

        System.out.println("Rozmiar tablicy: "+n);
        for(int i=0; i<n; i++) System.out.println(array[i]);
    }
}