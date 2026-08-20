package com.abhinab_blitz.hr_portal.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abhinab_blitz.hr_portal.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
    Employee findByCompanyEmployeeId(String companyEmployeeId);
    Employee findByCompanyEmail(String companyEmail);
    Employee findByPhoneNumber(String phoneNumber);
    Employee findByFirstName(String firstName);
}
