package com.vention.general.lib.exceptions;

/**
 * This exception is thrown when user tries to save data that already exist in db
 */
public class DataAlreadyExistException extends RuntimeException {
    /**
     * @param message that user see
     */
    public DataAlreadyExistException(String message) {
        super(message);
    }
}
