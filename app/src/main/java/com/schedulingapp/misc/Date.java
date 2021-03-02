package com.schedulingapp.misc;

import com.schedulingapp.misc.exceptions.IllegalDateException;

import java.util.IllegalFormatException;

/**
 * A class for representing a date.
 *
 * @author Benjamin Corder
 * @version 1.0
 * @since 1.0
 */
public class Date {

    //
    // Fields
    //

    private final int day;
    private final int month;
    private final int year;
    private final DayOfWeek dayOfWeek;

    //
    // Constructors
    //

    /**
     * Non-Default Constructor
     *
     * @param   day                     day component of the date.
     * @param   month                   month component of the date.
     * @param   year                    year component of the date.
     * @throws  IllegalDateException    If the object represents a date that does not
     *                                  on the Gregorian Calendar.
     */
    public Date(int day, int month, int year) throws IllegalDateException{
        // Set member variables from input parameters
        this.day = day;
        this.month = month;
        this.year = year;

        // Check to make sure that the input parameters make sense.
        validateDate();

        // Use private methods to fill in the remaining member variables.
        this.dayOfWeek = calcDayOfWeek();
    }

    /**
     * Copy Constructor
     *
     * @param   rhs                     class to be copied to a new object.
     * @throws  IllegalDateException    If the object represents a date that does not
     *                                  on the Gregorian Calendar.
     */
    public Date(Date rhs) throws IllegalDateException {
        // Copy over all member variables from the rhs object.
        this.day = rhs.getDay();
        this.month = rhs.getMonth();
        this.year = rhs.getYear();
        this.dayOfWeek = rhs.getDayOfWeek();

        // Should be redundant, but check to make sure the current date makes sense just
        // in case something went wrong.
        validateDate();
    }

    //
    // Methods
    //

    //
    // Accessor methods
    //

    /**
     * Get the value of day
     *
     * @return  the value of day
     */
    public int getDay() {
        return day;
    }

    /**
     * Get the value of month
     *
     * @return  the value of month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Get the value of year
     *
     * @return  the value of year
     */
    public int getYear() {
        return year;
    }

    /**
     * Get the value of dayOfWeek
     *
     * @return  the value of dayOfWeek
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    //
    // Other methods
    //

    /**
     * Returns the day of the week that corresponds to the date represented by the
     * current object.
     *
     * @return  DayOfWeek
     */
    private DayOfWeek calcDayOfWeek() {
        return DayOfWeek.DAY_OF_WEEK_UNSPECIFIED;
    }

    /**
     * Makes sure that the date represented by the current object corresponds to a real
     * date.
     *
     * @throws  IllegalDateException    If the object represents a date that does not
     *                                  on the Gregorian Calendar.
     */
    private void validateDate() throws IllegalDateException {
    }


}
