package day03;

public class LogicalOperator {

    public static void main(String[] args) {

        int x = 10, y = 20;

        boolean result1 = (x != 10) & (++y == 21);
        boolean result2 = (x == 10) | (++y == 21);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a = 10, b = 20;

        boolean result3 = (a != 10) && (++b == 21);
        boolean result4 = (a == 10) || (++b == 21);
        //&&는 a != 10이 false이기 때문에 뒷부분을 연산하지 않고 false값을 반환한다.
        //||는 a == 10이 true이기 때문에 뒷부분을 연산하지 않고 true값을 반환한다.
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("a = " + a);
        System.out.println("b = " + b); //위와 같은 이유로 후항에 존재하는 ++b의 연산이 안되었기 때문에 b = 20으로 변함이 없다.

        


        
    }
}
