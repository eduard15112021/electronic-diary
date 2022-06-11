package com.spring.diary.electronic.diary.dao;

import com.spring.diary.electronic.diary.entity.LanguageMark;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LanguageMarkRepository extends CrudRepository<LanguageMark, Integer> {

    List<LanguageMark> findBySubject_IdAndStudent_Id(int subject, int student);

    List<LanguageMark> findBySubject_Id(int subject);
}
