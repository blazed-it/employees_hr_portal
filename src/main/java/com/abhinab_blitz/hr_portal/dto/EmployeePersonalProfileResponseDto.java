package com.abhinab_blitz.hr_portal.dto;

public record EmployeePersonalProfileResponseDto(
    String companyEmployeeId,
    String name,
    String companyEmail,
    String phoneNumber,
    String status,
    // Financial & Personal details below
    String accountNumber,
    String bankName,
    String ifscCode,
    String panNumber,
    String aadharNumber,
    String address
) {}