package day09.encap;

public class Car {

    public void dirve() {
        //1. 시동 켜야함
        powerOn();
        //2. 기어를 D로 바꿔야함
        changeGear("D");
        //3. 악셀을 밟는다.
        accel();
    }

    private void powerOn() {}
    private void changeGear(String gear) {}
    private void accel() {}
}
