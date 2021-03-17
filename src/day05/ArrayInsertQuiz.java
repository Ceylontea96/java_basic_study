package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] foods = {};

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
        while (true) {
            System.out.print(">");
            String add = sc.next();

            if (add.equals("그만")) {
                break;
            } else {
                String[] temp = new String[foods.length + 1];
                for (int i = 0; i < foods.length; i++) {
                    temp[i] = foods[i];
                }
                temp[temp.length - 1] = add;

                foods = temp;
                temp = null;
            }
        }
        System.out.println("입력 종료!");
        System.out.println("내가 먹고싶은 음식들" + Arrays.toString(foods));
        if (foods.length > 4) {
            System.out.println("혹시 돼지세요?");
        }
    }
}
