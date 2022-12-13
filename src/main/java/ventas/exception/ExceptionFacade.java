package ventas.exception;

public class ExceptionFacade extends Exception{
    public ExceptionFacade() {
    }

    public ExceptionFacade(String message) {
        super(message);
    }

    public ExceptionFacade(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionFacade(Throwable cause) {
        super(cause);
    }

    public ExceptionFacade(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
