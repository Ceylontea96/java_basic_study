package day08.modi.member.pac2;

import day08.modi.member.pac1.D;

public class F {

    F() {
        D d = new D();

        d.f1 = 1;
//        d.f2 = 2; //default 같은 패키지가 아니라서 불가능
//        d.f3 = 3; //private

        d.m1();
//        d.m2(); //default
//        d.m3(); //private

    }
}
