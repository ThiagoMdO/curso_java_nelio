package secao14.polimorfismo;

public class BusinessAccount extends Account{

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit){
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if(amount <= loanLimit){
//            deposit(amount);
            balance += amount - 10.00;
        }else{
            System.out.println("You don't have enough loan limit to do this operation");
        }
    }

    @Override
    public void withdraw(Double amount){
        if(this.balance >= 5){
            super.withdraw(amount);
            balance -= 2.0;
        }
    }
}
