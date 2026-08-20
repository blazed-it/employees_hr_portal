package com.abhinab_blitz.hr_portal.dto;

public record EmployeeFinancialUpdateRequestDto(
    String accountNumber,
    String bankName,
    String ifscCode,
    String panNumber,
    String aadharNumber,
    String address
) {
}
