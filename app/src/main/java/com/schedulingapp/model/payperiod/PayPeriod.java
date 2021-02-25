package com.schedulingapp.model.payperiod;

import com.schedulingapp.misc.Date;
import com.schedulingapp.misc.DayOfWeek;
import com.schedulingapp.misc.ShiftTime;
import com.schedulingapp.model.shift.Shift;

/**
 * Class PayPeriod
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
     * @param startDate
     */
    public PayPeriod(Date startDate) {
    }

    /**
     * @param rhs
     */
    public PayPeriod(PayPeriod rhs) {
    }

    //
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Get the value of startDate
     *
     * @return the value of startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Get the value of weekFirst
     *
     * @return the value of weekFirst
     */
    public WorkWeek getWeekFirst() {
        return weekFirst;
    }

    /**
     * Set the value of weekFirst
     *
     * @param newVar the new value of weekFirst
     */
    public void setWeekFirst(WorkWeek newVar) {
        weekFirst = newVar;
    }

    /**
     * Get the value of weekSecond
     *
     * @return the value of weekSecond
     */
    public WorkWeek getWeekSecond() {
        return weekSecond;
    }

    /**
     * Set the value of weekSecond
     *
     * @param newVar the new value of weekSecond
     */
    public void setWeekSecond(WorkWeek newVar) {
        weekSecond = newVar;
    }

    //
    // Other methods
    //

       /**
     * @param dayOfWeek
     * @param shiftTime
     * @param weekNumber
     * @return com.schedulingapp.model.shift.Shift
     */
    public Shift getShift(DayOfWeek dayOfWeek, ShiftTime shiftTime, int weekNumber) {
        return null;
    }


    /**
     * @param shift
     * @param weekNumber
     */
    public void setShift(Shift shift, int weekNumber) {
    }


    /**
     * @return double
     */
    public double getTotalHours() {
        return 0;
    }


    /**
     *
     */
    private void calcEndDate() {
    }


    /**
     *
     */
    private void validatePayPeriod() {
    }


}
