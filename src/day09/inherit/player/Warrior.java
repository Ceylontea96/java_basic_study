package day09.inherit.player;

//상위 클래스로부터 상속받은 클래스를 자식, 하위 클래스(sub class)라고 부릅니다.
//상속은 is-a 관계를 만족합니다.
public class Warrior extends Player{

    int rage;



    public Warrior(String nickName) {
        super(nickName);
        this.rage = 60;
    }

    @Override //오버라이딩 룰을 위반했는지 확인
    public void info() {
        super.info();
        System.out.println("# 분노: " +rage);
    }

    public void fireSlash(Player target) {

        System.out.printf("%s님이 %s님에게 FireSlash를 시전했습니다!\n", this.getNickName(), target.getNickName());
        if (target instanceof Warrior) {
            System.out.printf("%s(전사)님이 10의 피해를 입었습니다.\n", target.getNickName());
            target.hp -= 10;
            System.out.printf("%s님의 현재 체력: %d\n",target.getNickName(), target.hp);
        } else if(target instanceof Mage) {
            System.out.printf("%s(마법사)님이 20의 피해를 입었습니다.\n", target.getNickName());
            target.hp -= 20;
            System.out.printf("%s님의 현재 체력: %d\n",target.getNickName(), target.hp);
        } else if(target instanceof Hunter) {
            System.out.printf("%s(사냥꾼)님이 15의 피해를 입었습니다.\n", target.getNickName());
            target.hp -= 15;
            System.out.printf("%s님의 현재 체력: %d\n",target.getNickName(), target.hp);
        }
        System.out.println();

    }



}
