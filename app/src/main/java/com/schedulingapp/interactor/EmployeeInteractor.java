package com.schedulingapp.interactor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.schedulingapp.misc.EmploymentType;
import com.schedulingapp.misc.Gender;
import com.schedulingapp.model.employee.Employee;
import com.schedulingapp.factory.EmployeeFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeInteractor {
    //
    // Fields
    //

    private Map<String, Employee> employeeMap;
    private ObjectMapper mapper = new ObjectMapper();

    //
    // Constructors
    //

    /**
     * Default Constructor
     */
    public EmployeeInteractor() {
        employeeMap = new HashMap<String, Employee>();
    }

    //
    // Public Methods
    //

    public void createNewEmployee(EmploymentType employmentType,
                            String firstName, String lastName, Gender gender) {
        // Create the new Employee
        Employee employee = EmployeeFactory.getEmployee(employmentType,
                firstName, lastName, gender);

        // End here if we created a null employee
        if (employee == null) {
            return;
        }

        // Add the employee to the map
        employeeMap.put(employee.getFullName(), employee);
    }

    public void deserializeEmployees(String json) {
        try {
            // Read the json to a tree
            JsonNode rootNode = mapper.readTree(json);

            // Extract the fields from the tree
            Iterator<Map.Entry<String, JsonNode>> fields = rootNode.fields();

            // Loop through the top level fields
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> jsonField= fields.next();

                // Extract a JsonNode from the Entry
                JsonNode employeeNode = jsonField.getValue();

                // Create a new Employee
                createNewEmployee(employeeNode);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    public String serializeEmployees() {
        // Convert employeeMap to a JsonNode
        JsonNode node = mapper.convertValue(employeeMap, JsonNode.class);

        // Convert node to a JSON string and return said string
        return node.toPrettyString();
    }

    //
    // Other Methods
    //

    private void createNewEmployee(JsonNode employeeNode) {
        EmploymentType employmentType = EmploymentType.EMPLOYMENT_TYPE_UNSPECIFIED;

        // Extract employeeType from employeeNode
        if (employeeNode.get("employmentType").toString()
                .replace("\"", "").equals(
                EmploymentType.FULL_TIME.getEmploymentType())) {
            employmentType = EmploymentType.FULL_TIME;
        }

        // Handle case for a part time employee.
        else if (employeeNode.get("employmentType").toString()
                .replace("\"", "").equals(
                        EmploymentType.PART_TIME.getEmploymentType())) {
            employmentType = EmploymentType.PART_TIME;
        }

        // Handle case for a reserve employee.
        else if (employeeNode.get("employmentType").toString()
                .replace("\"", "").equals(
                        EmploymentType.RESERVE.getEmploymentType())) {
            employmentType = EmploymentType.RESERVE;
        }

        // Create the new Employee
        Employee employee = EmployeeFactory.getEmployee(employmentType,
                employeeNode);

        // End here if we created a null employee
        if (employee == null) {
            return;
        }

        // Add the employee to the map
        employeeMap.put(employee.getFullName(), employee);
    }

}
