package com.schedulingapp.misc.exceptions;

/**
 * A class that represents any time a date is created that does not correspond to a date
 * on the Gregorian Calendar.
 *
 * @author Benjamin Corder
 * @version 1.0
 * @since 1.0
 */
public class IllegalDateException extends Exception {
    /**
     * Non-Default Constructor.
     *
     * @param errorMessage  message accompanying the error.
     */
    public IllegalDateException(String errorMessage) {
        super(errorMessage);
    }
}
