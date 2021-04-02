package day15.generic;

public class Main {

    public static void main(String[] args) {
        
        Basket<Apple> ab = new Basket<Apple>();
        ab.setFruit(new Apple());

        Apple apple = ab.getFruit();
        System.out.println("apple = " + apple);

        System.out.println("=================================");

        Basket<Peach> pb = new Basket<>();
        pb.setFruit(new Peach());

        Peach peach = pb.getFruit();
        System.out.println("peach = " + peach);

        System.out.println("==============================");

        Basket basket = new Basket();

        basket.setFruit(new Apple());
        basket.setFruit(new Peach());

        System.out.println("==============================");

        //fruit 인터페이스를 만들어서 상속시키면 fruit에 속한 객체만 Basket에 담을 수 있음
        //섞어서 담고싶으면 인터페이스인 fruit으로 만들면 됨
        Basket<fruit> fruitBasket = new Basket<>();
        fruitBasket.setFruit(new Apple());
        fruitBasket.setFruit(new Peach());


    }
}
