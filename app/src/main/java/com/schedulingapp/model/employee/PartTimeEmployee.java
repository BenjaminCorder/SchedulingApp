package com.schedulingapp.model.employee;

import com.fasterxml.jackson.databind.JsonNode;
import com.schedulingapp.misc.EmploymentType;
import com.schedulingapp.misc.Gender;
import com.schedulingapp.exceptions.IllegalDateException;
import com.schedulingapp.model.payperiod.PayPeriod;

/**
 * A class representing a part time employee.
 *
 * @author Benjamin Corder
 * @version 1.0
 * @since 1.0
 * @see com.schedulingapp.model.employee.Employee
 */
public class PartTimeEmployee extends Employee {

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
    public PartTimeEmployee(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    public PartTimeEmployee(JsonNode employeeNode) {
        super(employeeNode);
    }

    /**
     * Copy Constructor.
     *
     * @param rhs object to create a copy of.
     */
    public PartTimeEmployee(FullTimeEmployee rhs) throws IllegalDateException {
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
        return EmploymentType.PART_TIME;
    }

    /**
     * Returns the maximum number of hours the employee can work in a week.
     *
     * @return the maximum number of hours the employee can work in a week.
     */
    @Override
    public int getMaxHours() {
        return 30;
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
