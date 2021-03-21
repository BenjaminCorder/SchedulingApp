package com.schedulingapp.interactor;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.schedulingapp.misc.EmploymentType;
import com.schedulingapp.misc.Gender;

import java.io.IOException;

public class ScheduleInteractor {
    //
    // Fields
    //

    private Spreadsheet schedule;
    private EmployeeInteractor employeeInteractor;

    //
    // Constructors
    //

    public ScheduleInteractor(Sheets service) throws IOException {
        this.schedule = new CreateScheduleInteractor(service).uploadSchedule();
    }

    //
    // Public Methods
    //

    public void addEmployee(EmploymentType employmentType,
                            String firstName, String lastName, Gender gender) {
        employeeInteractor.createNewEmployee(employmentType, firstName,
                lastName, gender);
        updateScheduleForEmployees();
    }

    //
    // Private Methods
    //

    public void updateScheduleForEmployees() {

    }
}
