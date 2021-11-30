package lab5;
import java.util.stream.IntStream;

public class IntegerSet {

    public static void main(String[] args){

        IntegerSet setA = new IntegerSet();
        IntegerSet setB = new IntegerSet();
        setA.insertElement(20);
        setA.insertElement(33);
        setB.insertElement(20);
        setB.insertElement(44);
        System.out.println("Set A: " + setA);
        System.out.print("Set B: " + setB);
        System.out.println();
        System.out.println("Union of A & B: " + IntegerSet.union(setA, setB));
        System.out.println("Intersection of A & B: " + IntegerSet.intersection(setA, setB));
        setA.deleteElement(20);
        System.out.println("Set A after deleting 20: " + setA);
    }

    private final boolean[] set;
    public IntegerSet(){
        this.set = new boolean[100];
    }
    public static IntegerSet union(IntegerSet a, IntegerSet b){
        IntegerSet sum_n = new IntegerSet();
        IntStream.range(0, 100).filter(i -> a.set[i] || b.set[i]).forEach(i -> sum_n.set[i] = true);
        return sum_n;
    }
    public static IntegerSet intersection(IntegerSet a, IntegerSet b){
        IntegerSet sum_n = new IntegerSet();
        IntStream.range(0, 100).filter(i -> a.set[i] && b.set[i]).forEachOrdered(i -> sum_n.set[i] = true);
        return sum_n;
    }
    public void insertElement(int i){
        this.set[i-1]=true;
    }
    public void deleteElement(int i){
        this.set[i-1]=false;
    }

    public String toString(){
        StringBuilder number= new StringBuilder();
        for(int i = 0; i < 100; i++){
            if(this.set[i]){
                number.append(i+1);
                number.append(" ");
            }
        }
        return number.toString();
    }
    public boolean equals(IntegerSet b){
        return this.toString().equals(b.toString());
    }
}
