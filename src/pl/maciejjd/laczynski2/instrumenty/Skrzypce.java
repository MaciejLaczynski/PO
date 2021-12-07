package pl.maciejjd.laczynski2.instrumenty;
import java.time.LocalDate;

public class Skrzypce extends Instrument{
    public Skrzypce(String manufacturer, LocalDate dOp){
        super(manufacturer, dOp);
    }

    public String sound(){
        return "*Nostalgicne sksypecki grajo hej!*";
    }
}
//Jak zwykle coś z githubem mi się musi pierdolić xd