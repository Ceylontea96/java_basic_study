package day04;

import java.util.Scanner;

public class forQuiz3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                int answer = 4*x + 5*y;
                if (answer == 60){
                    System.out.printf("( %d, %d )\n", x, y);
                }
            }
        }
    }
}
