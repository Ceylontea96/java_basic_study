package day11.poly.overloading;

public class Basic {

    // typeCheck(String)
    void typeCheck(String s) {
        System.out.println("문자열 1개가 들어옴!");
    }
    // typeCheck(String, String)
    void typeCheck(String s1, String s2) {
        System.out.println("문자열 2개가 들어옴!");
    }
    // typeCheck(int)
    void typeCheck(int i) {
        System.out.println("정수 1개가 들어옴!");
    }
    // typeCheck(String, int)
    void typeCheck(String s, int i) {
        System.out.println("문자열 1개, 정수 1개가 들어옴!");
    }
    // typeCheck(int, String)
    void typeCheck(int i, String s) {
        System.out.println("정수 1개, 문자열 1개가 들어옴!");
    }



    public static void main(String[] args) {

        Basic b = new Basic();
        b.typeCheck("dddd");
        b.typeCheck(10);
        b.typeCheck(10, "gggg");

        //오버로딩 예시
        System.out.println();
    }
}
