package com.schedulingapp.misc.exceptions;

/**
 * A class that represents any time a time is created that does not correspond to a time
 * in the day.
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
