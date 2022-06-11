package com.spring.diary.electronic.diary.dao;

import com.spring.diary.electronic.diary.entity.ExactMark;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExactMarkRepository extends CrudRepository<ExactMark,Integer> {

    List<ExactMark> findBySubject_IdAndStudent_Id(int subject, int student);

    List<ExactMark> findBySubject_Id(int subject);
}
