package day08.modi.cls.pac1;

import day08.modi.cls.pac2.C;

//접근제한자 자리에 아무것도 쓰지 않으면 default제한이 걸립니다.
//클래스에는 default, public 제한만 사용 가능합니다.(private 사용 불가)
class A {

    public int f1;
    public int f2;

    public void m1() {
        B b = new B(); //B: public제한이라 사용하는데 문제없음
        C c = new C(); //C: public이라 사용 가능하지만 import를 해줘야함
    }
    public void m2() {}

}
