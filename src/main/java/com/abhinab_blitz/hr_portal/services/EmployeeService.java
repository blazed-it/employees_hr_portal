package com.abhinab_blitz.hr_portal.services;

import org.springframework.stereotype.Service;

import com.abhinab_blitz.hr_portal.dto.PublicEmployeeResponseDto;
import com.abhinab_blitz.hr_portal.mapper.EmployeeMapper;
import com.abhinab_blitz.hr_portal.repositories.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.repository = employeeRepository;
    }

    public PublicEmployeeResponseDto getEmployeeByCompanyEmployeeId(String companyEmployeeId) {
        return EmployeeMapper.toDto(repository.findByCompanyEmployeeId(companyEmployeeId));
    }

    public PublicEmployeeResponseDto onboardEmployee(PublicEmployeeResponseDto employee) {
        return EmployeeMapper.toDto(repository.save(EmployeeMapper.toEntity(employee)));
    }
}
