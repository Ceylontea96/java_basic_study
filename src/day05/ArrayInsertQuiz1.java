package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertQuiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] foodsMor = {};
        String[] foodsLun = {};
        String[] foodsDin = {};

        System.out.println("# 금일 [아침, 점심, 저녁] 식단을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <종료>라고 입력하세요.");
            int start = 0;
        while (true) {
            if (start == 0) {
            System.out.println("# [아침, 점심, 저녁] 식단 중 입력할 것을 선택하세요.");
            }
            start = 1;
            System.out.print(">");
            String time = sc.next();
            if (time.equals("종료")) {
                break;
            }
            switch (time) {
                case "아침":
                    System.out.println("# 금일 [" + time + "] 식단을 입력해주세요.");
                    System.out.println("# 입력을 중지하려면 <종료>라고 입력하세요.");
                    while (true) {
                        System.out.print(">>");
                        String foodsM = sc.next();

                        if (foodsM.equals("종료")) {
                            break;
                        } else {
                            String[] temp = new String[foodsMor.length + 1];
                            for (int i = 0; i < foodsMor.length; i++) {
                                temp[i] = foodsMor[i];
                            }
                            temp[temp.length - 1] = foodsM;

                            foodsMor = temp;
                            temp = null;
                        }
                    }
                    System.out.println("# [" + time + "] 식단 입력종료!");
                    System.out.println("# 저장된 " + time + " 식단" + Arrays.toString(foodsMor));
                    start = 0;
                    break;
                case "점심":
                    System.out.println("# 금일 [" + time + "] 식단을 입력해주세요.");
                    System.out.println("# 입력을 중지하려면 <종료>라고 입력하세요.");
                    while (true) {
                        System.out.print(">>");
                        String foodsL = sc.next();

                        if (foodsL.equals("종료")) {
                            break;
                        } else {
                            String[] temp = new String[foodsLun.length + 1];
                            for (int i = 0; i < foodsLun.length; i++) {
                                temp[i] = foodsLun[i];
                            }
                            temp[temp.length - 1] = foodsL;

                            foodsLun = temp;
                            temp = null;
                        }
                    }
                    System.out.println("# [" + time + "] 식단 입력종료!");
                    System.out.println("# 저장된 " + time + " 식단" + Arrays.toString(foodsLun));
                    start = 0;
                    break;
                case "저녁":
                    System.out.println("# 금일 [" + time + "] 식단을 입력해주세요.");
                    System.out.println("# 입력을 중지하려면 <종료>라고 입력하세요.");
                    while (true) {
                        System.out.print(">>");
                        String foodsD = sc.next();

                        if (foodsD.equals("종료")) {
                            break;
                        } else {
                            String[] temp = new String[foodsDin.length + 1];
                            for (int i = 0; i < foodsDin.length; i++) {
                                temp[i] = foodsDin[i];
                            }
                            temp[temp.length - 1] = foodsD;

                            foodsDin = temp;
                            temp = null;
                        }
                    }
                    System.out.println("# [" + time + "] 식단 입력종료!");
                    System.out.println("# 저장된 " + time + " 식단" + Arrays.toString(foodsDin));
                    start = 0;
                    break;
                default:
                    System.out.println("# [아침, 점심, 저녁] 중에서 하나를 입력해주세요.");
            }


        }
        //while 종료 후 이곳에서 출력
        System.out.println("저장된 금일 식단");
        System.out.println("아침: " + Arrays.toString(foodsMor));
        System.out.println("점심: " + Arrays.toString(foodsLun));
        System.out.println("저녁: " + Arrays.toString(foodsDin));


    }
}
