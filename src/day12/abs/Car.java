package day12.abs;

//추상 클래스
public abstract class Car {

    private String model;
    private int price;

    public Car(String model, int price) {
        System.out.println("Car 생성자 호출!");
        this.model = model;
        this.price = price;
    }

    //추상 메서드
    public abstract void start(); //주행 기능 명세

    // static 메서드는 공통기능
    public static void staticMet() {

    }

    public void instanceMet() {

    }

    public final void finalMet() {

    }
}
