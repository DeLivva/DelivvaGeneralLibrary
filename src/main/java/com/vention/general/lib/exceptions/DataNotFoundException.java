package com.vention.general.lib.exceptions;

/**
 * This exception is thrown when user tries to retrieve info which doesn't exist in db
 */
public class DataNotFoundException extends RuntimeException {
    /**
     * @param message that user see
     */
    public DataNotFoundException(String message) {
        super(message);
    }
}