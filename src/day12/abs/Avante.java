package day12.abs;

public class Avante extends Car{

    public Avante(String model, int price) {
        super(model, price);
        System.out.println("Avante 생성자 호출!");
    }

    @Override
    public void start() {
        System.out.println("아반떼가 주행합니다.");
    }
}
