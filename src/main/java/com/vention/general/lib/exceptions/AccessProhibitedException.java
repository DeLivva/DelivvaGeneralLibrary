package com.vention.general.lib.exceptions;

public class AccessProhibitedException extends RuntimeException {
    public AccessProhibitedException(String message) {
        super(message);
    }
}
