package com.schedulingapp.misc;

import androidx.annotation.NonNull;

import com.schedulingapp.exceptions.IllegalDateException;

/**
 * A class for representing a date.
 *
 * @author Benjamin Corder
 * @version 1.0
 * @since 1.0
 */
public class Date {

    //
    // Fields
    //

    private final int day;
    private final int month;
    private final int year;
    private final DayOfWeek dayOfWeek;
    private final int dayOfYear;
    private final int weekNumber;

    //
    // Constructors
    //

    /**
     * Non-Default Constructor
     *
     * @param   day                     day component of the date.
     * @param   month                   month component of the date.
     * @param   year                    year component of the date.
     * @throws  IllegalDateException    If the object represents a date that does not
     *                                  on the Gregorian Calendar.
     */
    public Date(int day, int month, int year) throws IllegalDateException{
        // Set member variables from input parameters
        this.day = day;
        this.month = month;
        this.year = year;

        // Check to make sure that the input parameters make sense.
        validateDate();

        // Use private methods to fill in the remaining member variables.
        this.dayOfWeek = intToDayOfWeek(calcDayOfWeek(day, month, year));
        this.dayOfYear = calcDayOfYear(day, month, year);
        this.weekNumber = calcWeekNumber(day, month, year);
    }

    /**
     * Copy Constructor
     *
     * @param   rhs                     class to be copied to a new object.
     * @throws  IllegalDateException    If the object represents a date that does not
     *                                  on the Gregorian Calendar.
     */
    public Date(Date rhs) throws IllegalDateException {
        // Copy over all member variables from the rhs object.
        this.day = rhs.getDay();
        this.month = rhs.getMonth();
        this.year = rhs.getYear();
        this.dayOfWeek = rhs.getDayOfWeek();
        this.dayOfYear = rhs.getDayOfYear();
        this.weekNumber = rhs.getWeekNumber();

        // Should be redundant, but check to make sure the current date makes sense just
        // in case something went wrong.
        validateDate();
    }

    //
    // Methods
    //

    /**
     * Converts the object to a String.
     *
     * @return String formatted day/month/year.
     */
    @NonNull
    @Override
    public String toString() {
        return String.format("%s/%s/%s", day, month, year);
    }

    //
    // Accessor methods
    //

    /**
     * Get the value of day
     *
     * @return  the value of day
     */
    public int getDay() {
        return day;
    }

    /**
     * Get the value of month
     *
     * @return  the value of month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Get the value of year
     *
     * @return  the value of year
     */
    public int getYear() {
        return year;
    }

    /**
     * Get the value of dayOfWeek
     *
     * @return  the value of dayOfWeek
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Get the value of dayOfYear
     *
     * @return  the value of dayOfYear
     */
    public int getDayOfYear() {
        return dayOfYear;
    }

    /**
     * Get the value of weekNumber
     *
     * @return  the value of weekNumber
     */
    public int getWeekNumber() {
        return weekNumber;
    }

    //
    // Other methods
    //

    /**
     * Convert an input integer to a DayOfWeek Enum.
     *
     * @param i inter to convert to enum.
     * @return DayOfWeek Enum that corresponds to the input integer.
     */
    private DayOfWeek intToDayOfWeek(int i) {
        // Initialize variables
        DayOfWeek dayOfWeek = DayOfWeek.DAY_OF_WEEK_UNSPECIFIED;

        // Switch between cases
        switch(i) {
            case 0:
                dayOfWeek = DayOfWeek.SUNDAY;
                break;
            case 1:
                dayOfWeek = DayOfWeek.MONDAY;
                break;
            case 2:
                dayOfWeek = DayOfWeek.TUESDAY;
                break;
            case 3:
                dayOfWeek = DayOfWeek.WEDNESDAY;
                break;
            case 4:
                dayOfWeek = DayOfWeek.THURSDAY;
                break;
            case 5:
                dayOfWeek = DayOfWeek.FRIDAY;
                break;
            case 6:
                dayOfWeek = DayOfWeek.SATURDAY;
                break;
        }

        return dayOfWeek;
    }

    /**
     * Returns what day number the input date is in its year.
     *
     * @param day day component of the input date.
     * @param month month component of the input date.
     * @param year year component of the input date.
     * @return int day number the input date is in its year.
     */
    private int calcDayOfYear(int day, int month, int year) {
        // Initialize variables
        int dayOfYear = 0;
        final int[] daysInMonth = {
                31, // January
                28, // February non leap year
                31, // March
                30, // April
                31, // May
                30, // June
                31, // July
                31, // August
                30, // September
                31, // October
                30, // November
                31 // December
        };

        // Adjust for leap years
        if ((year % 4) == 0) {
            daysInMonth[1] = 29;
        }

        // Add the days of our current month
        month--;
        dayOfYear += day;

        // Add the days of each remaining month month
        while (month < 0) {
            month--;

            dayOfYear += daysInMonth[month];
        }

        return dayOfYear;
    }

