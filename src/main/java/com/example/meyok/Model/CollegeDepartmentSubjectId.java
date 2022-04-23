package com.example.meyok.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CollegeDepartmentSubjectId implements Serializable {
    private static final long serialVersionUID = -1817311869983804874L;
    @Column(name = "col_dep_id", nullable = false, length = 10)
    private String colDepId;
    @Column(name = "subject_id", nullable = false, length = 10)
    private String subjectId;

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getColDepId() {
        return colDepId;
    }

    public void setColDepId(String colDepId) {
        this.colDepId = colDepId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colDepId, subjectId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CollegeDepartmentSubjectId entity = (CollegeDepartmentSubjectId) o;
        return Objects.equals(this.colDepId, entity.colDepId) &&
                Objects.equals(this.subjectId, entity.subjectId);
    }
}