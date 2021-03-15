package day03;

import java.util.Scanner;

public class ScannerQuiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**** 상품 재고 총액 구하기 ****");
        System.out.printf("- 상품의 가격: ");
        int value = sc.nextInt();
        System.out.printf("- 상품의 개수: ");
        int amount = sc.nextInt();
        System.out.println("---------------------------------");
        System.out.printf("- 상품 재고 총액: %d원", value * amount);
    }
}
