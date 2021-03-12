package day01;

public class DataType {
    public static void main(String[] args) {

        //정수형
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L; //접미사 L을 붙여주면 리터럴이 int 에서 long 으로 변환된다.
        System.out.println("d = " + d);

        int i;
        double n = 0.0;
        for (i = 0; i < 100; i++) {
            n += 0.1;
        }
        System.out.println("n = " + n);

        //실수형
        float f1 = 3.7324683126874321F; //4byte
        double d1 = 3.7894135468431353858; //8byte
        System.out.println(f1);
        System.out.println("d1 = " + d1);

        //논리형
        //jsp와 다르게 true와 false만 논리로 인식
        boolean tr = true;
        boolean fa = false;
//        boolean b3 = 0;
//        boolean b4 = null;
//        boolean b5 = "true";
//        boolean b6 = True;

        //문자형
        //char타입은 문자 1개를 저장할 수 있는 타입. 홑따옴표로 저장.
        char c1 = 'A';
        //String타입은 문자열을 저장할 수 있는 타입. 겹따옴표로 저장.
        String s1 = "ABCdef";
        String s2 = "A";

        System.out.println("100" + "200"); //100200
        System.out.println(100 + "200"); //100200
//        System.out.println("200" - 100); 숫자와 문자열의 '덧셈'만 자동변환 가능



    }
}
