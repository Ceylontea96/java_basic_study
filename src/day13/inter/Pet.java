package day13.inter;

public interface Pet {

    //인터페이스는 모든 필드를 상수로 처리
    String NAME = "애완동물";

    //인터페이스는 모든 메서드를 추상화한다.
    public void play();
}
