package day11.poly.car;

public class Main {

    public static void main(String[] args) {

        //다형성 특징
        //1. 객체의 교환성 증가
//        Car myCar = new Car();



        //2. 다른 타입간 배열 구성 가능(이종 모음 배열)
        Tucson t1 = new Tucson();
        Tucson t2 = new Tucson();
        Tucson t3 = new Tucson();
        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();
        Boxster b1 = new Boxster();
        Boxster b2 = new Boxster();
        Boxster b3 = new Boxster();

        Car[] cars = {t1, t2, t3, s1, s2, s3, b1, b2, b3};
        /*for (Car car : cars) {
            car.run();
        }*/

        Driver driver = new Driver();
        driver.drive(new Sonata());
        driver.drive(new Tucson());
        driver.drive(t2);

        System.out.println("========================");
//        Car myCar = driver.buyCar("소나타");
        Sonata myCar = (Sonata) driver.buyCar("소나타");
        driver.drive(myCar);

        //myCar의 주소값은 결국 Sonata.
        System.out.println(myCar);

        ((Sonata)myCar).joinMembership();

        Car[] cars2 = {myCar};//다시 업캐스팅. 업캐스팅은 대부분 자동동
        System.out.println("============================");
        CarShop shop = new CarShop();
        shop.sellCar(s2);
        shop.sellCar(b3);

        "".equals("");
    }




}
