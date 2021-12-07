package pl.maciejjd.laczynski2.instrumenty;
import java.time.LocalDate;


public class Test {

    public static void main(String[] args) {
        Instrument[] specifics = new Instrument[1];

        specifics[0] = new Flet("Avanti", LocalDate.of(2016, 1, 1));

        for (Instrument ins : specifics) {
            System.out.print(ins.sound() + "\n");
            System.out.println(ins);
        }
    }
}
