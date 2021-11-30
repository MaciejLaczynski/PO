package pl.maciejjd.laczynski;

public class Nauczyciel extends Osoba{

    private int salary;

    public Nauczyciel(String nazwisko, int rokUrodzenia, int salary){
        super(nazwisko, rokUrodzenia);
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }

    public String toString(){
        return super.toString() + "\n Salary: " + this.salary;
    }
}

