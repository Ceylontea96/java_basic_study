package day08.player;

public class Player {

    String name;
    int level;
    int hp;

    Player() {
        //this(), super()는 반드시 생성자의 첫라인에 기술
        this("이름없음", 1);
        System.out.println("1번 생성자 호출!");
    }

    Player(String Name) {
        this(Name, 1); //나의 다른 생성자를 연계호출하겠다.
        System.out.println("2번 생성자 호출!");

    }

    Player(String name, int level) {
        System.out.println("3번 생성자 호출!");
        this.name = name;
        this.level = level;
        this.hp = this.level * 50;
    }

    void attack(Player this, Player target) {
        System.out.println("============================");
        System.out.println(target);
        System.out.println(this.name + "가 " + target.name + "을 공격합니다.");
    }

    void info() {
        System.out.printf("이름 : %s, 레벨 : %d, 체력: %d\n", this.name, this.level, this.hp);
    }
}
