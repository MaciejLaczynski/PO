package pl.maciejjd.laczynski2.instrumenty;
import java.time.LocalDate;

public class Flet extends Instrument{
    public Flet(String manufacturer, LocalDate dOp){
        super(manufacturer, dOp);
    }

    public String sound(){
        return "*EARRAPE FLUTE SOUND PLAyING IN THE DISTANCE*";
    }
}
//Jak zwykle coś z githubem mi się musi pierdolić xd