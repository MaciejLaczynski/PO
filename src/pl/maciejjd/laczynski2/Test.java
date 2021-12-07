package pl.maciejjd.laczynski2;
import java.time.LocalDate;

public class Test {

    public static void main(String[] args){

        Osoba[] people = new Osoba[1];

        people[0] = new Pracownik("Adrian", new String[]{"Szczurczyk"}, LocalDate.of(1999, 2, 8),
                false, 72000, LocalDate.of(2021, 9, 25));

        for(Osoba p : people){
            for(String i: p.getImie()){
                System.out.print(i + " ");
            }
            System.out.print(p.getNazwisko() + " - " + p.getEntry()
                    + " \nUrodzony: " + p.getDataUr() + " Plec: ");
            if(p.getPlec()){
                System.out.println("Kobieta.");
            }
            else
            {
                System.out.println("Mezczyzna.");
            }
        }

    }
}
//Jak zwykle coś z githubem mi się musi pierdolić xd