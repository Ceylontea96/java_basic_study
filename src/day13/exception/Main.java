package day13.exception;

public class Main {

    public static void main(String[] args) {

        String[] pets = {"비둘기", "소라게", "거북이"};

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(pets[i] + "키울래요~~");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("애완동물 데이터가 없습니다.");
            } finally {
                //메모리 해제 코드 (DB, Network, File)
                System.out.println("애완동물을 사랑합시다!");
            }
        }
        System.out.println("프로그램 정상 종료!");
    }
}
