package secao11.aplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataProgram {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d01Time = LocalDateTime.now();

        DateTimeFormatter ft01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter ft02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Instant instant = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-02-20");
        LocalDateTime d05 = LocalDateTime.parse("2024-02-14T12:10");
        Instant d06 = Instant.parse("2024-02-14T01:05:25Z");
        Instant d07 = Instant.parse("2024-02-14T01:05:25-03:00");

        LocalDate d08 = LocalDate.parse("22/07/2019", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("22/07/2020 01:30:02", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        LocalDate d10 = LocalDate.of(2024, 04, 02);
        LocalDateTime d11 = LocalDateTime.of(2024, 02, 02, 13,03,44);

        System.out.println("d01: " + d01);
        System.out.println("d01Time: " + d01Time);
        System.out.println("instant: " + instant);
        System.out.println("data custom  d04 : " + d04);
        System.out.println("data2 custom: d05 " + d05);
        System.out.println("data INSTANT custom: d06 " + d06);
        System.out.println("data2 INSTANT custom: d07 " + d07);
        System.out.println("data3 custom: d08 " + d08);
        System.out.println("data4 custom: d09 " + d09);
        System.out.println("data5 custom: d10 " + d10);
        System.out.println("data6 custom: d11 " + d11);


    }


}
