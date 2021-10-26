package Lab3;
import java.util.Random;



public class Lab3Zadanie1g {
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
        }
        for(int i=0; i<n; i++) System.out.println(array[i]);
        System.out.println("----------------------");


        int lewy = random.nextInt(((n-1) - min_n)+1) + min_n;
        int prawy = random.nextInt(((n-1) - min_n)+1) + min_n;

        int temp1;
        if(lewy>prawy){
            temp1 = lewy;
            lewy = prawy;
            prawy = temp1;
        }
        int temp2;
        int pomoc=0;
        for(int j=lewy; j<((double)prawy+(double)lewy)/2; j++){
            temp2 = array[j];
            array[j] = array[prawy-pomoc];
            array[prawy-pomoc] = temp2;
            pomoc += 1;
        }

        System.out.println("Rozmiar tablicy: "+n);
        System.out.println("Odwrocenie fragmentow tablicy: "+lewy+" do: "+prawy);
        for(int i=0; i<n; i++) System.out.println(array[i]);
    }
}
