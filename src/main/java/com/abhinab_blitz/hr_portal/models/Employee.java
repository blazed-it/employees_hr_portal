package com.abhinab_blitz.hr_portal.models;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.abhinab_blitz.hr_portal.enums.EmployeeDepartment;
import com.abhinab_blitz.hr_portal.enums.EmployeeDesignation;
import com.abhinab_blitz.hr_portal.enums.EmployeeStatus;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
@EntityListeners(AuditingEntityListener.class)
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @Column(unique = true, nullable = false)
  private String companyEmployeeId;
  @Column(unique = false, nullable = false)
  private String firstName;
  @Column(unique = false, nullable = true)
  private String middleName;
  @Column(unique = false, nullable = false)
  private String lastName;
  @Column(unique = true, nullable = false)
  private String personalEmail;
  @Column(unique = true, name = "official_email", nullable = false)
  private String companyEmail;
  @Column(unique = true, nullable = true)
  private String phoneNumber;
  @Column(unique = true, nullable = true)
  private String accountNumber;
  @Column(unique = false, nullable = true)
  private String ifscCode;
  @Column(unique = true, nullable = true)
  private String panNumber;
  @Column(unique = true, nullable = true)
  private String aadharNumber;
  @Column(unique = false, nullable = false)
  private String dateOfBirth;
  @Column(unique = false, nullable = false)
  private String dateOfJoining;
  @Column(unique = false, nullable = true)
  private String dateOfLeaving;
  @Column(unique = false, nullable = false)
  @Enumerated(EnumType.STRING)
  private EmployeeDesignation designation;
  @Column(unique = false, nullable = false)
  @Enumerated(EnumType.STRING)
  private EmployeeDepartment department;
  @Column(unique = false, nullable = false)
  @Enumerated(EnumType.STRING)
  private EmployeeStatus status;
  @Column(unique = false, nullable = true)
  private String address;
  @ManyToOne
  @JoinColumn(name = "reporting_manager_id")
  @Nullable
  private Employee reportingManager;
  @ManyToOne
  @JoinColumn(name = "hr_manager_id")
  @Nullable
  private Employee hrManager;
  @Column(unique = false, nullable = true)
  private String team;
  @ManyToOne
  @JoinColumn(name = "team_lead_id")
  @Nullable
  private Employee teamLead;
  @Nullable
  @ManyToOne
  @JoinColumn(name = "team_manager_id")
  private Employee teamManager;
  @Nullable
  @OneToMany(mappedBy = "reportingManager", fetch = FetchType.LAZY)
  private List<Employee> directReports;
  @OneToMany(mappedBy = "hrManager", fetch = FetchType.LAZY)
  private List<Employee> hrReports;
  @OneToMany(mappedBy = "teamManager", fetch = FetchType.LAZY)
  private List<Employee> teamReports;
  @OneToMany(mappedBy = "teamLead", fetch = FetchType.LAZY)
  private List<Employee> teammates;

  // @CreatedBy
  // private String createdBy;
  // @LastModifiedBy
  // private String updatedBy;
  @Column(unique = false, nullable = false)
  @CreatedDate
  private LocalDate createdAt;
  @LastModifiedDate
  @Column(unique = false, nullable = false)
  private LocalDate updatedAt;
}
