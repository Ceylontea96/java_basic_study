package day03;

public class StdOutPut {

    public static void main(String[] args) {


        String dog = "멍멍이";
        String cat = "야옹이";

        System.out.println(dog);
        System.out.println(cat);
        
        String filePath = "D:\\temp\\new.jpg";
        // 백슬래쉬(\)는 탈출문자이기 때문에 이를 표현하기 위해서는 \\로 사용해야한다.
        System.out.println(filePath);

        String msg = "he said \"warning!\" to me";
        System.out.println(msg);

        int month = 4;
        int day = 5;
        String anni = "식목일";

        System.out.println(month +"월 " + day +"일은 " + anni +"입니다.");
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);

        int c = 5;
        boolean d = c == 6;
        System.out.printf("%s입니다.\n", d);

        //%f는 기본적으로 소수점 이하 6자리까지 강제로 표현합니다.
        double saleRate = 0.2593657832187645;
        System.out.printf("할인율은 %.1f%%입니다.\n", saleRate * 100); //특수기호 %를 표현하려면 %%를 사용해야한다.
    }
}
