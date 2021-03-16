package com.schedulingapp.misc;

public enum EmploymentType {
    EMPLOYMENT_TYPE_UNSPECIFIED("EMPLOYMENT_TYPE_UNSPECIFIED"),
    FULL_TIME("FULL_TIME"),
    PART_TIME("PART_TIME"),
    RESERVE("RESERVE");

    private final String employmentType;

    EmploymentType() {
        this.employmentType = "EMPLOYMENT_TYPE_UNSPECIFIED";
    }

    EmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getEmploymentType() {
        return employmentType;
    }
}
