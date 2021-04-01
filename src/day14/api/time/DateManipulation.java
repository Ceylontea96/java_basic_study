package day14.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateManipulation {

    public static void main(String[] args) {

        LocalDate orderDate = LocalDate.now();
        LocalDate takeDate = orderDate.plusDays(3);

        System.out.println("주문 날짜: " + orderDate);
        System.out.println("수령 날짜: " + takeDate);


        LocalDateTime targetTime = LocalDateTime.now()
                .plusYears(1)
                .plusMonths(10)
                .plusDays(2)
                .plusHours(3)
                .minusMinutes(5);

        System.out.println("targetTime = " + targetTime);

        //축제 시작일, 종료일
        LocalDateTime startDate = LocalDateTime.of(2021, 3, 1, 00, 00, 00);
        LocalDateTime endDate = LocalDateTime.of(2021, 3, 31, 23, 59, 59);

        //현재 시간
        LocalDateTime now = LocalDateTime.now();

        if (now.isBefore(endDate) && now.isAfter(startDate)) {
            System.out.println("현재 진행중인 행사입니다.");
        } else {
            System.out.println("종료된 행사입니다.");
        }

        //날짜 계산(뺄셈 연산)
        long between = ChronoUnit.DAYS.between(startDate, now);
        System.out.println("행사 진행 일수: " + between);


    }
}
