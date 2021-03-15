package day03;

import java.util.Scanner;

public class ControlQuiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int integer = sc.nextInt();
        sc.close();

        if (integer == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else if (integer % 7 == 0) {
            System.out.println("입력하신 숫자는 7의 배수입니다.");
        } else {
            System.out.println("입력하신 숫자는 7의 배수가 아닙니다.");
        }
    }
}
