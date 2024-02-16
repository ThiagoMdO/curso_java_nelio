package secao11Datas.aplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataProgram02 {

    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-07-20");

        LocalDateTime d02 = LocalDateTime.parse("2023-04-22T01:30:55");

        Instant d03 = Instant.parse("2024-02-25T01:30:55Z");

        DateTimeFormatter ft01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter ft02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter ft03 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
        DateTimeFormatter ft04 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter ft05 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter ft06 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d01 = " + d01);
        System.out.println("d01 formatted = " + d01.format(ft01));
        System.out.println("d01 formatted = " + ft01.format(d01));

        System.out.println();
        System.out.println("d02 = " + d02);
        System.out.println("d02 = " + d02.format(ft05));
        System.out.println("d02 formatted = " + d02.format(ft02));

        System.out.println();
        System.out.println("d03 = " + d03);
        System.out.println("d03 formatted = " + ft03.format(d03));
        System.out.println("d03 formatted = " + ft04.format(d03));
        System.out.println("d03 formatted = " + ft06.format(d03));
    }
}
