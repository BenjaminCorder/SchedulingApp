package com.schedulingapp.model.employee;

import com.schedulingapp.misc.Date;

import java.util.List;
import java.util.Map;

/**
 * Class Availability
 */
public class Availability {

    //
    // Fields
    //

    private Date startDate;
    private List<Boolean> availabilities;

    //
    // Constructors
    //
    public Availability(com.schedulingapp.misc.Date startDate) {
    }

    public Availability(com.schedulingapp.model.employee.Availability rhs) {
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
     * Set the value of startDate
     *
     * @param newVar the new value of startDate
     */
    public void setStartDate(Date newVar) {
        startDate = newVar;
    }

    /**
     * Get the value of availabilities
     *
     * @return the value of availabilities
     */
    public List<Boolean> getAvailabilities() {
        return availabilities;
    }

    /**
     * Set the value of availabilities
     *
     * @param newVar the new value of availabilities
     */
    public void setAvailabilities(List<Boolean> newVar) {
        availabilities = newVar;
    }

    //
    // Other methods
    //

    /**
     * @param date
     * @return boolean
     */
    public boolean checkAvailability(com.schedulingapp.misc.Date date) {
        return true;
    }


    /**
     * @param dates
     * @return List<Boolean>
     */
    public List<Boolean> bulkCheckAvailability(List<Date> dates) {
        return null;
    }


    /**
     * @param date
     * @param isAvailable
     */
    public void updateAvailability(com.schedulingapp.misc.Date date, boolean isAvailable) {
    }


    /**
     * @param dates
     */
    public void bulkUpdateAvailability(Map<Date, Boolean> dates) {
    }


    /**
     * @param date
     * @return int
     */
    private int dateToIndex(com.schedulingapp.misc.Date date) {
        return 0;
    }


}
