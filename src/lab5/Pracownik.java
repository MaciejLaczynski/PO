package lab5;

import java.lang.management.ClassLoadingMXBean;
import java.time.LocalDate;
import java.util.*;

class driver implements Cloneable {

    public static void main(String[] args){

        Pracownik[] employees = new Pracownik[2];
        employees[0] = new Pracownik("Rowboat Ferryman", 143000, 1917, 6, 29);
        employees[1] = new Pracownik("Reboot Gilgamesh", 46000, 1939, 9, 18);

        for(Pracownik e : employees)
            e.incSalary(15);

        for(Pracownik f : employees){
            System.out.print("Imie: " + f.surname() + "\tWyplata: " + f.salary());
            System.out.print("\tData zatrudnienia: " + f.employment() + "\n");
        }
    }
}

public class Pracownik implements Cloneable {

    public Pracownik(String surname, double salary, int year, int month, int day) {
        this.surname = surname;
        this.salary = salary;

        GregorianCalendar calendar = new GregorianCalendar(year, month, day);

        this.employment = LocalDate.of(year,month,day);
    }

    public String surname() {
        return this.surname;
    }

    public double salary() {
        return this.salary;
    }

    public LocalDate employment() {
        return this.employment;
    }

    public void incSalary(double percent) {
        double raise = this.salary * percent / 100;
        this.salary += raise;
    }

    private String surname;
    private double salary;
    private LocalDate employment;
}

