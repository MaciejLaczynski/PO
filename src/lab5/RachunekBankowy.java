package lab5;

public class RachunekBankowy {

    private static double rocznaStopaProcentowa;
    private double saldo;

    public static void main(String[] args){
        RachunekBankowy test = new RachunekBankowy();
        setRocznaStopaProcentowa(0.10);
        test.Account(2000);
        System.out.println(test.getSaldo());
        test.obliczMiesieczneOdsetki();
        System.out.println(test.getSaldo());
    }

    public void Account(double balance){
        this.saldo = balance;
    }
    public void obliczMiesieczneOdsetki(){
        this.saldo = this.saldo + (this.saldo * rocznaStopaProcentowa) / 12;
    }
    public static void setRocznaStopaProcentowa(double level){
        rocznaStopaProcentowa = level;
    }
    public double getSaldo() {
        return this.saldo;
    }
}
