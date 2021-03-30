package day12.abs.quiz;

public class Main {
    public static void main(String[] args) {

    SnowTire snowTire = new SnowTire();
    Tire tire = snowTire;

    snowTire.roll();
    tire.roll();
    }

}
