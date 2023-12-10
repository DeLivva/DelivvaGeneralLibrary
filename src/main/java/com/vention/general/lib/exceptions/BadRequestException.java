package com.vention.general.lib.exceptions;

/**
 * @author Abbos_Akramov
 * This exception is thrown while checking some field manually
 */
public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
