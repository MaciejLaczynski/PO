import static java.lang.Math.*;

public class Zadanie1 {

    static int f_a(int n, int[] sequence){
        int suma = 0;
        for (int i=0; i<n; i++) {
            suma += sequence[i];
        }
        return suma;
    }

    static int f_b(int n, int[] sequence){
        int iloczyn = 1;
        for (int i=1; i<n; i++) {
            iloczyn *= sequence[i];
        }
        return iloczyn;
    }

    static int f_c(int n, int[] sequence){
        int abs_suma = 0;
        for (int i=0; i<n; i++) {
            abs_suma += abs(sequence[i]);
        }
        return abs_suma;
    }

    static double f_d(int n, int[] sequence){
        double abs_squared_suma = 0;
        for (int i=0; i<n; i++) {
            abs_squared_suma += sqrt(abs(sequence[i]));
        }
        return abs_squared_suma;
    }

    static int f_e(int n, int[] sequence) {
        int abs_iloczyn = 1;
        for (int i = 1; i < n; i++) {
            abs_iloczyn *= abs(sequence[i]);
        }
        return abs_iloczyn;
    }

    static int f_f(int n, int[] sequence) {
        int squared_suma = 0;
        for (int i = 0; i < n; i++) {
            squared_suma += pow(sequence[i], 2);
        }
        return squared_suma;
    }
    static int f_g(int n, int[] sequence){
        return f_a(n, sequence) + f_b(n, sequence);
    }

    static int f_h(int n, int[] sequence){
        int alternating_suma = 0;
        for (int i=0; i<n; i++) {
            alternating_suma += pow(-1, i+2)*sequence[i];
        }
        return alternating_suma;
    }

    static int factorial(int n){
        int result = 1;
        for(int i =1; i<=n;i++){
            result *= i;
        }
        return result;
    }
    static double f_i(int n, int[] sequence){
        double alternating_suma_by_factorial = 0;
        for (int i=0; i<n; i++) {
            alternating_suma_by_factorial += (pow(-1, i+1)*sequence[i])/factorial(i+1);
        }
        return alternating_suma_by_factorial;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] seq = {1, -1, 2, -2, 3, -3, 4, -4, 5, -5}; // 10 elements
        System.out.println("a) "+ f_a(n,seq));
        System.out.println("b) "+ f_b(n,seq));
        System.out.println("c) "+ f_c(n,seq));
        System.out.println("d) "+ f_d(n,seq));
        System.out.println("e) "+ f_e(n,seq));
        System.out.println("f) "+ f_f(n,seq));
        System.out.println("g) "+ f_g(n,seq));
        System.out.println("h) "+ f_h(n,seq));
        System.out.println("i) "+ f_i(n,seq));

    }
}
