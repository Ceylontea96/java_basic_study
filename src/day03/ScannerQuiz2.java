package day03;

import java.util.Scanner;

public class ScannerQuiz2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("얼마 있어요??");
        int money = sc.nextInt();

        /* 3항
        String food = money >= 5000 ? "김치찌개" : money >= 2500 ? "라면" : "굶어!";
         */
        /*String food = "미정";
        if (money >= 5000) {
            food = "김치찌개";
        } else if (money >= 2500) {
            food = "라면";
        } else {
            food = "굶어!";
        }

        System.out.printf("선택된 음식: %s", food);
        */


    }
}
