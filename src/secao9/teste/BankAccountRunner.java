package secao9.teste;

import secao9.model.BankAccount;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class BankAccountRunner {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount01;

        System.out.print("Enter account number: ");
        long numberAccount = scanner.nextLong();

        System.out.print("Enter account holder: ");
        String nameAccount = scanner.next();

        System.out.print("Is there na initial deposit (y/n)? ") ;
        String optionYesOrNo = scanner.next();


        if(Objects.equals(optionYesOrNo, "y")){
            System.out.print("Enter initial deposit value: ");
            double deposit = scanner.nextDouble();
            bankAccount01 = new BankAccount(numberAccount, nameAccount, deposit);
        }else{
           bankAccount01 = new BankAccount(numberAccount, nameAccount);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(bankAccount01);

        System.out.println();
        System.out.print("Enter xa deposit value: ");
        double newDeposit = scanner.nextDouble();
        bankAccount01.addMoneyInAccount(newDeposit);
        System.out.println("Updated account data:");
        System.out.println(bankAccount01);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double newWithdraw = scanner.nextDouble();
        bankAccount01.removeMoneyInAccount(newWithdraw);
        System.out.println("Updated account data:");
        System.out.println(bankAccount01);

        scanner.close();

    }
}
