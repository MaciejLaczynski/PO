package pl.maciejjd.laczynski2.instrumenty;
import java.time.LocalDate;

public class Fortepian extends Instrument{
    public Fortepian(String manufacturer, LocalDate dOp){
        super(manufacturer, dOp);
    }

    public String sound(){
        return "Nacieszcie uszy dzwiekami istrumentu Edwarda!";
    }
}
//Jak zwykle coś z githubem mi się musi pierdolić xd