package secao15.model.entities;

import secao15.model.exception.WithdranwLimitException;

public class Account {

    private Integer number;

    private String holder;

    private Double balance;

    private Double withdrawnLimit;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance, Double withdrawnLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawnLimit = withdrawnLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawnLimit() {
        return withdrawnLimit;
    }

    public void deposit(Double amount){

    }

    public void withdrawn(Double amount){
        if(amount > withdrawnLimit){
            throw new WithdranwLimitException("The amount exceeds withdrawn limit");
        }
        if(amount > balance){
            throw new WithdranwLimitException("Not enough balance");
        }
        this.balance -= amount;
    }
}
