package com.schedulingapp.model.employee;

import com.fasterxml.jackson.databind.JsonNode;
import com.schedulingapp.misc.EmploymentType;
import com.schedulingapp.misc.Gender;
import com.schedulingapp.exceptions.IllegalDateException;
import com.schedulingapp.model.payperiod.PayPeriod;

/**
 * An abstract class representing all common traits across all types of employees.
 *
 * @author Benjamin Corder
 * @version 1.0
 * @since 1.0
 */
abstract public class Employee {

    //
    // Fields
    //

    protected final String firstName;
    protected String lastName;
    protected final Gender gender;
    protected Availability availability;
    protected PayPeriod workSchedule;
    protected boolean isApprovedOvertime;

    //
    // Constructors
    //

    /**
     * Non-Default Constructor.
     *
     * @param firstName firstName of the employee.
     * @param lastName lastName of the employee.
     * @param gender gender of the employee.
     */
    public Employee(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        isApprovedOvertime = false;
        validate();
    }

    public Employee(JsonNode employeeNode) {
        // Extract all information from the employeeNode
        firstName = employeeNode.get("firstName").toString()
                .replace("\"", "");

        lastName = employeeNode.get("lastName").toString()
                .replace("\"", "");

        switch(employeeNode.get("gender").toString()
                .replace("\"", "")) {
            case "MALE":
                gender = Gender.MALE;
                break;
            case "FEMALE":
                gender = Gender.FEMALE;
                break;
            default:
                gender = Gender.GENDER_UNSPECIFIED;
                break;
        }

        if (employeeNode.get("availability") != null) {
            availability = new Availability(employeeNode.get("availability"));
        }

        if (employeeNode.get("availability") != null) {
            availability = new Availability(employeeNode.get("availability"));
        }

        isApprovedOvertime = "true".equals(employeeNode.get("isApprovedOvertime")
                .toString().replace("\"", ""));
    }

    /**
     * Copy Constructor.
     *
     * @param rhs object to make a copy of.
     */
    public Employee(Employee rhs) throws IllegalDateException {
        this.firstName = rhs.getFirstName();
        this.lastName = rhs.getLastName();
        gender = rhs.getGender();
        availability = new Availability(rhs.getAvailability());
        workSchedule = new PayPeriod(rhs.getWorkSchedule());
        isApprovedOvertime = false;

        // Redundant validation
        validate();
    }

    //
    // Methods
    //

    /**
     * Returns the full name of the employee.
     *
     * @return the value of name.
     */
    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

    //
    // Accessor methods
    //

    /**
     * Get the value firstName.
     *
     * @return the value of firstName.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get the value lastName.
     *
     * @return the value of lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of lastName.
     *
     * @param lastName the new value of lastName.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the value of gender.
     *
     * @return the value of gender.
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Get the value of availability.
     *
     * @return the value of availability.
     */
    public Availability getAvailability() {
        return availability;
    }

    /**
     * Set the value of availability.
     *
     * @param availability the new value of availability.
     */
    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    /**
     * Get the value of workSchedule.
     *
     * @return the value of workSchedule.
     */
    public PayPeriod getWorkSchedule() {
        return workSchedule;
    }

    /**
     * Set the value of workSchedule.
     *
     * @param workSchedule the new value of workSchedule.
     */
    public void setWorkSchedule(PayPeriod workSchedule) {
        this.workSchedule = workSchedule;
    }

    /**
     * Get the value of isApprovedOvertime.
     *
     * @return the value of isApprovedOvertime.
     */
    public boolean getIsApprovedOvertime() {
        return isApprovedOvertime;
    }

    /**
     * Set the value of isApprovedOvertime.
     *
     * @param isApprovedOvertime the new value of isApprovedOvertime.
     */
    public void setIsApprovedOvertime(boolean isApprovedOvertime) {
        this.isApprovedOvertime = isApprovedOvertime;
    }

    //
    // Other methods
    //

    /**
     * Returns the employment type of the employee.
     *
     * @return employment type of employee.
     */
    abstract public EmploymentType getEmploymentType();

    /**
     * Returns the maximum number of hours the employee can work in a week.
     *
     * @return the maximum number of hours the employee can work in a week.
     */
    abstract public int getMaxHours();

    /**
     * Ensures that the member variables of the current object make sense.
     */
    abstract protected void validate();

}
