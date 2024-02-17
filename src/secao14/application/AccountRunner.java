package secao14.application;

import secao14.polimorfismo.Account;
import secao14.polimorfismo.BusinessAccount;
import secao14.polimorfismo.SavingsAccount;

public class AccountRunner {


    public static void main(String[] args) {
        BusinessAccount businessAccount = new BusinessAccount();
        businessAccount.setNumber(1);
        businessAccount.setHolder("Maria");
        businessAccount.setBalance(100.34);
        businessAccount.setLoanLimit(100.00);

        System.out.println(businessAccount.getBalance());

        businessAccount.withdraw(10.33);
        businessAccount.loan(90.42);

        System.out.println(businessAccount.getBalance());


//        Account acc = new Account(1001, "Alecx", 0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "China-Roupas.LTDA", 200.00, 500.00);

        bacc.loan(110.22);


        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Importados", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "GeradoresLTDA", 100.00, 7000.00);


        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(200.00);

        // Objeto que está fazendo o downcasting precisa ser do mesmo tipo do casting para não ter erro
//        BusinessAccount acc5 = (BusinessAccount) acc3;

        // Uma maneira de testar se o objeto é do mesmo tipo do downcasting é usando o comando Instanceof
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            System.out.println("Instancia de BusinessAccount");
            System.out.println(acc5.getLoanLimit());
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            System.out.println("instancia de SavingsAccount");
            System.out.println(acc5.getInterestRate());

        }


    }


}
