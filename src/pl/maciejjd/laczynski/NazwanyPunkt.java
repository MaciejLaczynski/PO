package pl.maciejjd.laczynski;

public class NazwanyPunkt extends punkt {

    private String name;

    NazwanyPunkt(int var1, int var2, String var3){
        super(var1, var2);
        this.name = var3;
    }

    public void show(){
        System.out.println(this.name + ":<" + this.x() + ", " + this.y() + ">");
    }

}

