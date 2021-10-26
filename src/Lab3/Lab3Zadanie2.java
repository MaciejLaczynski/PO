package Lab3;
import java.util.Arrays;
import java.util.Random;

public class Lab3Zadanie2 {
    public static void main(String[] args) { //change int to void
        int[] array = new int[22];
        stworz(array, 21, -20, 20);
        System.out.println(IleNieparzystych(array));
        System.out.println(LiczbaParzystych(array));
        System.out.println(IleDodatnich(array));
        System.out.println(IleUjemnych(array));
        System.out.println(IleZer(array));
        System.out.println(IleMaksymalnych(array));
        System.out.println(SumaDodatnich(array));
        System.out.println(SumaUjemnych(array));
        System.out.println(DlugoscMaksymalnegoCiaguDodatnich(array,21));
        Signum(array);
        OdwrocFragment(array);
    }
    public static int LiczbaLosowa(int min, int max){
        Random random = new Random();
        return random.nextInt(max-min)+min;
    }

    public static void stworz(int[] tab, int n, int min, int max){
        System.out.print("[");
        for (int i=0; i<=n; i++){
            tab[i] = LiczbaLosowa(min, max);
            System.out.print(tab[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
    public static int IleNieparzystych(int[] tab){
        int OddCount = 0;
        for(int elem: tab){
            if(!(elem % 2 ==0))
                OddCount++;
        }
        return OddCount;
    }

    public static int LiczbaParzystych(int[] tab) {
        int EvenCount = 0;
        for (int elem : tab) {
            if (elem % 2 == 0)
                EvenCount++;
        }
        return EvenCount;
    }

    public static int IleDodatnich(int[] tab) {
        int Pos = 0;
        for (int elem : tab) {
            if (elem >= 0)
                Pos++;
        }
        return Pos;
    }

    public static int IleUjemnych(int[] tab) {
        int Neg = 0;
        for (int elem : tab) {
            if (elem < 0)
                Neg++;
        }
        return Neg;
    }

    public static int IleZer(int[] tab) {
        int Zer = 0;
        for (int elem : tab) {
            if (elem == 0)
                Zer++;
        }
        return Zer;
    }

    public static int IleMaksymalnych(int[] tab) {
        int big = -999;
        for (int elem : tab) {
            if (elem > big)
                big = elem;
        }
        return big;
    }

    public static int SumaDodatnich(int[] tab) {
        int SumPos = 0;
        for (int elem : tab) {
            if (elem >= 0)
                SumPos = SumPos + elem;
        }
        return SumPos;
    }

    public static int SumaUjemnych(int[] tab) {
        int NegPos = 0;
        for (int elem : tab) {
            if (elem < 0)
                NegPos = NegPos + elem;
        }
        return NegPos;
    }

    public static int DlugoscMaksymalnegoCiaguDodatnich(int[] tab, int n) {
        int maxLen = 0, currLen = 0;

        for (int k = 0; k < n; k++){
            if(tab[k] > 0){
                currLen++;
            }
            else{
                if(currLen > maxLen){
                    maxLen = currLen;
                }
                currLen = 0;
            }
        }
        if(maxLen > 0){
            return maxLen;
        }
        else
            return 0;
    }
    public static void Signum(int[] tab) {
        System.out.print("[");
        for (int i = 0; i < (tab.length); i++) {
            if (tab[i] < 0)
                System.out.print("-1 ");
            else if (tab[i] == 0)
                System.out.print("0 ");
            else if (tab[i] > 0)
                System.out.print("1 ");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void OdwrocFragment(int[] tab){
        int[] master = tab;
        int[] reverse = tab;
        int j = 0;
        for(int i=(tab.length -1); i>=0; i--){
            reverse[j] = tab[i];
            j++;
        }
        System.out.println(Arrays.toString(reverse));
    }
}
