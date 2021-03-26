package day10.protect.pac2;

import day10.protect.pac1.A;

public class D extends A {


    protected D(String b) {
//        super(10); //default
        super("안녕"); //protected

//        this.f1 = 10;//default는 다른패키지라서 가져올 수 없음
        this.f2 = 11;

//        this.m1();
        this.m2();
    }
}
