package com.schedulingapp.model.employee;

import com.schedulingapp.misc.EmploymentType;
import com.schedulingapp.misc.Gender;

/**
 * A class representing a reserve employee.
 *
 * @author Benjamin Corder
 * @version 1.0
 * @since 1.0
 * @see com.schedulingapp.model.employee.Employee
 */
public class ReserveEmployee extends Employee {

    //
    // Fields
    //


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
    public ReserveEmployee(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    /**
     * Copy Constructor.
     *
     * @param rhs object to create a copy of.
     */
    public ReserveEmployee(FullTimeEmployee rhs) {
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
        return EmploymentType.RESERVE;
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
