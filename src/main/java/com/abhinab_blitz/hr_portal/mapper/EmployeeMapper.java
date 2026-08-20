package com.abhinab_blitz.hr_portal.mapper;

import com.abhinab_blitz.hr_portal.dto.PublicEmployeeResponseDto;
import com.abhinab_blitz.hr_portal.enums.EmployeeStatus;
import com.abhinab_blitz.hr_portal.models.Employee;

public class EmployeeMapper {
    public static PublicEmployeeResponseDto toDto(Employee employee) {
        return new PublicEmployeeResponseDto(
            employee.getCompanyEmployeeId(),
            employee.getFirstName() + " " + employee.getLastName(),
            employee.getCompanyEmail(),
            employee.getPhoneNumber(),
            employee.getStatus().name(),
            employee.getDepartment().name(),
            employee.getStatus()
        );
    }

    public static Employee toEntity(PublicEmployeeResponseDto employeeDto) {
        Employee employee = new Employee();
        employee.setCompanyEmployeeId(employeeDto.companyEmployeeId());
        String[] nameParts = employeeDto.name().split(" ", 2);
        employee.setFirstName(nameParts[0]);
        if (nameParts.length > 1) {
            employee.setLastName(nameParts[1]);
        }
        employee.setCompanyEmail(employeeDto.companyEmail());
        employee.setPhoneNumber(employeeDto.phoneNumber());
        employee.setStatus(EmployeeStatus.valueOf(employeeDto.status().name().toUpperCase()));
        return employee;
    }
}
