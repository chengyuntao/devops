package com.quxie.store.service.ex;

public class CalligraphyNotFoundException extends ServiceException {
    public CalligraphyNotFoundException() {
        super();
    }

    public CalligraphyNotFoundException(String message) {
        super(message);
    }

    public CalligraphyNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalligraphyNotFoundException(Throwable cause) {
        super(cause);
    }

    protected CalligraphyNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
