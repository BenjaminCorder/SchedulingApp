package com.schedulingapp.model.shift;

import com.schedulingapp.misc.Date;
import com.schedulingapp.misc.ShiftTime;
import com.schedulingapp.misc.Time;

/**
 * A class representing a day shift.
 *
 * @author Ben Corder
 * @version 1.0
 * @since 1.0
 */
public class ShiftDays extends Shift {

    //
    // Fields
    //

    //
    // Constructors
    //

    /**
     * Non-Default Constructor.
     *
     * @param date date of the shift.
     */
    public ShiftDays(Date date) {
        super(date);
    }

    /**
     * Non-Default Constructor.
     *
     * @param date date of the shift.
     * @param startTime time the shift begins.
     * @param endTime time the shift ends.
     */
    public ShiftDays(Date date, Time startTime, Time endTime) {
        super(date);
    }

    /**
     * Copy Constructor.
     *
     * @param rhs object to make a copy of.
     */
    public ShiftDays(ShiftDays rhs) {
        super(rhs.getDate(), rhs.getStartTime(), rhs.getEndTime());
    }

    //
    // Methods
    //

    /**
     * Get the value of shiftTime
     *
     * @return the value of shiftTime
     */
    @Override
    public ShiftTime getShiftTime() {
        return ShiftTime.DAYS;
    }

    //
    // Accessor methods
    //

    //
    // Other methods
    //

    /**
     * Ensures that all member variables of the current object are reasonable.
     */
    @Override
    protected void validateShift() {
    }


}
