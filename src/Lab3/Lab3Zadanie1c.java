package Lab3;
import java.util.Random;

public class Lab3Zadanie1c {
    public static void main(String[] args) {
        Random random = new Random();
        int n;
        int max_n = 100;
        int min_n = 1;
        n = random.nextInt((max_n - min_n)+1) + min_n;

        int[] array = new int[n];
        int max = 999;
        int min = -999;

        int max_value = -999;
        int max_value_instances = 0;
        for(int i=0; i<n; i++) {
            array[i] = random.nextInt((max-min)+1) + min;
            System.out.println(array[i]);
            if(array[i]>max_value){
                max_value = array[i];
                max_value_instances += 1;
            }

        }

        System.out.println("Rozmiar tablicy: "+n);
        System.out.println("Największa wartość w tablicy: "+max_value);
        System.out.println("Ile razy w tablicy pojawia się największa wartość: "+max_value_instances);
    }
}