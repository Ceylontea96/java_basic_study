package day06;

import java.util.Arrays;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;

//        String[][] books = new String[1000][6];
        String[][] books = {
                {"A000", "꼭두각시 살인사건", "다니엘 콜", "북플라자", "14000"},
                {"B100", "질서 너머", "조던 피터슨", "웅진지식하우스", "16000"},
                {"C200", "코스모스", "칼 세이건", "사이언스북스", "17000"},
                {"D300", "정보처리기사 실기", "정보처리기술사 연구회", "건기원", "30000"}
        };
        for (String[] arr : books) {
            for (String n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }


        String[] sample = {"원", "두울", "세글자", "네에글자", "다섯글자5"};

        System.out.println(sample);

    }
}
