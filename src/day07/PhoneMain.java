package day07;

//실행용 클래스는 main메서드를 포함합니다.
public class PhoneMain {

    public static void main(String[] args) {

        //객체의 생성
        String name = "테스트";
        Phone galaxyS20;
        galaxyS20 = new Phone();
//        Phone iPhoneX = new Phone();

        //객체의 속성과 기능을 참조 : 참조연산자 . 을 사용
//        galaxyS20.powerOn();
        galaxyS20.showSpec();

        System.out.println("==========================");

        Phone iPhoneX = new Phone("아이폰X");

        Phone galaxyS21 = new Phone("갤럭시S21");

        iPhoneX.showSpec();
        galaxyS21.showSpec();
//        galaxyS20.model = "갤럭시S20";
//        galaxyS20.color = "펄 블루";
//        galaxyS20.price = 1000000;
//
//        iPhoneX.model = "아이폰X";
//        iPhoneX.color = "스노우 화이트";
//        iPhoneX.price = 1200000;
//
//        galaxyS20.powerOn();
//        galaxyS20.showSpec();
//
//        System.out.println();
//        iPhoneX.powerOn();
//        iPhoneX.showSpec();


        System.out.println("==============================================");

//        galaxyS20.powerOff();
//        iPhoneX.powerOff();

        galaxyS20.sendMessage(iPhoneX, "야 밥 먹었냐?");
        galaxyS20.sendMessage(iPhoneX, "야 밥 먹었냐고");

        iPhoneX.checkMessages();

        iPhoneX.sendMessage(galaxyS20, "어 먹었다.");

        galaxyS20.checkMessages();

        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ");
        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ");
        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ");
        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ");
        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ");
        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ");
        galaxyS20.sendMessage(iPhoneX, "에베베베베베ㅔ");

        iPhoneX.checkMessages();

    }
}
