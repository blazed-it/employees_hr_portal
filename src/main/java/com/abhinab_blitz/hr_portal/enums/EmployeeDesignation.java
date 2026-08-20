package com.abhinab_blitz.hr_portal.enums;

public enum EmployeeDesignation {
    SOFTWARE_ENGINEER("Software Engineer"),
    SENIOR_SOFTWARE_ENGINEER("Senior Software Engineer"),
    TECH_LEAD("Tech Lead"),
    MANAGER("Manager"),
    SENIOR_MANAGER("Senior Manager"),
    DIRECTOR("Director"),
    VICE_PRESIDENT("Vice President"),
    PRESIDENT("President"),
    CEO("CEO");

    private final String designation;

    EmployeeDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }
}
