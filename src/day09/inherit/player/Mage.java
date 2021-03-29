package day09.inherit.player;

public class Mage extends Player {

    int mana;

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    @Override //오버라이딩 룰을 위반했는지 확인
    public void info() {
        super.info();
        System.out.println("# 마력: " + mana);
    }

    public void meteor(Player... targets) {

        if (targets.length > 0) {
            System.out.println("# " + this.getNickName() + "님이 메테오를 시전!!");
            System.out.println("=======================================");

            for (int i = 0; i < targets.length; i++) {
                if (targets[i] == this) continue; //타겟이 본인이면 제외

                int damage = (int) (Math.random() * 6) + 10; //10 ~ 15의 랜덤 데미지
                targets[i].hp -= damage;
                System.out.println(targets[i].getNickName() + "님이 " + damage + "의 피해를 입었습니다." +
                        " (남은 체력: " + targets[i].hp + ")");

            }
        } else {
            System.out.println("타겟된 플레이어가 없습니다.");
        }
        System.out.println();
    }


}
