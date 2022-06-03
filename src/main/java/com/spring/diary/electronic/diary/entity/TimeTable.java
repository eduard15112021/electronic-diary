package com.spring.diary.electronic.diary.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "timetable")
public class TimeTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "quarter")
    private int quarter;

    @Column(name = "date_first_in_quarter")
    private LocalDate dateOfFirstInQuarter;

    @Column(name = "date_lastin_quarter")
    private LocalDate dateOfLastInQuarter;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "grade_id")
    private Grade grade;

    public TimeTable() {
    }

    public int getId() {
        return id;
    }

    public void setId(int idOfTable) {
        this.id = idOfTable;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public LocalDate getDateOfFirstInQuarter() {
        return dateOfFirstInQuarter;
    }

    public void setDateOfFirstInQuarter(LocalDate dateOfFirst) {
        this.dateOfFirstInQuarter = dateOfFirst;
    }

    public LocalDate getDateOfLastInQuarter() {
        return dateOfLastInQuarter;
    }

    public void setDateOfLastInQuarter(LocalDate dateOfLast) {
        this.dateOfLastInQuarter = dateOfLast;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeTable table = (TimeTable) o;
        return id == table.id && quarter == table.quarter && Objects.equals(dateOfFirstInQuarter, table.dateOfFirstInQuarter) && Objects.equals(dateOfLastInQuarter, table.dateOfLastInQuarter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quarter, dateOfFirstInQuarter, dateOfLastInQuarter);
    }
}
