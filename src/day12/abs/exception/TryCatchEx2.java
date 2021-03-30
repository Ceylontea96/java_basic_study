package day12.abs.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc = null;

        try {
            System.out.print("정수1 : ");
            int n1 = sc.nextInt();

            System.out.print("정수2 : ");
            int n2 = sc.nextInt();

            int divResult = n1 / n2;
            System.out.println("divResult = " + divResult);
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력해주세요.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("\n알 수 없는 예외상황입니다. 곧 수정하겠습니다.");
        }

        System.out.println("프로그램 정상 종료!");
        sc.close();// sc가 null이라서 여기서 또 오류터짐
    }
}
