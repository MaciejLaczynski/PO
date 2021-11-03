import java.util.Random;
public class Zadanie2T {

    public static void main(String[] args) {

        int amount = 20;
        int[] array = new int[amount];

        randomGen(amount, 50, -50, array);

        int largest = largest(array, amount);

        int count = occurrences(array, amount, largest);

        System.out.println("Najwieksza liczba: " + largest + " Wystapila " + count + " razy.");

    }

    public static int[] randomGen(int amount, int max, int min, int[] array) {
        for (int i = 0; i < amount; i++) {
            Random random = new Random();
            int int_random = random.nextInt(max - min) + min;
            array[i] = int_random;
        }

        return array;
    }

    public static int largest(int[] array, int amount) {
        int largest = -999;
        for (int i = 0; i < amount; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static int occurrences(int[] array, int amount, int largest) {
        int count = 0;
        for (int i = 0; i < amount; i++) {
            if (array[i] == largest) {
                count++;
            }
        }
        return count;
    }
}