package day08.player;

public class Main {

    public static void main(String[] args) {

        Player kim = new Player("김철수");
        System.out.println("===============================");
        Player park = new Player("박영희", 20);


//        System.out.println("kim의 주소값: " + kim);
//        System.out.println("park의 주소값: " + park);

//        kim.attack(park);
//
//        new Player("둘리").attack(new Player("도우너"));

        kim.info();
        park.info();
    }
}
