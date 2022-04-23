package com.example.meyok.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class StudentsTakeSubjectId implements Serializable {
    private static final long serialVersionUID = -4312072587522520055L;
    @Column(name = "student_no", nullable = false, length = 10)
    private String studentNo;
    @Column(name = "subject_id", nullable = false, length = 10)
    private String subjectId;
    @Column(name = "term_id", nullable = false, length = 10)
    private String termId;
    @Column(name = "entrance_date", nullable = false)
    private LocalDate entranceDate;
    @Column(name = "finish_date", nullable = false)
    private LocalDate finishDate;

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public LocalDate getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(LocalDate entranceDate) {
        this.entranceDate = entranceDate;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(termId, studentNo, finishDate, subjectId, entranceDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        StudentsTakeSubjectId entity = (StudentsTakeSubjectId) o;
        return Objects.equals(this.termId, entity.termId) &&
                Objects.equals(this.studentNo, entity.studentNo) &&
                Objects.equals(this.finishDate, entity.finishDate) &&
                Objects.equals(this.subjectId, entity.subjectId) &&
                Objects.equals(this.entranceDate, entity.entranceDate);
    }
}