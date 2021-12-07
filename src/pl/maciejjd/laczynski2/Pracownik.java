package pl.maciejjd.laczynski2;
import java.time.LocalDate;

public class Pracownik extends Osoba {

    private double pensja;
    private LocalDate dataZatrudnienia;

    public Pracownik(String surname, String[] name, LocalDate birthdate, boolean gender, double salary, LocalDate DH){
        super(surname, name, birthdate, gender);
        this.pensja = salary;
        this.dataZatrudnienia = DH;
    }

    public double getPensja(){
        return pensja;
    }

    public LocalDate getDataZatrudnienia(){
        return dataZatrudnienia;
    }

    @Override
    public String getEntry() {
        return String.format("Tego pracownika zatrudniono %s, z pensją: %.2f PLN.",
                this.dataZatrudnienia.toString(), this.pensja);
    }
}
