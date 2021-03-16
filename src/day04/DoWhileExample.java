package day04;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int total = 0;

        //while의 시작조건이 처음부터 false이므로 0회 반복됨.
        /*
        while(number != 0) {
            System.out.print("정수(0입력시 종료): ");
            number = sc.nextInt();
            total += number;
        }
        */

        do {
            System.out.print("정수(0입력시 종료): ");
            number = sc.nextInt();
            total += number;
        } while (number != 0);

        System.out.println("입력값 노적함: " + total);
        sc.close();


    }
}
