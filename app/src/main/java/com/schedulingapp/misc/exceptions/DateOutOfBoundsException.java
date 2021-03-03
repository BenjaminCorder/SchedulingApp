package com.schedulingapp.misc.exceptions;

/**
 * A class representing an error to be thrown when a date is used that is outside the
 * context of the calling method or class.
 *
 * @author Benjamin Corder
 * @version 1.0
 * @since 1.0
 */
public class DateOutOfBoundsException extends Exception {
    /**
     * Non-Default Constructor.
     *
     * @param errorMessage  message accompanying the error.
     */
    public DateOutOfBoundsException(String errorMessage) {
        super(errorMessage);
    }
}
