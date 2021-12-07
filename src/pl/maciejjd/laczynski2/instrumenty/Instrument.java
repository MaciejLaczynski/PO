package pl.maciejjd.laczynski2.instrumenty;

import java.time.LocalDate;

public abstract class Instrument {

    private String producent;
    private LocalDate dataProdukcji;
    private Object obj;

    public Instrument(String manufacturer, LocalDate dOp){
        this.producent = manufacturer;
        this.dataProdukcji = dOp;
    }

    public abstract String sound();

    public String getProducent() {
        return this.producent;
    }

    public LocalDate getDataProdukcji(){
        return this.dataProdukcji;
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" Wyprodukowano przez: " + this.producent
                + " data: "+this.dataProdukcji;
    }
}