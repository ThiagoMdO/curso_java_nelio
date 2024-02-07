package secao9.model;

public class BankAccount {

    private long numberAccount;

    private String nameAccount;

    private double balanceAccount;


    public BankAccount(long numberAccount, String nameAccount, double initialDeposit){
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        addMoneyInAccount(initialDeposit);
    }

    public BankAccount(long numberAccount, String nameAccount){
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
    }

    public String getNameAccount(){
        return nameAccount;
    }

    public void setNameAccount(String nameAccount){
        this.nameAccount = nameAccount;
    }

    public long getNumberAccount(){
        return numberAccount;
    }

    public double getBalanceAccount(){
        return balanceAccount;
    }

    public void addMoneyInAccount(double newDeposit){
        this.balanceAccount += newDeposit;
    }

    public void removeMoneyInAccount(double newWithdrawal){
        if(this.balanceAccount < 5 || this.balanceAccount < newWithdrawal){
            System.out.println("You don't have enough money to carry out the transaction");
            return;
        }
        this.balanceAccount -= newWithdrawal + 5.00;
    }

    public String toString(){
        return "Account " + getNumberAccount()
        + ", Holder: " + getNameAccount()
        + ", Balance: R$" + String.format("%.2f",getBalanceAccount());
    }
}
