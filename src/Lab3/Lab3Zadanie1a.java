package Lab3;
import java.util.Random;

public class Lab3Zadanie1a {
    public static void main(String[] args) {
        Random random = new Random();
        int n;
        int max_n = 100;
        int min_n = 1;
        n = random.nextInt((max_n - min_n)+1) + min_n;

        int[] array = new int[n];
        int max = 999;
        int min = -999;
        int  even_count = 0;
        int odd_count = 0;
        for(int i=0; i<n; i++) {
            array[i] = random.nextInt((max-min)+1) + min;
            System.out.println(array[i]);
            if(array[i]%2==0) even_count += 1;
            else odd_count += 1;

        }
        System.out.println("Rozmiar tablicy: "+n);
        System.out.println("Liczby parzyste w tablicy: "+even_count);
        System.out.println("Liczby nieparzyste w tablicy: "+odd_count);
    }
}
