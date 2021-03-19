package day06;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int[][] test = {{}};


//        int[][] test1 = new int[][];

        for (int[] arr : test) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
