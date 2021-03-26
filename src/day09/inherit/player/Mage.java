package day09.inherit.player;

public class Mage extends Player{

    int mana;

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    @Override //오버라이딩 룰을 위반했는지 확인
    public void info() {
        super.info();
        System.out.println("# 마력: " +mana);
    }
    void meteor() {

    }
}
