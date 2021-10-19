public class Zadanie1_2 {
    static void wypisz(int n, int[] seq){
        for (int i = 1; i < n; i++){
            System.out.println(seq[i]);
        }
        System.out.println(seq[0]);
    }
    public static void main(String[] args) {
        int n = 10;
        int[] sequence = {1,2,3,4,5,6,7,8,9,10};
        wypisz(n, sequence);

    }
}