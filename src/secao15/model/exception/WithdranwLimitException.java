package secao15.model.exception;

public class WithdranwLimitException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public WithdranwLimitException(String msg){
        super(msg);
    }
}
