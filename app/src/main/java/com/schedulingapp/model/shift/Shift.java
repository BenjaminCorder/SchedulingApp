package com.schedulingapp.model.shift;

import com.schedulingapp.misc.Date;
import com.schedulingapp.misc.ShiftTime;
import com.schedulingapp.misc.Time;
import com.schedulingapp.misc.exceptions.IllegalDateException;
import com.schedulingapp.misc.exceptions.IllegalTimeException;

/**
 * An abstract class representing all information shared across all types of shifts.
 *
 * @author Ben Corder
 * @version 1.0
 * @since 1.0
 */
abstract public class Shift {

    //
    // Fields
    //

    protected final Date date;
    protected Time startTime;
    protected Time endTime;

    //
    // Constructors
    //

    /**
     * Non-Default Constructor.
     *
     * @param date date of the shift.
     */
    public Shift(Date date) {
        this.date = date;
    }

    /**
     * Non-Default Constructor.
     *
     * @param date date of the shift.
     * @param startTime time the shift begins.
     * @param endTime time the shift ends.
     */
    public Shift(Date date, Time startTime, Time endTime) {
        this.date = date;
    }

    /**
     * Copy Constructor.
     *
     * @param rhs object to make a copy of.
     */
    public Shift(Shift rhs) {
        date =rhs.getDate();
        startTime = rhs.getStartTime();
        endTime = rhs.getEndTime();
    }

    //
    // Methods
    //

    /**
     * Returns the length of time the shift lasts.
     *
     * @return double number of hours the shift lasts.
     */
    public double getShiftDuration() {
        return 0;
    }

    /**
     * Get the value of shiftTime.
     *
     * @return the value of shiftTime.
     */
    abstract public ShiftTime getShiftTime();

    //
    // Accessor methods
    //


    /**
     * Get the value of date.
     *
     * @return the value of date.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Get the value of startTime.
     *
     * @return the value of startTime.
     */
    public Time getStartTime() {
        return startTime;
    }

    /**
     * Get the value of endTime.
     *
     * @return the value of endTime.
     */
    public Time getEndTime() {
        return endTime;
    }

    //
    // Other methods
    //

    /**
     * Ensures that all member variables of the current object are reasonable.
     */
    abstract protected void validateShift();


}
