package com.spring.diary.electronic.diary.entity;

import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "homework")
public class Homework {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column(name = "homework")
    private String textOfHomework;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "grade_id")
    private Grade grade;

    public Homework() {
    }

    public int getId() {
        return id;
    }

    public void setId(int idHomework) {
        this.id = idHomework;
    }

    public String getTextOfHomework() {
        return textOfHomework;
    }

    public void setTextOfHomework(String textOfHomework) {
        this.textOfHomework = textOfHomework;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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
        Homework homework = (Homework) o;
        return id == homework.id && Objects.equals(textOfHomework, homework.textOfHomework) && Objects.equals(date, homework.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, textOfHomework, date);
    }
}
