package com.abhinab_blitz.hr_portal.dto;

import com.abhinab_blitz.hr_portal.enums.EmployeeStatus;

public record PublicEmployeeResponseDto(
    String companyEmployeeId,
    String name,
    String companyEmail,
    String phoneNumber,
    String designation,
    String department,
    EmployeeStatus status) {
}
