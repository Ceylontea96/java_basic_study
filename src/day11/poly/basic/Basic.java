package day11.poly.basic;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {

    A x1 = new A();
    B x2 = new B();
    C x3 = new C();

    //모든 자식 객체는 부모의 타입으로 변환가능
    A x4 = new B();
    A x5 = new C();

    A x6 = new D();
    Object o1 = x6;

    //상속관계가 없으면 타입변환 불가
//    B x7 = new E();


    public static void main(String[] args) {

        Basic b = new Basic();
        System.out.println(b.o1);
    }


}
