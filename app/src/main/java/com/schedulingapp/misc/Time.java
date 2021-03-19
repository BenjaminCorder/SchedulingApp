package com.schedulingapp.misc;

import com.schedulingapp.exceptions.IllegalTimeException;

/**
 * A class representing a time.
 *
 * @author Benjamin Corder
 * @version 1.0
 * @since 1.0
 */
public class Time {

    //
    // Fields
    //

    private final int hour;
    private final int minute;

    //
    // Constructors
    //

    /**
     * Non-Default Constructor
     *
     * @param   hour                    Hour component of a time.
     * @param   minute                  Minute component of a time.
     * @throws  IllegalTimeException    If the current object represents a time that does
     *                                  not correspond to a real time.
     */
    public Time(int hour, int minute) throws IllegalTimeException {
        // Set member variables to their corresponding input variable.
        this.hour = hour;
        this.minute = minute;

        // Validate the current object.
        validateTime();
    }


    /**
     * Copy Constructor
     *
     * @param   rhs                     Object to create a copy of.
     * @throws  IllegalTimeException    If the current object represents a time that does
     *                                  not correspond to a real time.
     */
    public Time(Time rhs) throws IllegalTimeException {
        // Copy over all member variables of the input Time
        this.hour = rhs.getHour();
        this.minute = rhs.getMinute();

        // Should be redundant, but validate the current object
        validateTime();
    }

    //
    // Methods
    //

    /**
     * Calculates the difference in hours between the current object and the input time.
     *
     * @param   time    Time to compare to the current object.
     * @return  double
     */
    public double calcDifference(Time time) {
        return 0;
    }

    //
    // Accessor methods
    //

    /**
     * Get the value of hour
     *
     * @return  the value of hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * Get the value of minute
     *
     * @return  the value of minute
     */
    public int getMinute() {
        return minute;
    }

    //
    // Other methods
    //

    /**
     * Makes sure the time represented by the current object corresponds to an actual
     * time.
     *
     * @throws  IllegalTimeException    If the current object represents a time that does
     *                                  not correspond to a real time.
     */
    private void validateTime() throws IllegalTimeException {

    }


}
