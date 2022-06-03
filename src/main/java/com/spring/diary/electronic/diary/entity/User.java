package com.spring.diary.electronic.diary.entity;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "access_key")
    private String accessKey;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "grade_id")
    private Grade grade;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "student")
    private Collection<ExactMark> exactMarkCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "student")
    private Collection<HumanitarianMark> humanitarianMarkCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "student")
    private Collection<LanguageMark> languageMarkCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "student")
    private Collection<MaterialMark> materialMarkCollection;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "student")
    private Collection<NativeMark> nativeMarkCollection;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(patronymic, user.patronymic) && Objects.equals(mobileNumber, user.mobileNumber) && Objects.equals(email, user.email) && Objects.equals(accessKey, user.accessKey) && Objects.equals(password, user.password) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, patronymic, mobileNumber, email, accessKey, password, role, grade);
    }
}

