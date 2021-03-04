package com.schedulingapp.model.employee;

import com.schedulingapp.misc.EmploymentType;
import com.schedulingapp.misc.Gender;
import com.schedulingapp.misc.exceptions.IllegalDateException;
import com.schedulingapp.model.payperiod.PayPeriod;

/**
 * A class representing a full time employee.
 *
 * @author Benjamin Corder
 * @version 1.0
 * @since 1.0
 * @see com.schedulingapp.model.employee.Employee
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
     * Non-Default Constructor.
     *
     * @param firstName first name of employee.
     * @param lastName last name of employee.
     * @param gender gender of employee.
     */
    public FullTimeEmployee(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    /**
     * Copy Constructor.
     *
     * @param rhs object to create a copy of.
     */
    public FullTimeEmployee(FullTimeEmployee rhs) throws IllegalDateException {
        super(rhs);
    }

    //
    // Methods
    //

    /**
     * Returns the employment type of the employee.
     *
     * @return employment type of employee.
     */
    @Override
    public EmploymentType getEmploymentType() {
        return EmploymentType.FULL_TIME;
    }

    /**
     * Returns the maximum number of hours the employee can work in a week.
     *
     * @return the maximum number of hours the employee can work in a week.
     */
    @Override
    public int getMaxHours() {
        return 40;
    }

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
     * Ensures that the member variables of the current object make sense.
     */
    @Override
    protected void validate() {
    }


}
