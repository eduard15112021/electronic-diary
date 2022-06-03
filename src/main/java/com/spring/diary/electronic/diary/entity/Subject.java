package com.spring.diary.electronic.diary.entity;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column(name = "subject")
    private String nameOfSubject;

    @Column(name = "abbreviation")
    private String abbreviation;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "subject")
    private Collection<Homework> homeworkCollection;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "subject")
    private Collection<ExactMark> exactMarkCollection;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "subject")
    private Collection<HumanitarianMark> humanitarianMarkCollection;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "subject")
    private Collection<LanguageMark> languageMarkCollection;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "subject")
    private Collection<MaterialMark> materialMarkCollection;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "subject")
    private Collection<NativeMark> nativeMarkCollection;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "subject")
    private Collection<TimeTable> timeTables;

    public Subject() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Collection<Homework> getHomeworkCollection() {
        return homeworkCollection;
    }

    public void setHomeworkCollection(Collection<Homework> homeworkCollection) {
        this.homeworkCollection = homeworkCollection;
    }

    public Collection<ExactMark> getExactMarkCollection() {
        return exactMarkCollection;
    }

    public void setExactMarkCollection(Collection<ExactMark> exactMarkCollection) {
        this.exactMarkCollection = exactMarkCollection;
    }

    public Collection<HumanitarianMark> getHumanitarianMarkCollection() {
        return humanitarianMarkCollection;
    }

    public void setHumanitarianMarkCollection(Collection<HumanitarianMark> humanitarianMarkCollection) {
        this.humanitarianMarkCollection = humanitarianMarkCollection;
    }

    public Collection<LanguageMark> getLanguageMarkCollection() {
        return languageMarkCollection;
    }

    public void setLanguageMarkCollection(Collection<LanguageMark> languageMarkCollection) {
        this.languageMarkCollection = languageMarkCollection;
    }

    public Collection<MaterialMark> getMaterialMarkCollection() {
        return materialMarkCollection;
    }

    public void setMaterialMarkCollection(Collection<MaterialMark> materialMarkCollection) {
        this.materialMarkCollection = materialMarkCollection;
    }

    public Collection<NativeMark> getNativeMarkCollection() {
        return nativeMarkCollection;
    }

    public void setNativeMarkCollection(Collection<NativeMark> nativeMarkCollection) {
        this.nativeMarkCollection = nativeMarkCollection;
    }

    public Collection<TimeTable> getTimeTables() {
        return timeTables;
    }

    public void setTimeTables(Collection<TimeTable> timeTables) {
        this.timeTables = timeTables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return id == subject.id && Objects.equals(nameOfSubject, subject.nameOfSubject) && Objects.equals(abbreviation, subject.abbreviation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameOfSubject, abbreviation);
    }
}
