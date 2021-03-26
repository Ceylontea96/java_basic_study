package day10.static_;

public class Calculator {

    String madeBy; //제조사
    String color; //색상
    private static double pi; //원주율율

    //정적 초기화자(static initialize)
    //정적 데이터의 초기값을 세팅.
    static {
        System.out.println("정적 데이터 생성!");
        pi = 3.14;
    }


    void paint(String color) {
        this.color = color;
    }

    public static double getPi() {
        return pi;
    }

    //원의 넓이를 구해주는 기능
    static double calcAreaCircle(int r) {
        return pi * r * r; //파이 r제곱
    }
}
