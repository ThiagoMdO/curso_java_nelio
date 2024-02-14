package secao11.aplication;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateProgram04 {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeeekLocalDate = d01.plusDays(7);


        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeeekLocalDate);

        LocalDateTime timeLocalDateTime = d02.minusHours(1);
        LocalDateTime minutesLocalDateTime = timeLocalDateTime.plusMinutes(30);
        LocalDateTime secondsLocalDateTime = minutesLocalDateTime.plusSeconds(20);


        System.out.println(timeLocalDateTime);
        System.out.println(minutesLocalDateTime);
        System.out.println(secondsLocalDateTime);

        System.out.println();

        Instant pastWeekInstant = d03.minus(d02.getDayOfMonth(), ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);

        Duration t1 = Duration.between(pastWeekInstant, nextWeekInstant);
        Duration t2 = Duration.between(d01.atTime(0,0), nextWeeekLocalDate.atTime(0,0));
        Duration t3 = Duration.between(d01.atStartOfDay(), nextWeeekLocalDate.atStartOfDay());
        Duration t4 = Duration.between(d03, pastWeekInstant);

        System.out.println("T1 dias = " + t1.toDays());
        System.out.println("T2 dias = " + t2.toDays());
        System.out.println("T3 dias = " + t3.toDays());
        System.out.println("T4 dias = " + t4.toDays());
    }
}
