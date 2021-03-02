package com.schedulingapp.model.shift;

import com.schedulingapp.misc.Date;
import com.schedulingapp.misc.Time;

/**
 * Class Shift
 */
abstract public class Shift {

    //
    // Fields
    //

    protected Date date;
    protected Time startTime;
    protected Time endTime;

    //
    // Constructors
    //
    public Shift() {
    }

  //
    // Methods
    //


    //
    // Accessor methods
    //


    /**
     * Get the value of date
     *
     * @return the value of date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Get the value of startTime
     *
     * @return the value of startTime
     */
    public Time getStartTime() {
        return startTime;
    }

    /**
     * Get the value of endTime
     *
     * @return the value of endTime
     */
    public Time getEndTime() {
        return endTime;
    }

    /**
     * Set the value of date
     *
     * @param date the new value of date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    //
    // Other methods
    //

    /**
     * @return double
     */
    public double getShiftDuration() {
        return 0;
    }


    /**
     *
     */
    abstract protected void validateShift();


}
