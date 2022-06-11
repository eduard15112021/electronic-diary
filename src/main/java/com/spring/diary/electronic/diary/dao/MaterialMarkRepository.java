package com.spring.diary.electronic.diary.dao;

import com.spring.diary.electronic.diary.entity.MaterialMark;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MaterialMarkRepository extends CrudRepository<MaterialMark, Integer> {

    List<MaterialMark> findBySubject_IdAndStudent_Id(int subject, int student);

    List<MaterialMark> findBySubject_Id(int subject);
}
