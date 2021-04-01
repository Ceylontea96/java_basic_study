package day14.lang.wrapper;

public class Basic {

    public int x = 10; //기본값 0
    public Integer y = 20; //기본값 null

    public static void main(String[] args) {

        //Byte, Short, Integer, Long, Float, Double, Boolean, Character

        int a = 10;
        //래핑(wrapping) : boxing
        Integer i = new Integer(a);

        //auto boxing (String도 auto boxing)
        Integer j = a;
        int k = 100;

        Object[] oArr = {10, 3.3, "ddd", true, j, k};

        Basic b = new Basic();
        System.out.println(b.x + b.y);

        //문자열을 정수로 변환가능
        String s1 = "90";
        String s2 = "5.11";

        try {
            int n1 = Integer.parseInt(s1);
            double n2 = Double.parseDouble(s2);
            System.out.println("s1 + s2 = " + s1 + s2);
            System.out.println("n1 + n2 = " + n1 + n2);
        } catch (NumberFormatException e) {
            System.out.println("변환할 수 없는 문자입니다.");
        }
    }
}
