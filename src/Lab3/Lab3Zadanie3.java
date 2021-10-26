package Lab3;
import java.util.Random;

public class Lab3Zadanie3 {

    public static void main(String[] Args){
        neo(3,3, 2);
    }

    public static void neo(int m, int n, int k){

        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[n][k];

        for (int i = 0; i < m; i++ ) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = getRandomNum(-20, 20);
                System.out.format("%4d", matrixA[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m; i++ ) {
            for (int j = 0; j < k; j++) {
                matrixB[i][j] = getRandomNum(-20, 20);
                System.out.format("%4d", matrixB[i][j]);
            }
            System.out.println();
        }
        redPill(matrixA, matrixB);
    }

    public static int getRandomNum(int min, int max){
        Random random = new Random();
        return random.nextInt(max-min)+min;
    }

    public static void redPill(int[][] a, int[][] b){



    }
}