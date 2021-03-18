package day06;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        //2차원 배열은 각각의 인덱스에 1차원 배열의 '주소'를 담고있는 1차원 배열이다.
        //배열을 값 목록으로 생성
        int[][] arr2d = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("arr2d.length = " + arr2d.length);
        
        System.out.println("arr2d의 0번 인덱스: " + Arrays.toString(arr2d[0]));
        
        int[] temp = arr2d[2];
        System.out.println("Arrays.toString(temp) = " + Arrays.toString(temp));
        
        int a = arr2d[2][0];
        System.out.println("a = " + a);
        
        int number = arr2d[2][2];
        System.out.println("number = " + number);
        System.out.println("============================================");

        for (int[] arr : arr2d) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
            System.out.println("============================");

            arr2d[2][1] = 0;

            arr2d[2] = new int[] {1, 2, 3,};

            System.out.println(Arrays.toString(arr2d[2]));

            System.out.println(arr2d[1]); //주소가 담겨있음

            //배열 생성문으로 배열 생성
            int[][] testArr = new int[3][2];

            //3차원 배열
        int[][][] arr3d = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                },
                {
                        {13, 14, 15},
                        {16, 17, 18}
                }
        };
        System.out.println("==========================");
        System.out.println(arr3d[2][0][2]);
    }
}
