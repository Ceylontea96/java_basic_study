package day11.poly.car;

public class Driver {

    void drive(Car c) { //xx.drive(new Sonata())
        System.out.println("운전을 시작합니다");
        c.run();
    }

    Car buyCar(String carName) {

        if (carName.equals("투싼")) {
            System.out.println("투싼을 구매합니다.");
            return new Tucson();
        } else if (carName.equals("소나타")) {
            System.out.println("소나타를 구매합니다.");
            return new Sonata();
        } else if (carName.equals("박스터")) {
            System.out.println("박스터를 구매합니다.");
            return new Boxster();
        } else {
            System.out.println("해당 차량은 없습니다.");
            return null;
        }
    }
    /*void drive(Sonata s) {
        System.out.println("운전을 시작합니다.");
        s.run();
    }
    void drive(Tucson t) {
        System.out.println("운전을 시작합니다.");
        t.run();
    }
    void drive(Boxster b) {
        System.out.println("운전을 시작합니다.");
        b.run();
    }*/
}
