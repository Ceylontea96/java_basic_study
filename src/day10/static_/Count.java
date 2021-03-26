package day10.static_;

public class Count {

    public int x;//인스턴스 필드(instance field)
    public static int y;//스태틱 필드(static field)

    //인스턴스 메서드
    public void method1() {
        int z = this.x + y; //x는 인스턴스 필드이기 때문의 누구의 x인지 확인하기 위해 this를 붙여야 함
        System.out.println("z(instance) = " + z);
    }

    //스태틱 메서드
    public static void method2(Count c) {
        //static 블록 내에서는 인스턴스 멤버를 직접
        //사용할 수 없습니다.
        int z = c.x + y;
        c.method1();
//        int z = x + y; 누구의 x인지 알 수 없음
//        method1(); 스태틱 메서드라서 누구의 method1인지 알 수 없음
    }

}
