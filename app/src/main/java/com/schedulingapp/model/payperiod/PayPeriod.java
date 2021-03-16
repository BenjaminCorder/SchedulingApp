package com.schedulingapp.model.payperiod;

import com.schedulingapp.misc.Date;
import com.schedulingapp.misc.ShiftTime;
import com.schedulingapp.exceptions.IllegalDateException;
import com.schedulingapp.model.shift.Shift;

/**
 * A class representing a pay period of two weeks.
 *
 * @author Ben Corder, Kylan Rice
 * @version 1.0
 * @since 1.0
 */
public class PayPeriod {

    //
    // Fields
    //

    private Date startDate;
    private WorkWeek weekFirst;
    private WorkWeek weekSecond;

    //
    // Constructors
    //

    /**
     * Non-Default Constructor.
     *
     * @param startDate date the PayPeriod begins on.
     */
    public PayPeriod() {

    }

    /**
     * Copy Constructor.
     *
     * @param rhs object to make a copy of.
     * @throws IllegalDateException If the object represents a date that does not
     *                              on the Gregorian Calendar.
     */


    public PayPeriod(Date x, WorkWeek y, WorkWeek z) throws IllegalDateException {
        startDate = x;
        weekFirst = y;
        weekSecond = z;
    }



    //
    // Methods
    //

    /**
     * Returns the shift that corresponds to the input date and shiftTime.
     *
     * @param date date of the shift to return.
     * @param shiftTime time of the shift to return.
     * @return Shift
     */
    public Shift getShift(Date date, ShiftTime shiftTime) {
        //Shift x = new Shift(date, shiftTime); - this needs to be completed in shift first
        Shift x = null; //remove this once above line is functional

        return x;
    }


    /**
     * Sets the value of a shift.
     *
     * @param shift new value for shift.
     */

    public void setShift(Shift shift) {
        Shift x = shift;

    }


    /**
     * Returns the total number of hours worked this pay period.
     *
     * @return the total number of hours worked this pay period.
     */
    public double getTotalHours() {

        return 0;
    }

    //
    // Accessor methods
    //

    /**
     * Get the value of startDate.
     *
     * @return the value of startDate.
     */
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date newVar) {
        startDate = newVar;
    }

    /**
     * Get the value of weekFirst.
     *
     * @return the value of weekFirst.
     */
    public WorkWeek getWeekFirst() {
        return weekFirst;
    }

    /**
     * Set the value of weekFirst.
     *
     * @param newVar the new value of weekFirst.
     */
    public void setWeekFirst(WorkWeek newVar) {
        weekFirst = newVar;
    }

    /**
     * Get the value of weekSecond.
     *
     * @return the value of weekSecond.
     */
    public WorkWeek getWeekSecond() {
        return weekSecond;
    }

    /**
     * Set the value of weekSecond.
     *
     * @param newVar the new value of weekSecond.
     */
    public void setWeekSecond(WorkWeek newVar) {
        weekSecond = newVar;
    }

    //
    // Other methods
    //

    /**
     *      * Calculates the end date of the pay period based on the start date.
     */
    private Date calcEndDate() {
        return null;
    }


    /**
     * Ensures that all member variables in the current object are at reasonable values.
     */
    private void validatePayPeriod() {
    }


}
