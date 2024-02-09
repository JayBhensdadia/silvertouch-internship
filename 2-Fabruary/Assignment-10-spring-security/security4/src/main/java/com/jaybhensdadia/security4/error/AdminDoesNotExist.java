package com.jaybhensdadia.security4.error;

public class AdminDoesNotExist extends Exception{
    public AdminDoesNotExist() {
    }

    public AdminDoesNotExist(String message) {
        super(message);
    }

    public AdminDoesNotExist(String message, Throwable cause) {
        super(message, cause);
    }

    public AdminDoesNotExist(Throwable cause) {
        super(cause);
    }

    public AdminDoesNotExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
