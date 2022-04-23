package com.example.meyok.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "college_department_subject")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CollegeDepartmentSubject {
    @EmbeddedId
    private CollegeDepartmentSubjectId id;

    @MapsId("colDepId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "col_dep_id", nullable = false)
    private CollegeDepartment colDep;

    @MapsId("subjectId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;


}