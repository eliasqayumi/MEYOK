package com.example.meyok.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "department_students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentStudents {
    @Id
    @Column(name = "student_no", nullable = false, length = 10)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tc_no", nullable = false)
    private Student tcNo;

    @Column(name = "entrance_date", nullable = false)
    private LocalDate entranceDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;



}