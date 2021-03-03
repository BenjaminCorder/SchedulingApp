package com.schedulingapp.misc.exceptions;

/**
 * A class representing an error to be thrown when a date is used as a start date to a
 * pay period when it does not correspond to a Sunday on an odd numbered week.
 *
 * @author Benjamin Corder
 * @version 1.0
 * @since 1.0
 */
public class IllegalStartDateException extends Exception {
    /**
     * Non-Default Constructor.
     *
     * @param errorMessage  message accompanying the error.
     */
    public IllegalStartDateException(String errorMessage) {
        super(errorMessage);
    }
}