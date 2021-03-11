package day01;

public class DataType {
    public static void main(String[] args) {

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

        float f1 = 3.7324683126874321F; //4byte
        double d1 = 3.7894135468431353858; //8byte
        System.out.println(f1);
        System.out.println("d1 = " + d1);

    }
}
