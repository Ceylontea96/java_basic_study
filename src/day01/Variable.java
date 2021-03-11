package day01;

public class Variable {

    public static void main(String[] args) {

        //main 이라는 함수 안에서 선언하는 변수들이기 때문에 모두 지역번수

        //변수를 선언하는 방법
        int number = 20;
        //선언 타입이 다르면 저장 불가
        number = 70;
        System.out.println("number = " + number);

        int tripleNumber = number * 3;
        System.out.println("tripleNumber = " + tripleNumber);

        //문자열을 저장하는 타입 String
        String name = "김철수";
        System.out.println("name = " + name);

        //변수의 범위: 변수는 선언된 블록을 벗어나면 메모리에서 제거된다.
        int n1 = 1, n2 = 2;

        if (true) {
            int n3 = n1 + n2;
//          int n3 = 10; 같은 이름의 변수는 다시 선언할 수 없음.
        }//end if
//        System.out.println(n3);
        int n3 = 100; //if가 종료되면서 변수n3가 사라졌으므로 다시n3를 선언할 수 있다.
        byte p = 127;
        System.out.println("p = " + p);

    }//end main
//    int n4 = n1 + n2;
}//end class
