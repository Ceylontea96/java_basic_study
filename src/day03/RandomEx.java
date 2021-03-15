package day03;

public class RandomEx {

    public static void main(String[] args) {

        double rn = Math.random();
        System.out.println("랜덤값: " +rn);
        
        //랜덤 정수 생성방법
        /*
            # 1 ~ 10 사이의 랜덤 정수값 생성
            
            Math.random()                   -> 0.0 <= ~ < 1.0
            Math.random() * 10              -> 0.0 <= ~ < 10.0
            (int) (Math.random() * 10)      ->  0  <= ~ < 10
            (int) (Math.random() * 10) + 1  ->  1  <= ~ < 11

            # 공식    x이상 y이하의 랜덤 정수

            (int) (Math.random() * (y - x + 1)) + x
         */
        int ri = (int) (Math.random() *10) +1;
        System.out.println("ri = " + ri);
    }
}
