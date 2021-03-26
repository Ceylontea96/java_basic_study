package day10.final_;

public class Korean {

    String name; //이름
    //상수(constant) 표기 관례는 모두 대문자와 띄어쓰기는 언더바
    static final String NATION = "대한민국"; //국적
    final String ssn; //주민번호

    Korean(String name, String ssn) {
//        nation = "미국"; 국전은 final로 되어있기 때문에 변경 불가
        this.name = name;
        this.ssn = ssn;
    }


}
