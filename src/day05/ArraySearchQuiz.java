package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] members = {"영웅재중", "최강창민", "시야준수", "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(members));
        System.out.println("- 변경 종료 시 <그만>을 입력하세요.");
        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");
            String targetMember = sc.next();
            if (targetMember.equals("그만")) {
                break;
            }

            int idx;
            for (idx = 0; idx < members.length; idx++) {
                if (targetMember.equals(members[idx])) {
                    break;
                }
            }
            if (idx < members.length) {
                System.out.println(targetMember+"의 별명을 변경합니다.");
                System.out.print("> ");
                members[idx] = sc.next();
                System.out.println("변경 완료!");
                System.out.println("* 변경 후 정보: " +Arrays.toString(members));
            } else {
                System.out.println(targetMember +"은(는) 없는 이름입니다.");
            }
        }


    }
}
