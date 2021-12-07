package pl.maciejjd.laczynski2;
import java.time.LocalDate;

public abstract class Osoba {

    private String nazwisko;
    private String[] imie;
    private LocalDate DataUr;
    private boolean plec;

    public Osoba(String surname, String[] name, LocalDate birthdate, boolean gender){
        this.nazwisko = surname;
        this.imie = name;
        this.DataUr = birthdate;
        this.plec = gender;
    }

    public abstract String getEntry();

    public String getNazwisko(){
        return nazwisko;
    }

    public String[] getImie(){
        return imie;
    }

    public LocalDate getDataUr(){
        return DataUr;
    }

    public boolean getPlec(){
        return plec;
    }
}
//Jak zwykle coś z githubem mi się musi pierdolić xd