package com.spring.diary.electronic.diary.dao;

import com.spring.diary.electronic.diary.entity.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, Integer> {
}
