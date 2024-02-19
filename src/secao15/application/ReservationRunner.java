package secao15.application;

import secao15.model.entities.Reservation;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ReservationRunner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Room number: ");
            Integer room = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Check-in date (DD/MM/YYYY): ");
            String dateIn = scanner.nextLine();
            LocalDate checkIn = LocalDate.parse(dateIn, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Check-out date (DD/MM/YYYY): ");
            String dateOut = scanner.nextLine();
            LocalDate checkOut = LocalDate.parse(dateOut, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Duration period = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());

//            testPeriod(room, period, scanner);

            while (period.toDays() <= 0) {
                System.out.println("Error in reservation: Check-out date must be after or not a same day check-in date");
                System.out.print("Check-in date (DD/MM/YYYY): ");
                dateIn = scanner.nextLine();
                checkIn = LocalDate.parse(dateIn, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                System.out.print("Check-out date (DD/MM/YYYY): ");
                dateOut = scanner.nextLine();
                checkOut = LocalDate.parse(dateOut, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                period = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());
            }
            Reservation reservation = new Reservation(room, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");

            System.out.print("Check-in date (DD/MM/YYYY): ");
            String newDateIn = scanner.nextLine();
            LocalDate newCheckIn = LocalDate.parse(newDateIn, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Check-out date (DD/MM/YYYY): ");
            String newDateOut = scanner.nextLine();
            LocalDate newCheckOut = LocalDate.parse(newDateOut, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Duration t1 = Duration.between(checkIn.atStartOfDay(), newCheckIn.atStartOfDay());

            while (t1.toDays() < 0) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
                System.out.println();
                System.out.println("Enter data to update the reservation:");

                System.out.print("Check-in date (DD/MM/YYYY): ");
                newDateIn = scanner.nextLine();
                newCheckIn = LocalDate.parse(newDateIn, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                System.out.print("Check-out date (DD/MM/YYYY): ");
                newDateOut = scanner.nextLine();
                newCheckOut = LocalDate.parse(newDateOut, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                Duration period2 = Duration.between(newCheckIn.atStartOfDay(), newCheckOut.atStartOfDay());

                while (period2.toDays() <= 0) {
                    System.out.println("Error in reservation: Check-out date must be after or not a same day check-in date");
                    System.out.print("Check-in date (DD/MM/YYYY): ");
                    newDateIn = scanner.nextLine();
                    newCheckIn = LocalDate.parse(newDateIn, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    System.out.print("Check-out date (DD/MM/YYYY): ");
                    newDateOut = scanner.nextLine();
                    newCheckOut = LocalDate.parse(newDateOut, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    period2 = Duration.between(newCheckIn.atStartOfDay(), newCheckOut.atStartOfDay());
                }

                t1 = Duration.between(checkIn.atStartOfDay(), newCheckIn.atStartOfDay());
//                testPeriod(room, period, scanner);
            }
//            if (t1.toDays() <= 0) {
//
//            }
            reservation.updateDates(newCheckIn, checkOut);
            System.out.println(reservation);


        } catch (InputMismatchException e) {
            System.out.println("Invalid parameters");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid parameters of date: try again");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }


    }

//    private static void testPeriod(Integer room, Duration period, Scanner scanner) {
//        while (period.toDays() <= 0) {
//            System.out.println("Error in reservation: Check-out date must be after or not a same day check-in date");
//            System.out.print("Check-in date (DD/MM/YYYY): ");
//            String dateIn = scanner.nextLine();
//            LocalDate checkIn = LocalDate.parse(dateIn, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//
//            System.out.print("Check-out date (DD/MM/YYYY): ");
//            String dateOut = scanner.nextLine();
//            LocalDate checkOut = LocalDate.parse(dateOut, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//            period = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());
//
////            Reservation reservation = new Reservation(room, checkIn, checkOut);
////            System.out.println(reservation);
//        }
//    }
}
