package exceptions;

/**
 * InsufficientFundsException.
 */
public class InsufficientFundsException extends Exception {
    private  String message;

    public InsufficientFundsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
