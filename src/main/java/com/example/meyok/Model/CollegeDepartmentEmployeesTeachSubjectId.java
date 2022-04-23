package com.example.meyok.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class CollegeDepartmentEmployeesTeachSubjectId implements Serializable {
    private static final long serialVersionUID = -1712899982765679359L;
    @Column(name = "subject_id", nullable = false, length = 10)
    private String subjectId;
    @Column(name = "cde_id", nullable = false, length = 10)
    private String cdeId;
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

    public String getCdeId() {
        return cdeId;
    }

    public void setCdeId(String cdeId) {
        this.cdeId = cdeId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(termId, finishDate, cdeId, subjectId, entranceDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CollegeDepartmentEmployeesTeachSubjectId entity = (CollegeDepartmentEmployeesTeachSubjectId) o;
        return Objects.equals(this.termId, entity.termId) &&
                Objects.equals(this.finishDate, entity.finishDate) &&
                Objects.equals(this.cdeId, entity.cdeId) &&
                Objects.equals(this.subjectId, entity.subjectId) &&
                Objects.equals(this.entranceDate, entity.entranceDate);
    }
}