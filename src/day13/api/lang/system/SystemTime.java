package day13.api.lang.system;

public class SystemTime {

    public static void main(String[] args) {

        long a = System.currentTimeMillis();
        System.out.println("a = " + a);

        //알고리즘 시간복잡도 계산
        long start = System.currentTimeMillis();
        int total = 0;
        for (int i = 0; i < 1000000000; i++) {
            total += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("실행시간: " + (end - start) + "ms");

    }
}
