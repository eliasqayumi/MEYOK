package com.example.meyok.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "college_department_employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CollegeDepartmentEmployee {
    @Id
    @Column(name = "cde_id", nullable = false, length = 10)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_no", nullable = false)
    private CollegeEmployee employeeNo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "expertise_id", nullable = false)
    private Expertise expertise;


}