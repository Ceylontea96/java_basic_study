package day02;

public class Casting2 {

    public static void main(String[] args) {

        char c = 'B';
        int i = 2;

        System.out.println(c + i);
        //타입이 맞아야 연산 수행이 가능하므로 char타입의 변수 c를 int타입으로 변환한다.

        char result = (char) (c + i);
        System.out.println("result = " + result); //char 범위로 감당가능하기때문에 연산가능
        
        char result2 = (char) (50000 + 60000);
        System.out.println("result2 = " + result2);

        //int보다 작은 (byte, short, char)의 연산은 결과가 자동으로 int로 변환됨
        byte b1 = 100;
        byte b2 = 110;
//        byte b3 = b1 + b2;
        System.out.println('A' + 'B'); //131

        int n1 = 27;
        int n2 = 5;

        double res = (double)n1 / n2;
        System.out.println("res = " + res);
        
        double n3 = 27.0;
        int n4 = 5;
        double res1 = n3 / n4;
        System.out.println("res1 = " + res1);

        System.out.println(10.0 / 8);
    }
}
