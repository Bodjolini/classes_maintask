package kz.kassayev.indriver.exception;

public class ListIsEmptyException extends Exception {
    public ListIsEmptyException() {
    }

    public ListIsEmptyException(String message) {
        super(message);
    }

    public ListIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public ListIsEmptyException(Throwable cause) {
        super(cause);
    }

    public ListIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
