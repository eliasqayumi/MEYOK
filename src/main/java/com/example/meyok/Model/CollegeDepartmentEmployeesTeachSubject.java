package com.example.meyok.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "college_department_employees_teach_subject")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CollegeDepartmentEmployeesTeachSubject {
    @EmbeddedId
    private CollegeDepartmentEmployeesTeachSubjectId id;

    @MapsId("subjectId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @MapsId("cdeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cde_id", nullable = false)
    private CollegeDepartmentEmployee cde;

    @MapsId("termId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "term_id", nullable = false)
    private Term term;


}