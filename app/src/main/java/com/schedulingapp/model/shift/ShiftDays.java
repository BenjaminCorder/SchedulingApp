package com.schedulingapp.model.shift;

import com.schedulingapp.misc.Date;
import com.schedulingapp.misc.ShiftTime;
import com.schedulingapp.misc.Time;

/**
 * Class ShiftDays
 */
public class ShiftDays extends Shift {

    //
    // Fields
    //

    static private final ShiftTime shiftTime = ShiftTime.DAYS;

    //
    // Constructors
    //

    /**
     * @param date
     */
    public ShiftDays(Date date) {
    }

    /**
     * @param date
     * @param startTime
     * @param endTime
     */
    public ShiftDays(Date date, Time startTime, Time endTime) {
    }

    /**
     * @param rhs
     */
    public ShiftDays(ShiftDays rhs) {
    }

    //
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Get the value of shiftTime
     *
     * @return the value of shiftTime
     */
    public ShiftTime getShiftTime() {
        return shiftTime;
    }

    //
    // Other methods
    //

    /**
     *
     */
    @Override
    protected void validateShift() {
    }


}
