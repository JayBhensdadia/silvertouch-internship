package com.jaybhensdadia.security4.error;

public class EmployeeDoesNotExist extends Exception{
    public EmployeeDoesNotExist() {
    }

    public EmployeeDoesNotExist(String message) {
        super(message);
    }

    public EmployeeDoesNotExist(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeDoesNotExist(Throwable cause) {
        super(cause);
    }

    public EmployeeDoesNotExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
