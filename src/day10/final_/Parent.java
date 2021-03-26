package day10.final_;

class Child extends Parent{
    Parent p = new Parent();

    Child() {
        String s;
        p.m1(); p.m2();
    }

    @Override
    void m2() {
        super.m2();
    }

//    @Override
//    void m1() {
//        super.m2();
//    }

}

public class Parent {

    final void m1() {}
    void m2() {}
}
