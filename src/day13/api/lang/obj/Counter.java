package day13.api.lang.obj;

public class Counter {

    private int no;

    //생성자
    public Counter(int no) {
        this.no = no;
    }

    //소멸자 : 객체가 메모리에서 제거되는 시점에 자동호출됨
    @Override
    protected void finalize() throws Throwable {
        System.out.println(no + "번 객체 소멸됨");
    }

    public static void main(String[] args) {

        System.out.println("소멸자 테스트!");
        Counter c = null;
        for (int i = 0; i < 50; i++) {
            c = new Counter(i);
            c = null;
            System.gc(); //가비지 컬렉터

        }
            System.out.println("소멸종료");
    }
}
