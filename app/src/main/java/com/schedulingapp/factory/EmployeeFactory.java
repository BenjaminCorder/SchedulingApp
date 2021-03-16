package com.schedulingapp.factory;

import com.fasterxml.jackson.databind.JsonNode;
import com.schedulingapp.misc.EmploymentType;
import com.schedulingapp.misc.Gender;
import com.schedulingapp.model.employee.Employee;
import com.schedulingapp.model.employee.FullTimeEmployee;
import com.schedulingapp.model.employee.PartTimeEmployee;
import com.schedulingapp.model.employee.ReserveEmployee;

/**
 * A class used to initialize the subclasses of the Employee class.
 *
 * @author Ben Corder
 * @version 1.0
 * @since 1.0
 */
public class EmployeeFactory {
    //
    // Methods
    //

    /**
     * Returns an instance of the child of the Employee class that corresponds to the
     * input EmploymentType Enum.
     *
     * @param employmentType type of Employee to create.
     * @param firstName first name of the Employee.
     * @param lastName last name of the Employee.
     * @param gender gender name of the Employee.
     * @return an instance of the child of the Employee class that corresponds to the
     *         input EmploymentType Enum.
     */
    public static Employee getEmployee(EmploymentType employmentType,
                                String firstName, String lastName, Gender gender) {
        // Handle case for a full time employee.
        if (employmentType == EmploymentType.FULL_TIME) {
            return new FullTimeEmployee(firstName, lastName, gender);
        }

        // Handle case for a part time employee.
        else if (employmentType == EmploymentType.PART_TIME) {
            return new PartTimeEmployee(firstName, lastName, gender);
        }

        // Handle case for a reserve employee.
        else if (employmentType == EmploymentType.RESERVE) {
            return new ReserveEmployee(firstName, lastName, gender);
        }

        // Handle case where nothing was specified
        return null;
    }

    public static Employee getEmployee(EmploymentType employmentType,
                                       JsonNode employeeNode) {
        if (employmentType == EmploymentType.FULL_TIME) {
            return new FullTimeEmployee(employeeNode);
        }

        // Handle case for a part time employee.
        else if (employmentType == EmploymentType.PART_TIME) {
            return new PartTimeEmployee(employeeNode);
        }

        // Handle case for a reserve employee.
        else if (employmentType == EmploymentType.RESERVE) {
            return new ReserveEmployee(employeeNode);
        }

        // Handle case where nothing was specified
        return null;
    }
}
