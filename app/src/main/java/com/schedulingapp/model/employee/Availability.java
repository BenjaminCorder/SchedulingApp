package com.schedulingapp.model.employee;

import com.schedulingapp.misc.Date;
import com.schedulingapp.misc.exceptions.DateOutOfBoundsException;
import com.schedulingapp.misc.exceptions.IllegalStartDateException;
import com.schedulingapp.model.shift.Shift;

import java.util.List;
import java.util.Map;

/**
 * A class representing the shifts an employee is available to work.
 *
 * @author Benjamin Corder
 * @version 1.0
 * @since 1.0
 */
public class Availability {

    //
    // Fields
    //

    private Date startDate;
    private Map<Shift, Boolean> availabilities;

    //
    // Constructors
    //

    /**
     * Non-Default Constructor.
     *
     * @param startDate Date that the period of availability begins on.
     * @throws IllegalStartDateException if date is not a valid start date.
     */
    public Availability(Date startDate) throws IllegalStartDateException {

    }

    /**
     * Copy Constructor.
     *
     * @param rhs Availability object to create a copy of.
     */
    public Availability(Availability rhs) {
        startDate = rhs.getStartDate();

        try {
            setAvailabilities(rhs.availabilities);
        } catch (DateOutOfBoundsException e) {
            // Should never throw an error
            e.printStackTrace();
        }
    }

    //
    // Methods
    //

    /**
     * Returns the availability that corresponds to the input shift.
     *
     * @param shift Shift to check availability against.
     * @return boolean representing if available to work the input shift.
     * @throws DateOutOfBoundsException if any shift in the input map corresponds to a
     *                                  date outside of the pay period the current object
     *                                  covers.
     */
    public boolean checkAvailability(Shift shift)
            throws DateOutOfBoundsException {
        return true;
    }


    /**
     * Returns the availability that corresponds to all input shifts.
     *
     * @param shifts List of shifts to check availability against
     * @return Map<Shift, Boolean> of every input shift as a key for its availability.
     * @throws DateOutOfBoundsException if any shift in the input map corresponds to a
     *                                  date outside of the pay period the current object
     *                                  covers.
     */
    public Map<Shift, Boolean> bulkCheckAvailability(List<Shift> shifts)
            throws DateOutOfBoundsException {
        return null;
    }


    /**
     * Sets the availability of the input shift to the input boolean.
     *
     * @param shift shift to set the availability of.
     * @param isAvailable new value for the availability corresponding to the input
     *                    shift.
     * @throws DateOutOfBoundsException if any shift in the input map corresponds to a
     *                                  date outside of the pay period the current object
     *                                  covers.
     */
    public void updateAvailability(Shift shift, boolean isAvailable)
            throws DateOutOfBoundsException {
    }


    /**
     * Sets the availability of the input shifts to their corresponding booleans.
     *
     * @param shifts map of shifts to set the availability of.
     * @throws DateOutOfBoundsException if any shift in the input map corresponds to a
     *                                  date outside of the pay period the current object
     *                                  covers.
     */
    public void bulkUpdateAvailability(Map<Shift, Boolean> shifts)
            throws DateOutOfBoundsException  {
    }

    //
    // Accessor methods
    //

    /**
     * Get the value of startDate.
     *
     * @return the value of startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Set the value of startDate.
     *
     * @param startDate the new value of startDate
     * @throws IllegalStartDateException if date is not a valid start date.
     */
    public void setStartDate(Date startDate) throws IllegalStartDateException {
        this.startDate = startDate;
    }

    /**
     * Get the value of availabilities.
     *
     * @return the value of availabilities
     */
    public Map<Shift, Boolean> getAvailabilities() {
        return availabilities;
    }

    /**
     * Set the value of availabilities.
     *
     * @param availabilities the new value of availabilities
     * @throws DateOutOfBoundsException if any shift in the input map corresponds to a
     *                                  date outside of the pay period the current object
     *                                  covers.
     */
    public void setAvailabilities(Map<Shift, Boolean> availabilities)
            throws DateOutOfBoundsException {
        // Save the current value of availabilities to a local variable.
        Map<Shift, Boolean> oldAvailabilities = this.availabilities;

        // Reset the current list of availabilities to the value.
        try {
            this.availabilities = createDefaultAvailability(startDate);
        } catch (IllegalStartDateException e) {
            // This case should never happen as startDate is always validated when set.
            e.printStackTrace();
        }

        // Bulk update the internal map of availabilities with the input map.
        try {
            bulkUpdateAvailability(availabilities);
        }
        catch (DateOutOfBoundsException exception) {
            // Reset the internal map of availabilities to its value before the function
            // was called.
            this.availabilities = oldAvailabilities;
            throw exception;
        }
    }

    //
    // Other methods
    //

    /**
     * Sets default values for the availability map member variable.
     *
     * @param startDate Day to start generating the availability map on.
     * @return A Map of availabilities with every shift in a pay period set to false.
     * @throws IllegalStartDateException if date is not a valid start date.
     */
    private Map<Shift, Boolean> createDefaultAvailability(Date startDate)
            throws IllegalStartDateException {
        return null;
    }

    /**
     * Checks to see if the input shift falls within the pay period covered by the
     * current object.
     *
     * @param shift shift to validate.
     * @throws DateOutOfBoundsException if shift corresponds to a date outside of the pay
     *                                  period the current object covers.
     */
    private void validateShift(Shift shift) throws DateOutOfBoundsException {

    }

    /**
     * Checks to see whether the input date is a valid start date for a pay period.
     *
     * @param date date to validate.
     * @throws IllegalStartDateException if date is not a valid start date.
     */
    private void validateStartDate(Date date) throws IllegalStartDateException {

    }
}
