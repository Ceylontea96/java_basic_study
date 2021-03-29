package day11.poly.casting;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2();
        System.out.println("===========================");
        Parent child = new Child();
        child.m1();
        child.m2();
        ((Child) child).m3();
        //연산자 중에 . 연산자가 괄호 연산자보다 우선시되기 때문에 . 연산이 되기전에
        //괄호로 묶어서 다운캐스팅을 해준다.

        System.out.println("==============================");

        //다운캐스팅은 한 번 업캐스팅이 된 객체만 사용가능함.
//        Child c = (Child) new Parent(); 오류남.
        Parent p = new Parent();
        if (p instanceof Child){//바로 변환하지말고 확인과정을 거치면 안전하게 코딩가능
            Child c = (Child) p;
        } else {
            System.out.println("변환을 수행할 수 없습니다.");
        }

    }
}
