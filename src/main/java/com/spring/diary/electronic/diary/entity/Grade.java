package com.spring.diary.electronic.diary.entity;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column(name = "grade")
    private String nameOfGrade;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "grade")
    private Collection<User> users;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "grade")
    private Collection<TimeTable> timeTables;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "grade")
    private Collection<Homework> homeworkCollection;

    public Grade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int idClasses) {
        this.id = idClasses;
    }

    public String getNameOfGrade() {
        return nameOfGrade;
    }

    public void setNameOfGrade(String className) {
        this.nameOfGrade = className;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public Collection<TimeTable> getTimeTables() {
        return timeTables;
    }

    public void setTimeTables(Collection<TimeTable> timeTables) {
        this.timeTables = timeTables;
    }

    public Collection<Homework> getHomeworkCollection() {
        return homeworkCollection;
    }

    public void setHomeworkCollection(Collection<Homework> homeworkCollection) {
        this.homeworkCollection = homeworkCollection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return id == grade.id && Objects.equals(grade, grade.nameOfGrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfGrade);
    }
}
