package com.example.meyok.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "students_take_subject")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentsTakeSubject {
    @EmbeddedId
    private StudentsTakeSubjectId id;

    @MapsId("studentNo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "student_no", nullable = false)
    private DepartmentStudent studentNo;

    @MapsId("subjectId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @MapsId("termId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "term_id", nullable = false)
    private Term term;


}