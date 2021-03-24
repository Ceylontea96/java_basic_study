package day08.modi.member.pac1;

public class E {

    E() {
        D d = new D();

        d.f1 = 1;
        d.f2 = 2;
//        d.f3 = 3; //private 같은 클래스에서만 사용가능. 같은 클래스가 아니면 같은 패키지라도 사용불가

        d.m1();
        d.m2();
//        d.m3(); //private

    }
}
