package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] foods = {"치킨", "피자", "삼겹살", "족발"};

        System.out.print("찾을 음식: ");
        String targetFood = sc.next();

        //순차 탐색 알고리즘
        boolean containFood = false;

        int i;
        for (i = 0; i < foods.length; i++) {
            if (targetFood.equals(foods[i])) {
                containFood = true;
                //찾았다면 나머지 반복은 의미가 없으므로 반복문 탈출
                break;
            }
        }
        if (containFood) {
            System.out.println("해당 음식은 목록에 있습니다.");
            System.out.println("해당 음식의 인덱스: " + i);

            //우선 타겟 탐색 성공 후 변경
            System.out.print("새로운 음식명: ");
            foods[i] = sc.next();

            System.out.println("수정 후 음식: " + Arrays.toString(foods));
        } else {
            System.out.println("해당 음식은 목록에 없습니다");
        }
    }
}