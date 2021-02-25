package com.schedulingapp.model.shift;

import com.schedulingapp.misc.ShiftTime;

/**
 * Class ShiftMids
 */
public class ShiftMids extends Shift {

    //
    // Fields
    //

    static private final ShiftTime shiftTime = ShiftTime.MIDS;

    //
    // Constructors
    //



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
    public static ShiftTime getShiftTime() {
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
