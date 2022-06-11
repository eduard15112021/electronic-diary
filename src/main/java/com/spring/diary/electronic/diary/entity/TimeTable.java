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


    @Column(name = "day_of_week")
    private int dayOfWeek;

    @Column(name = "number_of_lesson")
    private int numberOfLesson;

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

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getNumberOfLesson() {
        return numberOfLesson;
    }

    public void setNumberOfLesson(int numberOfLesson) {
        this.numberOfLesson = numberOfLesson;
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
        TimeTable timeTable = (TimeTable) o;
        return id == timeTable.id && dayOfWeek == timeTable.dayOfWeek && numberOfLesson == timeTable.numberOfLesson && Objects.equals(subject, timeTable.subject) && Objects.equals(grade, timeTable.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dayOfWeek, numberOfLesson, subject, grade);
    }
}
