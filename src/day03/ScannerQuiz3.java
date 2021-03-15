package day03;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ScannerQuiz3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.close();


        Date now = new Date();
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);

        System.out.println("이름: " + name);
        System.out.println("출생년도: " + (year - age + 1) +"년생");

    }
}
