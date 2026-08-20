package com.abhinab_blitz.hr_portal.dto;

import com.abhinab_blitz.hr_portal.enums.EmployeeStatus;

public record EmployeeOffboardRequestDto(
    EmployeeStatus status,
    String offboardingDate
) {
    
}
