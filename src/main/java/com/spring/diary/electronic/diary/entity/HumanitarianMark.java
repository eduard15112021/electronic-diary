package com.spring.diary.electronic.diary.entity;

import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "humanitarian_sbjts_mark")
public class HumanitarianMark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column(name = "mark")
    private int mark;

    @Column(name = "date")
    private LocalDate dateOfMark;

    @Column(name = "comment")
    private String comment;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "student_id")
    private User student;

    public HumanitarianMark() {
    }

    public int getId() {
        return id;
    }

    public void setId(int idOfMark) {
        this.id = idOfMark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public LocalDate getDateOfMark() {
        return dateOfMark;
    }

    public void setDateOfMark(LocalDate dateOfMark) {
        this.dateOfMark = dateOfMark;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanitarianMark marks = (HumanitarianMark) o;
        return id == marks.id && mark == marks.mark && Objects.equals(dateOfMark, marks.dateOfMark) && Objects.equals(comment, marks.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, dateOfMark, comment);
    }
}
