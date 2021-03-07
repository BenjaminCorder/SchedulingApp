package com.schedulingapp.model.employee;

import com.schedulingapp.misc.Gender;
import com.schedulingapp.model.payperiod.PayPeriod;

/**
 * Class Employee
 */
abstract public class Employee {

    //
    // Fields
    //

    protected String name;
    protected Gender gender;
    protected Availability availability;
    protected PayPeriod workSchedule;

    //
    // Constructors
    //
    public Employee() {
    }

    //
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param newVar the new value of name
     */
    public void setName(String newVar) {
        name = newVar;
    }

    /**
     * Get the value of gender
     *
     * @return the value of gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Set the value of gender
     *
     * @param newVar the new value of gender
     */
    public void setGender(Gender newVar) {
        gender = newVar;
    }

    /**
     * Get the value of availability
     *
     * @return the value of availability
     */
    public Availability getAvailability() {
        return availability;
    }

    /**
     * Set the value of availability
     *
     * @param newVar the new value of availability
     */
    public void setAvailability(Availability newVar) {
        availability = newVar;
    }

    /**
     * Get the value of workSchedule
     *
     * @return the value of workSchedule
     */
    public PayPeriod getWorkSchedule() {
        return workSchedule;
    }

    /**
     * Set the value of workSchedule
     *
     * @param newVar the new value of workSchedule
     */
    public void setWorkSchedule(PayPeriod newVar) {
        workSchedule = newVar;
    }

    //
    // Other methods
    //

    /**
     *
     */
    abstract protected void validate();

}
