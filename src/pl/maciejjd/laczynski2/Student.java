package pl.maciejjd.laczynski2;

import java.time.LocalDate;

public class Student extends Osoba {

    public String kierunek;
    public double srednia;

    public Student(String surname, String[] name, LocalDate birthdate, boolean gender, String program, double AG){
        super(surname, name, birthdate, gender);
        this.kierunek = program;
        this.srednia = AG;
    }

    public double getSrednia(){
        return srednia;
    }

    public void setSrednia(double entered){
        this.srednia = entered;
    }

    @Override
    public String getEntry(){
        return "Student ten jest na kierunku: " + this.kierunek + " ze średnią: " + this.srednia;
    }
}
