package com.abhinab_blitz.hr_portal.enums;

public enum EmployeeStatus {
    ACTIVE ("ACTIVE"),
    INACTIVE ("INACTIVE"),
    TERMINATED ("TERMINATED");

    private final String status;

    EmployeeStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
