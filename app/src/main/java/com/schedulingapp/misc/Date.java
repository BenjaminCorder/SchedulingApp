package com.schedulingapp.misc;


/**
 * Class Date
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
     * @param day
     * @param month
     * @param year
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.dayOfWeek = calcDayOfWeek();
    }

    /**
     * @param rhs
     */
    public Date(Date rhs) {
        this.day = rhs.getDay();
        this.month = rhs.getMonth();
        this.year = rhs.getYear();
        this.dayOfWeek = rhs.getDayOfWeek();
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
     * @return the value of day
     */
    public int getDay() {
        return day;
    }

    /**
     * Get the value of month
     *
     * @return the value of month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Get the value of year
     *
     * @return the value of year
     */
    public int getYear() {
        return year;
    }

    /**
     * Get the value of dayOfWeek
     *
     * @return the value of dayOfWeek
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    //
    // Other methods
    //

    /**
     * @return DayOfWeek
     */
    private DayOfWeek calcDayOfWeek() {
        return DayOfWeek.DAY_OF_WEEK_UNSPECIFIED;
    }


    /**
     *
     */
    private void validateDate() {
    }


}
