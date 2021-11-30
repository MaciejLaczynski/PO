package pl.maciejjd.laczynski;

public class Test {

    public static void main(String[] args){

        Adres test1 = new Adres("Jana Pawła 2", "21",
                "37", "07-410", "Ostrołęka");
        Adres test2 = new Adres("Gorbatowa", "1",
                "6", "10-900", "Olsztyn");

        test1.show();
        test2.show();
        //////////////////////////
        Osoba Maciek = new Osoba("Zlomczynski", 1999);
        Student Krystian = new Student("Spirytus", 1999, "Informatyka");
        Nauczyciel Jakub = new Nauczyciel("Wojtczak", 1989, 21370);

        System.out.println(Maciek);
        System.out.println(Krystian);
        System.out.println(Jakub);
        System.out.println(Jakub.getSalary());
        //////////////////////////
        BetterRectangle rectObj = new BetterRectangle(0,0,5,6);
        System.out.println(rectObj.getPerimeter());
        System.out.println(rectObj.getArea());

    }
}
