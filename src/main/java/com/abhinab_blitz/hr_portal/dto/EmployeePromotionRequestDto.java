package com.abhinab_blitz.hr_portal.dto;

import com.abhinab_blitz.hr_portal.enums.EmployeeDepartment;
import com.abhinab_blitz.hr_portal.enums.EmployeeDesignation;

public record EmployeePromotionRequestDto(
    EmployeeDesignation designation,
    EmployeeDepartment department,
    String reportingManagerId,
    String team,
    String companyEmail
) {
}
