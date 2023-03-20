package com.quxie.store.service.ex;

public class PracCalligraphyNotFoundException extends ServiceException {
    public PracCalligraphyNotFoundException() {
        super();
    }

    public PracCalligraphyNotFoundException(String message) {
        super(message);
    }

    public PracCalligraphyNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PracCalligraphyNotFoundException(Throwable cause) {
        super(cause);
    }

    protected PracCalligraphyNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
