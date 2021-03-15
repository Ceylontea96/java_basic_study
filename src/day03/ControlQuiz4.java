package day03;

import java.util.Scanner;

public class ControlQuiz4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ran = (int) (Math.random() * 8) + 2;

        System.out.print("무엇으로 구구단을 구현할까요?\n[1. for문, 2.while문]\n1 또는 2를 입력해주세요! :");
        int choice = sc.nextInt();
        sc.close();

        switch (choice) {
            case 1:
                System.out.println("랜덤 구구단 " + ran + "단");
                System.out.println("----------------------");

                for (int i = 1; i <= 9; i++) {
                    System.out.println(ran + " x " + i + " = " + (ran * i));
                }
                break;
            case 2:
                System.out.println("랜덤 구구단 " + ran + "단");
                System.out.println("----------------------");

                int i = 1;
                while(i <= 9) {
                    System.out.println(ran + " x " + i + " = " + (ran * i));
                    i++;
                }
        }


    }
}
