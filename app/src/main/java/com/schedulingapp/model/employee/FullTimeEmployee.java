package com.schedulingapp.model.employee;

import com.schedulingapp.misc.Gender;
import com.schedulingapp.model.payperiod.PayPeriod;

/**
 * Class FullTimeEmployee
 */
public class FullTimeEmployee extends Employee {

    //
    // Fields
    //

    private PayPeriod schedule;

    //
    // Constructors
    //

    /**
     * @param name
     * @param gender
     */
    public FullTimeEmployee(String name, Gender gender) {
    }

    /**
     * @param rhs
     */
    public FullTimeEmployee(FullTimeEmployee rhs) {
    }

    //
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Get the value of schedule
     *
     * @return the value of schedule
     */
    public PayPeriod getSchedule() {
        return schedule;
    }

    /**
     * Set the value of schedule
     *
     * @param schedule the new value of schedule
     */
    public void setSchedule(PayPeriod schedule) {
        this.schedule = schedule;
    }

    //
    // Other methods
    //

    /**
     *
     */
    @Override
    protected void validate() {
    }


}
