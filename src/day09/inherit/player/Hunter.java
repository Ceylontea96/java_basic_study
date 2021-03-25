package day09.inherit.player;

public class Hunter extends Player{

    String beast;

    public Hunter(String nickName) {
        super(nickName);
        this.beast = "멍멍이";
    }

    @Override //오버라이딩 룰을 위반했는지 확인
    void info() {
        super.info();
        System.out.println("# 동물: " +beast);
    }

    void frozenShot() {

    }

}
