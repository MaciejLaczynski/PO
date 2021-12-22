package lab10;

import java.util.BitSet;
import java.util.LinkedList;
import java.util.Stack;

public class Cw10 {

    public static void main(String[] args) {
        LinkedList<String> employees = new LinkedList<>();
        employees.add("Joe Mama");
        employees.add("Yuri Tarded");
        employees.add("Nick Gurr");
        employees.add("Barb Dwyer");
        System.out.println(employees);
        reduction(employees, 2);
        System.out.println();
        System.out.println(employees);
        reverse(employees);
        System.out.println();
        System.out.println(employees);
        String x = "The bond's name. James Name. Bond name's the James. Bames Nond's havign a stronk. Call a bondulance.";
        System.out.println();
        System.out.println("Tekst: " + x);
        System.out.println("Zmodyfikowany tekst: " + odwroc(x));
        LinkedList<Integer> digits = new LinkedList<>();
        digits.add(1);
        digits.add(2);
        digits.add(3);
        System.out.println(digits);
        Cw10.digits(2015);
        System.out.println();
        Cw10.Erastotenes(100);
    }

    public static <T> void reduction(LinkedList<T> workers, int n) {
        for (int i = n - 1; i < workers.size(); i += n - 1) {
            workers.remove(i);
        }
    }

    public static <T> void reverse(LinkedList<T> ulist){
        LinkedList<T> holder = new LinkedList<>(ulist);
        for(int i =ulist.size()-1, j = 0; i >= 0; i--, j++){
            ulist.set(j, holder.get(i));
        }
    }

    public static String odwroc(String sentence){ // Seriously, did anyone expect Baby Yoda's name to be G r o g u ?
        String[] words = sentence.split(" ");
        StringBuilder garbled = new StringBuilder();
        Stack<String> odwroc = new Stack<>();
        for(String word : words){
            odwroc.push(word);
            if(word.endsWith(".")){
                while((!odwroc.empty())){
                    StringBuilder reversedphrase = new StringBuilder();
                    reversedphrase.append(odwroc.pop());
                    if(odwroc.empty()){
                        reversedphrase.setCharAt(0, Character.toLowerCase(reversedphrase.charAt(0)));
                        garbled.append(reversedphrase);
                        garbled.append(". ");
                    }
                    else if(reversedphrase.toString().equals(word)){
                        reversedphrase.setCharAt(0, Character.toUpperCase(reversedphrase.charAt(0)));
                        garbled.append(reversedphrase, 0, reversedphrase.length()-1);
                        garbled.append(" ");
                    }
                    else{
                        garbled.append(reversedphrase);
                        garbled.append(" ");
                    }
                }
            }
        }
        return garbled.toString();
    }

    public static void digits(int num){
        Stack<Integer> indiv = new Stack<>();
        while(num!=0){
            indiv.push(num%10);
            num/=10;
        }
        while (!indiv.empty()){
            System.out.print(indiv.pop()+" ");
        }
    }

    public static void Erastotenes(int n){
        BitSet b = new BitSet(n + 1);
        for (int j = 2; j <= n; ++j) {
            b.set(j);
        }
        int j = 2;
        while (j * j <= n) {
            if (b.get(j)) {
                int k = 2 * j;
                while (k <= n) {
                    b.clear(k);
                    k += j;
                }
            }
            ++j;
        }
        int[] prime= b.stream().toArray();
        for(int x: prime){
            System.out.print(x+" ");
        }
        System.out.println();
    }

}
