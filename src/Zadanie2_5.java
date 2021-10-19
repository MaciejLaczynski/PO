import java.util.Arrays;
public class Zadanie2_5 {

    static int count_number_of_pairs(int x, int[] y) {
        int count = 0;
        for (int i = 0; i < (x - 1); i++) {
            if (y[i] > 0 && y[i + 1] > 0) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 7;
        int[] numbers = {0, -11, 2, 3, -4, 10, 15};
        System.out.print(Arrays.toString(numbers) + "\n");
        System.out.println("Liczba par: " + count_number_of_pairs(n, numbers));

    }
}