package day08.modi.member.pac1;

public class D {

    public int f1;
    int f2; //default
    private int f3;

    public void m1() {}
    void m2() {} //default
    private void m3() {}

    public D() {//생성자도 접근제한 설정가능
        //같은 클래스 안에서는 제한자 의미가 없음
        f1 = 1; f2 = 2; f3 = 3;
        m1(); m2(); m3();


    }
}
