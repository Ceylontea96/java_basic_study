package day07;

import java.util.Arrays;

public class MethodBasic {

    static int calcuateTotal(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
    
    static String selectRandomFood() {
        String[] foods = {"김밥", "볶음밥", "오렌지", "닭강정", "귤"};
        return foods[(int)(Math.random() * foods.length)];
    }

    static int calcNumbersTotal(int... number) {
        int total = 0;
        for (int n : number) {
            total += n;
        }
        return total;
    }
        
    public static void main(String[] args) {

        ;
        // 1 ~ n까지의 총합을 구해주는 로직
        int result = calcuateTotal(10);
        System.out.println("result = " + result);

        int result2 = calcuateTotal(100);
        System.out.println("result2 = " + result2);

        System.out.println("food = " + selectRandomFood());

        int total = calcNumbersTotal(new int[] {10, 20, 30, 40});
        System.out.println("total = " + total);

        int total2 = calcNumbersTotal(10, 20, 40, 50, 90);
        System.out.println("total2 = " + total2);

        System.out.println("---------------------------------------------");

        sayHello("김수찬");
        
        int[] results = operateAll(20, 5);
        System.out.println(Arrays.toString(results));
        
    }//end main
    //사용자의 이름을 전달하면 인사를 출력해주는 함수
    static void sayHello(String userName) {
        System.out.println(userName +"님 안녕하세요!");
    }
    
    //여러값을 리턴하고 싶은 경우
    static int[] operateAll(int n1, int n2) {
        return new int[] {n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }
    
}//end class
