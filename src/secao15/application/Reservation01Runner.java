package secao15.application;

import secao15.model.entities.Reservation01;
import secao15.model.exception.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Reservation01Runner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = null;

        try {

            scanner = new Scanner(System.in);
            System.out.print("Room number: ");
            int room = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Check-in date (DD/MM/YYYY): ");
            LocalDate checkIn = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Check-out date (DD/MM/YYYY): ");
            LocalDate checkOut = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Reservation01 reservation01 = new Reservation01(room, checkIn, checkOut);

            System.out.println(reservation01);

            System.out.println();

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (DD/MM/YYYY): ");
            checkIn = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Check-out date (DD/MM/YYYY): ");
            checkOut = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            reservation01.updateDates(checkIn, checkOut);

            System.out.println(reservation01);


        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid format in this field");
        } catch (DateTimeParseException e) {
            System.out.println("The field data must be in format (dd/mm/yyyy) ex: (30/12/2024");
        }catch (RuntimeException e) {
            System.out.println("Unexpected error");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }


    }
}
