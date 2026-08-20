package com.abhinab_blitz.hr_portal.controllers;

import com.abhinab_blitz.hr_portal.dto.PublicEmployeeResponseDto;
import com.abhinab_blitz.hr_portal.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PutExchange;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService employeeService) {
        this.service = employeeService;
    }

    @GetMapping("/{companyEmployeeId}")
    public ResponseEntity<PublicEmployeeResponseDto> getEmployeeById(@PathVariable("companyEmployeeId") String id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getEmployeeByCompanyEmployeeId(id));
    }

    @PostMapping("/")
    public ResponseEntity<PublicEmployeeResponseDto> onboardEmployee(@RequestBody PublicEmployeeResponseDto employee) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.onboardEmployee(employee));
    }

    @PutExchange("/")
    public ResponseEntity<PublicEmployeeResponseDto> updateInformation(@RequestBody PublicEmployeeResponseDto employee) {
        return ResponseEntity.status(HttpStatus.OK).body(service.updateInformation(employee));
    }
}
