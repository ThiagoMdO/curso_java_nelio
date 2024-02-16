package secao11Datas.aplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataProgram03 {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDateTime r1 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println(r1.format(DateTimeFormatter.ofPattern("eeee, MMMM: dd/MM/yyyy HH:mm:ss")));
        System.out.println(r2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));


        System.out.println("Dia da semana: " + d01.getDayOfWeek());
        System.out.println("Dia do mês: " + d01.getDayOfMonth());
        System.out.println("Dia do ano: " + d01.getDayOfYear());

        System.out.println("Mês: " + d01.getMonth());
        System.out.println("Mês: " + d01.getMonthValue());

        System.out.println("Ano: " + d01.getYear());

        System.out.println("d02 hora = " + d02.getHour());
        System.out.println("d02 minutos = " + d02.getMinute());
        System.out.println("d02 segundos = " + d02.getSecond());

//        for(String s: ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//        }
    }
}
