package com.spring.diary.electronic.diary.dao;

import com.spring.diary.electronic.diary.entity.Homework;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HomeworkRepository extends CrudRepository<Homework, Integer> {

    List<Homework> findBySubject_IdAndGrade_Id(int student, int grade);

    List<Homework> findByGrade_Id( int grade);

}
