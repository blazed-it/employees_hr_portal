package com.abhinab_blitz.hr_portal.enums;

public enum EmployeeDepartment {
    HR ("HR"),
    ENGINEERING ("ENGINEERING"),
    SALES ("SALES"),
    MARKETING ("MARKETING"),
    FINANCE ("FINANCE"),
    OPERATIONS ("OPERATIONS");

    private final String department;

    EmployeeDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
