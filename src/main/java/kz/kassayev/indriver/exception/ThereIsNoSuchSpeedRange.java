package kz.kassayev.indriver.exception;

public class ThereIsNoSuchSpeedRange extends Exception {
    public ThereIsNoSuchSpeedRange() {
    }

    public ThereIsNoSuchSpeedRange(String message) {
        super(message);
    }

    public ThereIsNoSuchSpeedRange(String message, Throwable cause) {
        super(message, cause);
    }

    public ThereIsNoSuchSpeedRange(Throwable cause) {
        super(cause);
    }

    public ThereIsNoSuchSpeedRange(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
