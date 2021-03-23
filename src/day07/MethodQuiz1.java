package day07;

import java.util.Arrays;

public class MethodQuiz1 {

    static int calcDivisor(int n) {

        System.out.printf("$d의 약수: ", n);
        int[] divisor = {};
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.printf("d ", i);
                total += i;
            }
        }

        return total;
    }

    public static void main(String[] args) {

        System.out.println("10의 약수의 총합: " + calcDivisor(10));
        System.out.println("------------------------------------------");
        System.out.println("30의 약수의 총합: " + calcDivisor(30));
    }
}
