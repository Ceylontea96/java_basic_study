package day10.final_;

public class Main {

    public static void main(String[] args) {

        Korean kim = new Korean("김철수", "920101-2122331");
        kim.name = "김말종";
//        kim.nation = "미국"; final이라 변경 불가
//        kim.ssn = "123123213"; 생성될 때 final로 고정되어 변경 불가

        Korean park = new Korean("박영희", "020202-1233123");

    }
}
