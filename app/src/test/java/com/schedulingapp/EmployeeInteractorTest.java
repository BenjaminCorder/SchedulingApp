package com.schedulingapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.schedulingapp.interactor.EmployeeInteractor;
import com.schedulingapp.misc.EmploymentType;
import com.schedulingapp.misc.Gender;

import org.junit.Test;

public class EmployeeInteractorTest {
    private final ObjectMapper mapper = new ObjectMapper();
    private final String jsonInput = new String("{\n" +
            "  \"George Washington\" : {\n" +
            "    \"firstName\" : \"George\",\n" +
            "    \"lastName\" : \"Washington\",\n" +
            "    \"gender\" : \"MALE\",\n" +
            "    \"availability\" : null,\n" +
            "    \"workSchedule\" : null,\n" +
            "    \"isApprovedOvertime\" : false,\n" +
            "    \"schedule\" : null,\n" +
            "    \"employmentType\" : \"FULL_TIME\",\n" +
            "    \"maxHours\" : 40,\n" +
            "    \"fullName\" : \"George Washington\"\n" +
            "  },\n" +
            "  \"Theodore Roosevelt\" : {\n" +
            "    \"firstName\" : \"Theodore\",\n" +
            "    \"lastName\" : \"Roosevelt\",\n" +
            "    \"gender\" : \"MALE\",\n" +
            "    \"availability\" : null,\n" +
            "    \"workSchedule\" : null,\n" +
            "    \"isApprovedOvertime\" : false,\n" +
            "    \"employmentType\" : \"RESERVE\",\n" +
            "    \"maxHours\" : 30,\n" +
            "    \"fullName\" : \"Theodore Roosevelt\"\n" +
            "  },\n" +
            "  \"Abraham Lincoln\" : {\n" +
            "    \"firstName\" : \"Abraham\",\n" +
            "    \"lastName\" : \"Lincoln\",\n" +
            "    \"gender\" : \"MALE\",\n" +
            "    \"availability\" : null,\n" +
            "    \"workSchedule\" : null,\n" +
            "    \"isApprovedOvertime\" : false,\n" +
            "    \"schedule\" : null,\n" +
            "    \"employmentType\" : \"PART_TIME\",\n" +
            "    \"maxHours\" : 30,\n" +
            "    \"fullName\" : \"Abraham Lincoln\"\n" +
            "  }\n" +
            "}");

    @Test
    public void employeeValidator_serializeEmployeesTest() {
        EmployeeInteractor employeeInteractor = new EmployeeInteractor();

        employeeInteractor.createNewEmployee(
                EmploymentType.FULL_TIME,
                "George", "Washington", Gender.MALE);

        employeeInteractor.createNewEmployee(
                EmploymentType.PART_TIME,
                "Abraham", "Lincoln", Gender.MALE);

        employeeInteractor.createNewEmployee(
                EmploymentType.RESERVE,
                "Theodore", "Roosevelt", Gender.MALE);

        System.out.print(employeeInteractor.serializeEmployees());
    }

    @Test
    public void employeeValidator_deserializeEmployeesTest() {
        EmployeeInteractor employeeInteractor = new EmployeeInteractor();

        employeeInteractor.deserializeEmployees(jsonInput);

        System.out.print(employeeInteractor.serializeEmployees());
    }
}
