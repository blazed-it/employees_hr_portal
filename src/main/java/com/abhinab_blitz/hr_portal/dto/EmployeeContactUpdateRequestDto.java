package com.abhinab_blitz.hr_portal.dto;

public record EmployeeContactUpdateRequestDto(
    String phoneNumber,
    String address,
    String personalEmail
) {
    
}
