package com.abhinab_blitz.hr_portal.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  @Id
  private int id;
  @Column(unique = true)
  private String companyEmployeeId;
  private String firstName;
  private String middleName;
  private String lastName;
  private String personalEmail;
  @Column(unique = true)
  private String companyEmail;
  @Column(unique = true)
  private String phoneNumber;
  
}
