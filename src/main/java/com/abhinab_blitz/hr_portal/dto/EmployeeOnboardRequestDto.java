package com.abhinab_blitz.hr_portal.dto;

import com.abhinab_blitz.hr_portal.enums.EmployeeDepartment;
import com.abhinab_blitz.hr_portal.enums.EmployeeDesignation;

public record EmployeeOnboardRequestDto(
        String firstName,
        String middleName,
        String lastName,
        String personalEmail,
        String phoneNumber,
        String dateOfBirth,
        String dateOfJoining,
        EmployeeDesignation designation,
        EmployeeDepartment department,
        String reportingManagerId // The UUID of their boss
    ) {
}
