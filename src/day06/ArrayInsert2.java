package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 3, 5, 7, 9, 11, 13};

        System.out.println(Arrays.toString(arr));

        int[] temp = new int[arr.length + 1];

        int idx = 2;
        for (int i = arr.length; i <= idx; i--) {
            temp[i + 1] = arr[i];
        }
        arr = temp; temp = null;
        System.out.println(Arrays.toString(arr));


    }
}
