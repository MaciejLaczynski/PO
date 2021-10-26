package Lab3;
import java.util.Random;

public class Lab3Zadanie1e {
    public static void main(String[] args) {
        int Amount = 20;
        int max = 999;
        int min = -999;
        int[] array = new int[Amount];


        System.out.print("[ ");
        for (int i = 0; i < Amount; i++) {
            Random random = new Random();
            int int_random = random.nextInt(max - min) + min;
            array[i] = int_random;
            System.out.print(array[i] + " ");
        }
        int maxLen = 0, currLen = 0;
        for (int i = 0; i < Amount; i++) {
            if (array[i] > 0) {
                currLen++;
            } else {
                if (currLen > maxLen) {
                    maxLen = currLen;
                }
                currLen = 0;
            }
        }
        if (maxLen > 0)
            System.out.println("Najdluzszy fragment tablicy: " + maxLen);
        else
            System.out.println("Taki fragment nie wystepuje.");
    }
}