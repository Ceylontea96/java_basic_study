package day15.generic;

//제네릭 타입 F : 관례상 타입이름은 한글자를 씀
public class Basket<F extends fruit> {

    //과일 필드
    private F fruit;



    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
}
