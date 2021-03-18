package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("삭제 전: " + Arrays.toString(arr));
while(true) {
    System.out.println("삭제하고싶은 멤버를 입력하세요.");
    System.out.print("> ");
    String targetMember = sc.next();
    int idx;
    for (idx = 0; idx < arr.length; idx++) {
        if (targetMember.equals(arr[idx])) {
            break;
        }
    }

    if (idx < arr.length) {
        //뒷자리 숫자들을 앞자리에 복사해서 목표로 한 숫자를 없앤다.
        for (int i = idx; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        //[1, 3, 7, 9, 11, 13, 13]

        //마지막 숫자를 삭제.
        String[] temp = new String[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        temp = null;
        //[1, 3, 7, 9, 11, 13]

        System.out.println("삭제 후: " + Arrays.toString(arr));
        break;
    } else {
        System.out.println("해당 멤버는 목록에 없습니다.");
    }
}
    }
}
