package com.schedulingapp.model.shift;

import com.schedulingapp.misc.Date;
import com.schedulingapp.misc.ShiftTime;
import com.schedulingapp.misc.Time;

/**
 * Class ShiftSwings
 */
public class ShiftSwings extends Shift {

    //
    // Fields
    //

    static private final ShiftTime shiftTime = ShiftTime.SWINGS;

    //
    // Constructors
    //

    /**
     * @param date
     */
    public ShiftSwings(Date date) {
    }

    /**
     * @param date
     * @param startTime
     * @param endTime
     */
    public ShiftSwings(Date date, Time startTime, Time endTime) {
    }

    /**
     * @param rhs
     */
    public ShiftSwings(ShiftSwings rhs) {
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
    public static ShiftTime getShiftTime() {
        return shiftTime;
    }

    //
    // Other methods
    //

    /**
     *
     */
    public void validateShift() {
    }


}
