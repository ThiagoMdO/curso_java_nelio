package secao15.application;

import secao15.model.entities.Account;
import secao15.model.exception.WithdranwLimitException;

import java.util.Locale;
import java.util.Scanner;

public class AccountRunner {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Holder: ");
            String holder = scanner.nextLine();

            System.out.print("Initial balance: ");
            Double initialBalance = scanner.nextDouble();

            System.out.print("Withdrawn limit: ");
            Double withDrawnLimit = scanner.nextDouble();

            Account account = new Account(number, holder, initialBalance, withDrawnLimit);

            System.out.print("Enter amount for withdrawn: ");
            Double withDrawn = scanner.nextDouble();

            account.withdrawn(withDrawn);

            System.out.println("New balance: " + String.format("%.2f",account.getBalance()));


        } catch (WithdranwLimitException e) {
            System.out.println("Withdrawn error: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }


    }
}
