package day14.lang.string;

import java.util.*;

public class StrQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호: ");
        String pNum = sc.next();

        int yearNow = 2021;
        String year = pNum.substring(0, 2);
        String month = pNum.substring(2, 4);
        String day = pNum.substring(4, 6);
        String sex = pNum.substring(7, 8);
        String gender = null;
        int age = 0;
        if (sex.equals("1") || sex.equals("2")) {
            age = yearNow - Integer.parseInt("19" + year) + 1;
            if (sex.equals("1")) {
                gender = "남자";
            } else if (sex.equals("2")) {
                gender = "여자";
            }
        } else if (sex.equals("3") || sex.equals("4")) {
            age = yearNow - Integer.parseInt("20" + year) + 1;
            if (sex.equals("3")) {
                gender = "남자";
            } else if (sex.equals("4")) {
                gender = "여자";
            }
        }

        System.out.println("앞자리: " + pNum.substring(0, 6));
        System.out.println("뒷자리: " + pNum.substring(7));

        switch (Integer.parseInt(sex)) {
            case 1:
                System.out.printf("19%s년도 %s월 %s일생 %d세 %s", year, month, day, age, gender);
                break;
            case 2:
                System.out.printf("19%s년도 %s월 %s일생 %d세 %s", year, month, day, age, gender);
                break;
            case 3:
                System.out.printf("20%s년도 %s월 %s일생 %d세 %s", year, month, day, age, gender);
                break;
            case 4:
                System.out.printf("20%s년도 %s월 %s일생 %d세 %s", year, month, day, age, gender);
                break;
        }

    }


}