    /**
     * Returns the week number the of input date in its year.
     *
     * @param day component of the input date.
     * @param month month component of the input date.
     * @param year year component of the input date.
     * @return the week number of the input date in its year.
     */
    public int calcWeekNumber(int day, int month, int year) {
        // Initialize variables
        int dayOfYear = calcDayOfYear(day, month, year);
        int dayOfWeek = calcDayOfWeek(day, month, year);
        int firstDayOfWeek = calcDayOfWeek(1, 1, year);

        // Calculate the week number
        int weekNum = (dayOfYear + 6)/7;

        // Adjust for being after Saturday of the first week of the year
        if (dayOfWeek < firstDayOfWeek) {
            weekNum++;
        }

        return weekNum;
    }

    /**
     * Returns the day of the week that corresponds to the date represented by the
     * current object, with Sunday being zero and so on.
     *
     * @param day day component of the date to calculate.
     * @param month month component of the date to calculate.
     * @param year year component of the date to calculate.
     * @return  int day of week
     */
    private int calcDayOfWeek(int day, int month, int year) {
        // Declare variables
        int dayOfWeek = 0;
        final int[] monthOffset = {
                0, // January is 0 days offset of itself in a normal year
                3, // February is 3 days offset of January in a normal year
                2, // March is 2 days offset of January in a normal year
                5, // April is 5 days offset of January in a normal year
                0, // May is 0 days offset of January in a normal year
                3, // June is 3 days offset of January in a normal year
                5, // July is 5 days offset of January in a normal year
                1, // August is 1 days offset of January in a normal year
                4, // September is 4 days offset of January in a normal year
                6, // October is 6 days offset of January in a normal year
                2, // November is 2 days offset of January in a normal year
                4  // December is 4 days offset of January in a normal year
        };

        // Adjust for leap year
        if (month < 3) {
            year -= 1;
        }

        // Calculate a dayOfWeek
        dayOfWeek = (year + year/4 - year/100 + year/400
                + monthOffset[month - 1] + day) % 7;

        // Convert dayOfWeek to its corresponding DayOfWeek
        return dayOfWeek;
    }

    /**
     * Makes sure that the date represented by the current object corresponds to a real
     * date.
     *
     * @throws  IllegalDateException    If the object represents a date that does not
     *                                  on the Gregorian Calendar.
     */
    private void validateDate() throws IllegalDateException {
        //
        // Check to make sure year is valid
        //

        // Year should not be negative
        if (year < 0) {
            throw new IllegalDateException("ERROR: value for year cannot be negative.");
        }

        //
        // Check to make sure month is valid
        //

        // Month should only be between 1 and 12
        if (month < 1 || month > 12) {
            throw new IllegalDateException("ERROR: value for month must be between " +
                    "1 and 12.");
        }

        //
        // Check to make sure day is valid
        //

        // Day cannot be negative or equal zero
        if (day < 0) {
            throw new IllegalDateException("ERROR: value for day must be " +
                    "greater than 0.");
        }

        // Check to make sure day is not outside its month
        String monthText = null;
        switch (month) {
            case 1: // January
                if (day > 31) {
                    monthText = "January";
                }
                break;
            case 2: // February
                if (day > 28) {
                    // Check to see if it is leap year
                    if (day != 29 || (year % 4) != 0) {
                        monthText = "February";
                    }
                }
                break;
            case 3: // March
                if (day > 31) {
                    monthText = "March";
                }
                break;
            case 4: // April
                if (day > 30) {
                    monthText = "April";
                }
                break;
            case 5: // May
                if (day > 31) {
                    monthText = "May";
                }
                break;
            case 6: // June
                if (day > 30) {
                    monthText = "June";
                }
                break;
            case 7: // July
                if (day > 31) {
                    monthText = "July";
                }
                break;
            case 8: // August
                if (day > 31) {
                    monthText = "August";
                }
                break;
            case 9: // September
                if (day > 30) {
                    monthText = "September";
                }
                break;
            case 10: // October
                if (day > 31) {
                    monthText = "October";
                }
                break;
            case 11: // November
                if (day > 30) {
                    monthText = "November";
                }
                break;
            case 12: // December
                if (day > 31) {
                    monthText = "December";
                }
                break;
        }

        if (monthText != null) {
            throw new IllegalDateException(String.format("ERROR: day cannot be larger" +
                    "than the number of days in %s.", monthText));
        }
    }

}
