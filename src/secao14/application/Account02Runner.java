package secao14.application;

import secao14.polimorfismo.Account;
import secao14.polimorfismo.BusinessAccount;
import secao14.polimorfismo.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Account02Runner {

    public static void main(String[] args) {
//        Account acc1 = new Account(1001, "Alex", 100.00);
//        acc1.withdraw(10.00);

//        System.out.println(acc1.getBalance());

        List<Account> list = new ArrayList<>();

        Account acc2 = new SavingsAccount(1002, "Jose", 100.00, 200.00);
        acc2.withdraw(10.00);

        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "AutoPeças", 100.00, 5000.00);
        acc3.withdraw(10.00);

        System.out.println(acc3.getBalance());

        list.add(acc2);
        list.add(acc3);

        for (Account obj : list) {
            System.out.println(obj);
        }

    }
}
