package pl.maciejjd.laczynski;

public class Adres {

    private String ulica;
    private String numer_domu;
    private String numer_mieszkania="";
    private String kod_pocztowy;
    private String miasto;

    public Adres(String ulica, String numer_domu, String kod_pocztowy,
                 String miasto){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.kod_pocztowy = kod_pocztowy;
        this.miasto = miasto;
    }

    public Adres(String ulica, String numer_domu, String numer_mieszkania,
                 String kod_pocztowy, String miasto){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.kod_pocztowy = kod_pocztowy;
        this.miasto = miasto;
    }

    public void show(){
        System.out.print(this.ulica + " " + this.numer_domu);
        if(!this.numer_mieszkania.equals(""))
            System.out.print("/" + this.numer_mieszkania);
        System.out.println(" " + this.miasto + " " + this.kod_pocztowy);
    }

    public boolean before(Adres codeh){
        int[] arr = {0,1,3,4,5};
        StringBuilder first = new StringBuilder();
        StringBuilder code = new StringBuilder();
        for(int i : arr){
            first.append(codeh.kod_pocztowy.charAt(i));
            code.append(this.kod_pocztowy.charAt(i));
        }
        int a = Integer.parseInt(first.toString());
        int b = Integer.parseInt(code.toString());
        return a<b;
    }
}

