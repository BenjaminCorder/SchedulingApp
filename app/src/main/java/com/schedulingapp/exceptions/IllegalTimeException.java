package com.schedulingapp.exceptions;

/**
 * A class representing an error to be thrown when a time is created that does not
 * correspond to a real time.
 *
 * @author Benjamin Corder
 * @version 1.0
 * @since 1.0
 */
public class IllegalTimeException extends Exception {
    /**
     * Non-Default Constructor.
     *
     * @param errorMessage  message accompanying the error.
     */
    public IllegalTimeException(String errorMessage) {
        super(errorMessage);
    }
}
