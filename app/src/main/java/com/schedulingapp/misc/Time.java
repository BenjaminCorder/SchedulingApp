package com.schedulingapp.misc;


/**
 * Class Time
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
     * @param hour
     * @param minute
     */
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }


    /**
     * @param rhs
     */
    public Time(Time rhs) {
        this.hour = rhs.getHour();
        this.minute = rhs.getMinute();
    }

    //
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Get the value of hour
     *
     * @return the value of hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * Get the value of minute
     *
     * @return the value of minute
     */
    public int getMinute() {
        return minute;
    }

    //
    // Other methods
    //

    /**
     * @param time
     * @return double
     */
    public double calcDifference(Time time) {
        return 0;
    }


}
