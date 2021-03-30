package day13.exception;

import day08.modi.member.pac1.E;

import java.util.Scanner;

class Basic {

    int number;

    public Basic(int n) {
        try {
            this.number = aaa(n);
        } catch (Exception e) {
            System.out.println("n에는 0을 전달하면 안됩니다.");
        }
    }

    public int aaa(int n) throws ArithmeticException, NullPointerException {
        return bbb(n) / n;
    }
    public int bbb(int n) throws ArithmeticException {
        return ccc(n) / n;
    }
    public int ccc(int n) throws ArithmeticException {
        return 100 / n;
    }
}

public class ThrowsEx {

    public static void main(String[] args) {

        Basic basic = new Basic(0);
        System.out.println(basic.number);

        System.out.println("프로그램 종료");

        new Scanner(System.in).nextInt();
    }
}
