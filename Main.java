class ClasaDeBaza {
    int x;
    String z;

    ClasaDeBaza(int x) {
        this.x = x;
        this.metoda1();
        System.out.println("Constructorul clasei de baza cu un parametru");
    }


    ClasaDeBaza(String x) {
       // this.z = z;
        System.out.println("Constructorul clasei de baza cu un parametru de tip String");
    }

    ClasaDeBaza() {
        this(0);
        this.z= "abcd";
        System.out.println("Constructorul clasei de baza fara parametri");
    }

    void metoda1() {
        System.out.println("Metoda 1 din clasa de baza");
    }

    void metoda2() {
        System.out.println("Metoda 2 din clasa de baza");
    }
}

public class Main {
    public static void main(String[] args) {
        // a) Obiectul clasei de baza folosind constructorul clasei de baza
        ClasaDeBaza obiectA = new ClasaDeBaza(5);
        obiectA.metoda1(); // Apeleaza metoda din clasa de baza
        obiectA.metoda2(); // Apeleaza metoda din clasa de baza

    }
}