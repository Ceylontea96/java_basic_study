package day14.api.time;

import java.time.*;

public class Basic {

    public static void main(String[] args) {

        //날짜 정보 제어
        LocalDate currentDate = LocalDate.now();
        System.out.println("현재 날짜: " + currentDate);

        //임의의 날짜 생성
        LocalDate targetDate = LocalDate.of(2022, 5, 21);
        System.out.println("생성 날짜: " +targetDate);

        //시간 정보 제어
        LocalTime timeNow = LocalTime.now();
        System.out.println("현재 시간: " + timeNow);

        //임의의 시간 생성
        LocalTime targetTime = LocalTime.of(20, 00, 03);
        System.out.println("생성 시간: " + targetTime);

        //날짜와 시간 정보 제어
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("현재 날짜와 시간: " +dateTimeNow);
        
        //각 날짜와 시간정보 추출
        int year = dateTimeNow.getDayOfYear();
        System.out.println("year = " + year);

        int dayOfMonth = dateTimeNow.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);
        int realMonth = dateTimeNow.getMonthValue();
        System.out.println("realMonth = " + realMonth);

        DayOfWeek dayOfWeek = dateTimeNow.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);

        Month month1 = dateTimeNow.getMonth();
        System.out.println("month1 = " + month1);
    }

}
