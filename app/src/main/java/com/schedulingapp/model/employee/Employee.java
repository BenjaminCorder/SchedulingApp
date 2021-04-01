package com.schedulingapp.model.employee;

import com.schedulingapp.misc.Gender;
import com.schedulingapp.model.payperiod.PayPeriod;

/**
 * Class Employee
 *  @author Benjamin Corder, Cami Wallace
 */
abstract public class Employee {

    //
    // Fields
    //

    protected String firstName;
    protected String lastName;
    protected Gender gender;
    protected String email;
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
     * Get the value of firstName
     *
     * @return the value of name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Get the value of lastName
     *
     * @return the value of name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of their first name
     *
     * @param newVar the new value of name
     */
    public void setFirstName(String newVar) {
        firstName = newVar;
    }
    /**
     * Set the value of name
     *
     * @param newVar the new value of name
     */
    public void setLastName(String newVar) {
        lastName = newVar;
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail(){return email;}
    /**
     * set the value of email
     *
     * @param newVar the new value of email
     */
    public void setEmail(String newVar){
        email = newVar;
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
